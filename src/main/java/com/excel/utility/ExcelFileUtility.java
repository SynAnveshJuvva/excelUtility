package com.excel.utility;
/*
 * package com.test.excel.utility;
 * 
 * import java.io.File; import java.io.FileInputStream; import
 * java.lang.reflect.Field; import java.math.BigDecimal; import
 * java.text.ParseException; import java.text.SimpleDateFormat; import
 * java.util.ArrayList; import java.util.Collection; import java.util.Date;
 * import java.util.HashMap; import java.util.LinkedHashMap; import
 * java.util.List; import java.util.Map;
 * 
 * import org.apache.poi.ss.usermodel.DataFormatter; import
 * org.apache.poi.xssf.usermodel.XSSFCell; import
 * org.apache.poi.xssf.usermodel.XSSFRow; import
 * org.apache.poi.xssf.usermodel.XSSFSheet; import
 * org.apache.poi.xssf.usermodel.XSSFWorkbook;
 * 
 * import com.test.excel.model.PlanContext;
 * 
 * public class ExcelFileUtility {
 * 
 * public static final String SAMPLE_XLSX_FILE_PATH =
 * "C:\\Users\\Ankit Kumar\\Downloads\\TestData1.xlsx"; public static final
 * String TEST_DATA = "TestData"; public static final String DATE_FORMAT =
 * "yyyyMMdd"; public static final String SKIP_FROM_SETTER = "TestData"; public
 * static final String SOURCE_ID_KEY = "sourceId"; public static final String
 * VARIABLE_CONFIG_TO_CREATE_MAP = "EligSourceRule|EligKitSourceRule";
 * 
 * public static Map<String, Object> dataTypeMap = new HashMap<String,
 * Object>();
 * 
 * 
 * public static void main(String[] args) throws Exception { readFile(); }
 * 
 * 
 * public boolean readFile(String filePath) { // Creating a Workbook from an
 * Excel file (.xls or .xlsx) starts // Workbook workbook =
 * WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));
 * //System.out.println("Enter Test Id"); //Scanner sc = new Scanner(System.in);
 * //String inputTestId = sc.nextLine();// "TD001"; boolean methodSuccess=false;
 * try { String inputTestId = "TD001"; FileInputStream excelFile = new
 * FileInputStream(new File(filePath)); XSSFWorkbook workbook = new
 * XSSFWorkbook(excelFile);
 * 
 * // Reading first sheet XSSFSheet sheet = workbook.getSheetAt(0); int
 * totalRows = sheet.getPhysicalNumberOfRows();
 * 
 * ExcelFileUtility excelFileUtility = new ExcelFileUtility(); Map<String,
 * Integer> sheetMap = excelFileUtility.readAllTheColumns(sheet); int
 * inputTestIdIndex = getRowIndexForInputTestId(totalRows, sheet, sheetMap,
 * inputTestId);
 * 
 * if (inputTestIdIndex == Integer.MAX_VALUE) {
 * System.out.println("Test Id not found"); return false;
 * 
 * } // Print all the column values starts PlanContext planContext =
 * setValuesInObject(sheet, inputTestIdIndex, sheetMap, workbook);
 * System.out.println(planContext); // Print all the column values ends
 * methodSuccess=true; }catch(Exception e) { e.printStackTrace();
 * methodSuccess=false; }
 * 
 * 
 * return methodSuccess; }
 * 
 *//**
	 * Method returns Index for Input row ID
	 * 
	 * @param totalRows
	 * @param sheet
	 * @param map
	 * @param inputTestId
	 * @return
	 */
/*
 * private int getRowIndexForInputTestId(int totalRows, XSSFSheet sheet,
 * Map<String, Integer> map, String inputTestId) { int inputTestIdIndex =
 * Integer.MAX_VALUE; for (int x = 1; x <= totalRows; x++) { XSSFRow dataRow =
 * sheet.getRow(x); // get row 1 to row n (rows containing data) try { XSSFCell
 * cellValue = dataRow.getCell(map.get(TEST_DATA)); if
 * (String.valueOf(cellValue).equals(inputTestId)) { inputTestIdIndex = x;
 * break; } } catch (Exception e) { //
 * System.out.println("Exception for row number " + x); continue; }
 * 
 * } return inputTestIdIndex; }
 * 
 *//**
	 * Method returns Index for Input row ID
	 * 
	 * @param totalRows
	 * @param sheet
	 * @param map
	 * @param inputTestId
	 * @return
	 */
/*
 * private List<Integer> getRowIndexForInputTestIds(int totalRows, XSSFSheet
 * sheet, Map<String, Integer> map, String inputTestId) { List<Integer> ids =
 * new ArrayList<Integer>(); for (int x = 1; x <= totalRows; x++) { XSSFRow
 * dataRow = sheet.getRow(x); // get row 1 to row n (rows containing data) try {
 * XSSFCell cellValue = dataRow.getCell(map.get(TEST_DATA)); if
 * (String.valueOf(cellValue).equals(inputTestId)) { ids.add(x); } } catch
 * (Exception e) { // System.out.println("Exception for row number " + x);
 * continue; }
 * 
 * } return ids; }
 * 
 *//**
	 * 
	 * @param sheet
	 * @param inputTestIdIndex
	 * @param map
	 * @throws Exception
	 *//*
		 * private PlanContext setValuesInObject(XSSFSheet sheet, int inputTestIdIndex,
		 * Map<String, Integer> map, XSSFWorkbook workbook) throws Exception {
		 * PlanContext planContext = new PlanContext(); ExcelFileUtility
		 * excelFileUtility = new ExcelFileUtility(); XSSFRow dataRow =
		 * sheet.getRow(inputTestIdIndex); // Print all the Column values for the row
		 * starts for (Map.Entry<String, Integer> entry : map.entrySet()) { XSSFCell
		 * cellValue = dataRow.getCell(entry.getValue()); String[] arraySplit =
		 * String.valueOf(cellValue).split("\\|"); // if the value is single value and
		 * from the same sheet starts if (arraySplit.length > 1) { List<Object>
		 * objectsList = new ArrayList<Object>(); Map<BigDecimal, Object> objectsMap =
		 * new HashMap<BigDecimal, Object>(); String sheetName = arraySplit[0]; String
		 * id = arraySplit[1]; XSSFSheet innerSheet = workbook.getSheet(sheetName);
		 * Map<String, Integer> innerMap =
		 * excelFileUtility.readAllTheColumns(innerSheet); int totalRows =
		 * innerSheet.getPhysicalNumberOfRows(); List<Integer> ids =
		 * getRowIndexForInputTestIds(totalRows, innerSheet, innerMap, id); for (Integer
		 * rowsIndex : ids) { Class<?> cls = Class.forName("com.test.excel.model." +
		 * capitailizeWord(sheetName)); Object obj = cls.newInstance(); XSSFRow
		 * innnerRow = innerSheet.getRow(rowsIndex); // sheetName //
		 * System.out.println(capitailizeWord(sheetName));
		 * 
		 * BigDecimal key = null; for (Map.Entry<String, Integer> innerEntry :
		 * innerMap.entrySet()) { if (SKIP_FROM_SETTER.contains(innerEntry.getKey())) {
		 * continue; } XSSFCell innerCellValue =
		 * innnerRow.getCell(innerEntry.getValue()); DataFormatter fmt = new
		 * DataFormatter(); String innerCellValueToString =
		 * fmt.formatCellValue(innerCellValue); if
		 * (VARIABLE_CONFIG_TO_CREATE_MAP.contains(sheetName) &&
		 * SOURCE_ID_KEY.equalsIgnoreCase(innerEntry.getKey())) { try { key = new
		 * BigDecimal(innerCellValueToString == null ? innerCellValueToString :
		 * innerCellValueToString.trim()); } catch (Exception e) { System.out.println(
		 * "failed for Sheet " + sheetName + " And variable " + innerEntry.getKey());
		 * 
		 * }
		 * 
		 * }
		 * 
		 * setFielPropertyByReflection(obj, innerEntry.getKey(),
		 * innerCellValueToString); // System.out.println(planContext); }
		 * 
		 * if (VARIABLE_CONFIG_TO_CREATE_MAP.contains(sheetName)) { objectsMap.put(key,
		 * obj); } else { objectsList.add(obj);
		 * 
		 * }
		 * 
		 * }
		 * 
		 * if (VARIABLE_CONFIG_TO_CREATE_MAP.contains(sheetName)) {
		 * setFielPropertyByReflection(planContext, entry.getKey(), objectsMap); } else
		 * { setFielPropertyByReflection(planContext, entry.getKey(), objectsList); }
		 * 
		 * // System.out.println("Need to split " + entry.getKey()); } // if the value
		 * is single value and from the same ends
		 * 
		 * // if the values are from different sheets and need to be parsed starts else
		 * { setFielPropertyByReflection(planContext, entry.getKey(),
		 * String.valueOf(cellValue)); } // if the values are from different sheets and
		 * need to be parsed ends
		 * 
		 * } return planContext; // Print all the Column values for the row ends }
		 * 
		 * private void setFielPropertyByReflection(Object obj, String fieldName, String
		 * fieldValue) throws Exception { Class ftClass = obj.getClass(); if (fieldValue
		 * != null) { fieldValue = fieldValue.trim(); } try { Field f1 =
		 * ftClass.getField(fieldName); f1.set(obj, castFieldValueToFieldDataType(f1,
		 * fieldValue)); } catch (Exception e) { e.printStackTrace();
		 * System.out.println(obj); } }
		 * 
		 * private Object castFieldValueToFieldDataType(Field f, String fieldValue)
		 * throws InstantiationException, IllegalAccessException, ParseException { if
		 * (f.getType().isInstance(new String())) { return new String(fieldValue); }
		 * else if (f.getType().isInstance(new BigDecimal(0))) { return new
		 * BigDecimal(fieldValue); } else if (f.getType().isInstance(new Integer(0))) {
		 * return new Integer(fieldValue); } else if (f.getType().isInstance(new
		 * Boolean(false))) { return new Boolean(fieldValue); } else if
		 * (f.getType().isInstance(new Date())) { return new
		 * SimpleDateFormat(DATE_FORMAT).parse(fieldValue); }
		 * 
		 * return null; }
		 * 
		 * private void setFielPropertyByReflection(Object obj, String fieldName,
		 * Collection<?> fieldValue) throws Exception { Class ftClass = obj.getClass();
		 * Field f1 = ftClass.getField(fieldName); f1.set(obj, fieldValue);
		 * 
		 * }
		 * 
		 * private void setFielPropertyByReflection(Object obj, String fieldName,
		 * Map<BigDecimal, Object> fieldValue) throws Exception { Class ftClass =
		 * obj.getClass(); Field f1 = ftClass.getField(fieldName); f1.set(obj,
		 * fieldValue);
		 * 
		 * }
		 * 
		 * private Map<String, Integer> readAllTheColumns(XSSFSheet sheet) { // Reading
		 * all the columns and putting in Map Column name and Index starts Map<String,
		 * Integer> map = new LinkedHashMap<String, Integer>(); // Create map XSSFRow
		 * firstRow = sheet.getRow(0); // Get first row short minColIx =
		 * firstRow.getFirstCellNum(); // get the first column index for a row short
		 * maxColIx = firstRow.getLastCellNum(); // get the last column index for a row
		 * for (short colIx = minColIx; colIx < maxColIx; colIx++) { // loop from first
		 * to last index XSSFCell cell = firstRow.getCell(colIx); // get the cell
		 * map.put(cell.getStringCellValue(), cell.getColumnIndex()); // add the cell
		 * contents (name of column) and cell index to the map } return map; // Reading
		 * all the columns and putting in Map Column name and Index end }
		 * 
		 * private String capitailizeWord(String str) { StringBuffer s = new
		 * StringBuffer(); s.append(Character.toUpperCase(str.charAt(0))); for (int i =
		 * 1; i < str.length(); i++) { s.append(str.charAt(i)); } // Return the string
		 * with trimming return s.toString().trim(); }
		 * 
		 * 
		 * }
		 */