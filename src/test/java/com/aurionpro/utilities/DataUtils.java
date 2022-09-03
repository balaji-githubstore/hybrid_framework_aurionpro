package com.aurionpro.utilities;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataUtils {
	
	
	@DataProvider
	public Object[][] commonDataProvider(Method method) throws IOException
	{
		//testmethod name is the sheetname
		String sheetName=method.getName();
		
		Object[][] main= ExcelUtils.getSheetIntoTwoDimensionalArray("test_data/OpenEMRData.xlsx", sheetName);
		return main;
	}

	

//	@DataProvider
//	public Object[][] validCredentialData() {
//		Object[][] main = new Object[2][3];
//
//		main[0][0] = "admin";
//		main[0][1] = "pass";
//		main[0][2] = "OpenEMR";
//
//		main[1][0] = "accountant";
//		main[1][1] = "accountant";
//		main[1][2] = "OpenEMR";
//
//		return main;
//	}
//
//	@DataProvider
//	public Object[][] invalidCredentialData() {
//		Object[][] main = new Object[2][3];
//
//		main[0][0] = "john";
//		main[0][1] = "john123";
//		main[0][2] = "Invalid username or password";
//
//		main[1][0] = "kim";
//		main[1][1] = "kim3";
//		main[1][2] = "Invalid username or password";
//
//		return main;
//	}

}
