package com.excel.utility;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * This class has been written for transforming excel to a plan object
 * 
 * @author Shilpa Date: 01/09/2019
 */

public class ExcelFileUtilityBackup {

	// Constants
	public  final String SAMPLE_XLSX_FILE_PATH = "filePath";
	public  final String TEST_DATA = "TestData";
	public  final String DATE_FORMAT = "yyyyMMdd";
	public  final String SKIP_FROM_SETTER = "TestData";
	public  Set<String> sheetNames = new HashSet<String>();
	public  Map<String, String> mapCreationConfig = new HashMap<String, String>();
	public static int filecount=1;

	// Initializing properties
	public  Properties prop = new Properties();
	 {
		this.readAllProperties();
		mapCreationConfig.put("SourceId", prop.getProperty("SourceId"));
		mapCreationConfig.put("planEligibilityId", prop.getProperty("planEligibilityId"));
		mapCreationConfig.put("sourceI", prop.getProperty("sourceI"));
	}

	// main method starts
	/*
	 * public void main(String[] args) throws Exception { readFile(); }
	 */

	/**
	 * This method reads the all the excel sheets
	 * 
	 * @return boolean
	 * @throws Exception
	 */
	 @Scheduled(fixedDelay = 1000)
	public  boolean readFile() throws Exception {

		String inputTestId = "TD001";
		File file=new File(prop.getProperty(SAMPLE_XLSX_FILE_PATH));
		FileInputStream excelFile = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
		storeAllSheetName(workbook);
		// Reading first sheet
		XSSFSheet sheet = workbook.getSheetAt(0);
		int totalRows = sheet.getPhysicalNumberOfRows();
		Map<String, Integer> sheetMap =this. readAllTheColumns(sheet);
		int inputTestIdIndex = getRowIndexForInputTestId(totalRows, sheet, sheetMap, inputTestId);

		if (inputTestIdIndex == Integer.MAX_VALUE) {
			System.out.println("Test Id not found");
			return false;
		}

		// Print PlanContext Object
		PlanContext planContext = setValuesInObject(sheet, inputTestIdIndex, sheetMap, workbook, inputTestId);
		printPlanContext(planContext);
		File moveFilePath=new File(prop.getProperty("movefilepath")+Calendar.getInstance().getTimeInMillis()+".xlsx");
		file.renameTo(moveFilePath);
		return true;
	}

	/**
	 * Method stores all the sheetName in a Set
	 * 
	 * @param workbook
	 * @return
	 */
	private  void storeAllSheetName(XSSFWorkbook workbook) {
		// Ignoring first sheet as it is the master sheet
		for (int i = 1; i < workbook.getNumberOfSheets(); i++) {
			sheetNames.add(workbook.getSheetName(i));
			// System.out.println(workbook.getSheetName(i));
		}
	}

	/**
	 * Method reads all the properties from config.properties file
	 * 
	 * @return
	 */
	private void readAllProperties() {

		String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		String appConfigPath = rootPath + "config.properties";
		try {
			prop.load(new FileInputStream(appConfigPath));
			System.out.println(prop.getProperty("filePath"));
		} catch (FileNotFoundException e) {
			System.err.println("FileNotFoundException:" + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("IOException:" + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("Exception:" + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Method returns Index for Input row ID where TestData Id matches This method
	 * will read only one row at a time where the TestData Id condition matches and
	 * break
	 * 
	 * @param totalRows
	 * @param sheet
	 * @param map
	 * @param inputTestId
	 * @return
	 */
	public  int getRowIndexForInputTestId(int totalRows, XSSFSheet sheet, Map<String, Integer> map,
			String inputTestId) {
		int inputTestIdIndex = Integer.MAX_VALUE;
		for (int x = 1; x <= totalRows; x++) {
			XSSFRow dataRow = sheet.getRow(x);
			try {
				XSSFCell cellValue = dataRow.getCell(map.get(TEST_DATA));
				if (String.valueOf(cellValue).equals(inputTestId)) {
					inputTestIdIndex = x;
					break;
				}
			} catch (Exception e) {
				System.err.println("Exception for row number " + x);
				continue;
			}

		}
		return inputTestIdIndex;
	}

	/**
	 * Method returns Index for Input Test Data Id. This method reads all the rows
	 * having Test Data Id and returns the list for all the matched conditions.
	 * 
	 * @param totalRows
	 * @param sheet
	 * @param map
	 * @param inputTestId
	 * @return
	 */
	public  List<Integer> getRowIndexForInputTestIds(int totalRows, XSSFSheet sheet, Map<String, Integer> map,
			String inputTestId) {
		List<Integer> ids = new ArrayList<Integer>();
		for (int x = 1; x <= totalRows; x++) {
			// get row 1 to row n (rows containing TestDataId ex:TD001)
			XSSFRow dataRow = sheet.getRow(x);
			if (dataRow == null) {
				continue;
			}
			try {
				XSSFCell cellValue = dataRow.getCell(map.get(TEST_DATA));
				if (checkIfNotNullOrEmpty(String.valueOf(cellValue)) && String.valueOf(cellValue).equals(inputTestId)) {
					ids.add(x);
				}
			} catch (Exception e) {
				System.err.println("Exception for row number " + x);
				continue;
			}

		}
		return ids;
	}

	/**
	 * This method is setting all the values to PlanContext
	 * 
	 * @param sheet
	 * @param inputTestIdIndex
	 * @param map
	 * @throws Exception
	 */
	public  PlanContext setValuesInObject(XSSFSheet sheet, int inputTestIdIndex, Map<String, Integer> map,
			XSSFWorkbook workbook, String inputTestId) throws Exception {

		PlanContext planContext = new PlanContext();
		XSSFRow dataRow = sheet.getRow(inputTestIdIndex);
		DataFormatter fmt = new DataFormatter();

		// Print all the Column values for the row starts
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			XSSFCell cellValue = dataRow.getCell(entry.getValue());

			// if the value is single value and from the same sheet starts
			if (sheetNames.contains(fmt.formatCellValue(cellValue))) {
				List<Object> objectsList = new ArrayList<Object>();
				Map<BigDecimal, Object> objectsMap = new HashMap<BigDecimal, Object>();
				String sheetName = fmt.formatCellValue(cellValue);
				String mapKeyConfigKey = null;
				XSSFSheet innerSheet = workbook.getSheet(sheetName);
				Map<String, Integer> innerMap = this.readAllTheColumns(innerSheet);
				int totalRows = innerSheet.getPhysicalNumberOfRows();
				List<Integer> ids = getRowIndexForInputTestIds(totalRows, innerSheet, innerMap, inputTestId);
				for (Integer rowsIndex : ids) {
					Class<?> cls = Class
							.forName("com.excel.utility." + prop.getProperty(fmt.formatCellValue(cellValue)));
					Object obj = cls.newInstance();
					XSSFRow innnerRow = innerSheet.getRow(rowsIndex);
					BigDecimal key = null;
					for (Map.Entry<String, Integer> innerEntry : innerMap.entrySet()) {
						if (SKIP_FROM_SETTER.contains(innerEntry.getKey())) {
							continue;
						}

						XSSFCell innerCellValue = innnerRow.getCell(innerEntry.getValue());
						String innerCellValueToString = fmt.formatCellValue(innerCellValue);
						String mapKeyConfigValue = mapCreationConfig.get(innerEntry.getKey());

						if (mapCreationConfig.containsKey(innerEntry.getKey()) && mapKeyConfigValue != null
								&& mapKeyConfigValue.toUpperCase().contains(sheetName.toUpperCase())) {
							try {

								mapKeyConfigKey = innerEntry.getKey();
								key = new BigDecimal(innerCellValueToString == null ? innerCellValueToString
										: innerCellValueToString.trim());
							} catch (NumberFormatException ex) {
								System.err.println("Ignoring row number " + rowsIndex + " for Sheet " + sheetName
										+ " because" + " Field " + innerEntry.getKey()
										+ " is BigDecimal and value is coming as null or empty");

							} catch (Exception e) {
								System.err.println(
										"failed for Sheet " + sheetName + " And variable " + innerEntry.getKey());

							}

						}

						setFielPropertyByReflection(obj, innerEntry.getKey(), innerCellValueToString);
					}

					if (mapCreationConfig.containsKey(mapKeyConfigKey)) {
						objectsMap.put(key, obj);
					} else {
						objectsList.add(obj);

					}

				}

				if (mapCreationConfig.containsKey(mapKeyConfigKey)) {
					setFielPropertyByReflection(planContext, entry.getKey(), objectsMap);
				} else {
					setFielPropertyByReflection(planContext, entry.getKey(), objectsList);
				}
			}
			// if the value is single value and from the same ends

			// if the values are from different sheets and need to be parsed starts
			else {
				setFielPropertyByReflection(planContext, entry.getKey(), String.valueOf(cellValue));
			}
			// if the values are from different sheets and need to be parsed ends

		}
		return planContext;
		// Print all the Column values for the row ends
	}

	/**
	 * This method sets all the fields value dynamically w.r.t the Ojbect Class.
	 * 
	 * @param obj
	 * @param fieldName
	 * @param fieldValue
	 * @throws Exception
	 */
	public  void setFielPropertyByReflection(Object obj, String fieldName, String fieldValue) throws Exception {
		Class ftClass = obj.getClass();
		if (fieldValue != null) {
			fieldValue = fieldValue.trim();
		}
		try {
			Field f1 = ftClass.getField(fieldName);
			f1.set(obj, castFieldValueToFieldDataType(f1, fieldValue));
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Exception for Class:" + obj);
		}
	}

	/**
	 * This method typecast the cellvalue to the desired field type.
	 * 
	 * @param f
	 * @param fieldValue
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ParseException
	 */
	private  Object castFieldValueToFieldDataType(Field f, String fieldValue)
			throws InstantiationException, IllegalAccessException, ParseException {
		if (f.getType().isInstance(new String())) {
			return new String(fieldValue);
		} else if (f.getType().isInstance(new BigDecimal(0)) && checkIfNotNullOrEmpty(fieldValue)) {
			return new BigDecimal(fieldValue);
		} else if (f.getType().isInstance(new Integer(0)) && checkIfNotNullOrEmpty(fieldValue)) {
			return new Integer(fieldValue);
		} else if (f.getType().isInstance(new Boolean(false)) && checkIfNotNullOrEmpty(fieldValue)) {
			return new Boolean(fieldValue);
		} else if (f.getType().isInstance(new Date()) && checkIfNotNullOrEmpty(fieldValue)) {
			return new SimpleDateFormat(DATE_FORMAT).parse(fieldValue);
		}

		return null;
	}

	/**
	 * @overload This method sets all the fields value dynamically w.r.t the Ojbect
	 *           Class.
	 * @param obj
	 * @param fieldName
	 * @param fieldValue
	 * @throws Exception
	 */
	public  void setFielPropertyByReflection(Object obj, String fieldName, Collection<?> fieldValue)
			throws Exception {
		Class ftClass = obj.getClass();
		Field f1 = ftClass.getField(fieldName);
		f1.set(obj, fieldValue);

	}

	/**
	 * @overload This method sets all the fields value dynamically w.r.t the Ojbect
	 *           Class.
	 * @param obj
	 * @param fieldName
	 * @param fieldValue
	 * @throws Exception
	 */
	public  void setFielPropertyByReflection(Object obj, String fieldName, Map<BigDecimal, Object> fieldValue)
			throws Exception {
		Class ftClass = obj.getClass();
		Field f1 = ftClass.getField(fieldName);
		f1.set(obj, fieldValue);

	}

	/**
	 * Reading all the columns and putting in Map Column name and column Index
	 * 
	 * @param sheet
	 * @return
	 */
	public Map<String, Integer> readAllTheColumns(XSSFSheet sheet) {
		//
		Map<String, Integer> map = new LinkedHashMap<String, Integer>(); // Create map
		XSSFRow firstRow = sheet.getRow(0); // Get first row
		try {
			short minColIx = firstRow.getFirstCellNum(); // get the first column index for a row
			short maxColIx = firstRow.getLastCellNum(); // get the last column index for a row
			for (short colIx = minColIx; colIx < maxColIx; colIx++) { // loop from first to last index
				XSSFCell cell = firstRow.getCell(colIx); // get the cell
				map.put(cell.getStringCellValue(), cell.getColumnIndex());
				// add the cell contents (name of column) and cell index to the map
			}
		} catch (Exception e) {
			System.err.println("Exception occured while parsing reading the row from sheet " + sheet.getSheetName());
		}

		return map;
	}

	// Print all the column values starts
	private  void printPlanContext(PlanContext planContext) throws Exception {

		System.out.println("TestData: " + planContext.getTestData());
		System.out.println("EffectiveDate: " + planContext.getEffectiveDate());
		System.out.println("accountNo:  " + planContext.getAccountNo());
		System.out.println("enrlProvGrpI: " + planContext.getEnrlProvGrpI());
		System.out.println("isPlanUnion: " + planContext.getIsPlanUnion());
		System.out.println("divisionRecordKeepingTypeCode" + planContext.getDivisionRecordKeepingTypeCode());
		System.out.println("mercerNonUnionPlan: " + planContext.getMercerNonUnionPlan());
		System.out.println("isMercerPlan: " + planContext.getIsMercerPlan());
		System.out.println("planYearMMDD: " + planContext.getPlanYearMMDD());
		System.out.println("ppaNoticeWaitPeriod: " + planContext.getPpaNoticeWaitPeriod());
		System.out.println("outsource:  " + planContext.getOutsrcService());
		System.out.println("EligibilityKitSourceRules: " + planContext.getEligibilityKitSourceRules());
		System.out.println("EligibilitySourceRules: " + planContext.getEligibilitySourceRules());
		System.out.println("ActivePlan Source : " + planContext.getActivePlanSource());
		System.out.println("personalQueueForAccount: " + planContext.getPersonalQueueForAccount());
		System.out.println("PlanEligibility: " + planContext.getPlanEligibility());
		System.out.println("planClasses: " + planContext.getPlanClasses());
		System.out.println("sourceClasses: " + planContext.getSourceClasses());
		System.out.println("planERRptData: " + planContext.getPlanERRptData());
		System.out.println("classId: " + planContext.getClassId());
		System.out.println("sourceId: " + planContext.getSourceId());
		System.out.println("allianceCode: " + planContext.getAllianceCode());
		System.out.println("outsrcDeferralDate: " + planContext.getOutsrcService());
		System.out.println("autoEnrollC: " + planContext.getAutoEnrollC());
		System.out.println("ssn: " + planContext.getSsn());
		System.out.println("partEnrlXref: " + planContext.getPartEnrlXref());
		System.out.println("Employees : " + planContext.getEmployee());
		System.out.println("participantName: " + planContext.getParticipantName());
		System.out.println("firstName: " + planContext.getFirstName());
		System.out.println("middleName: " + planContext.getMiddleName());
		System.out.println("lastName: " + planContext.getLastName());
		System.out.println("participantAddress: " + planContext.getParticipantAddress());
		System.out.println("Employee Period begin: " + planContext.getEmploymentPeriodBegin());
		System.out.println("payPeriodHours: " + planContext.getPayPeriodHours());
		System.out.println("partEnrlI: " + planContext.getPartEnrlI());
		System.out.println("partHistC: " + planContext.getPartHistC());
		System.out.println("rehireC: " + planContext.getRehireC());
		System.out.println("srcI: " + planContext.getSrcI());
		System.out.println("statC: " + planContext.getStatC());
	}

	public  boolean checkIfNotNullOrEmpty(String input) {

		return (input != null && !"null".equals(input) && !"".equals(input.trim())) ? true : false;

	}
}
