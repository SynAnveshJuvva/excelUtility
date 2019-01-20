package com.test.excel.utility;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.excel.utility.ExcelFileUtilityBackup;
import com.excel.utility.config.AppConfig;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfig.class,loader=AnnotationConfigContextLoader.class)
public class ExcelFileUtileJunit {

	@Autowired
	private ExcelFileUtilityBackup excelFileUtilityBackup;

	static String filePath = null;

	@BeforeClass
	public static void setUp() {

		System.out.println("-----> SETUP <-----");
//	  filePath="C:\\Users\\Ankit Kumar\\Downloads\\TestData1.xlsx";
		filePath = "C:\\Users\\396566\\Downloads\\junit-spring-example\\junit-spring-example\\src\\test\\resources\\TestData1.xlsx";
	}

	@Test
	public void testSampleServiceGetAccountDescription() {
		boolean result = false;
		try {
			result = excelFileUtilityBackup.readFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertTrue(result);
	}

	@AfterClass
	public static void afterTest() {
		System.out.println("-----> DESTROY <-----");
	}
}
