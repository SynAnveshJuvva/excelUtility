package com.excel.utility.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.excel.utility.ExcelFileUtilityBackup;

@Configuration
public class AppConfig {
	
	  @Bean public ExcelFileUtilityBackup getExcelFileUtilityBackup() { return new
			  ExcelFileUtilityBackup(); }
	 
}
