package com.aurionpro.test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class DemoExtent {

	public static void main(String[] args) {
		
		//run at the start - only once
		ExtentReports extent = new ExtentReports();
		
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		
		
		//create test
		ExtentTest test= extent.createTest("MyFirstTest");
		
		test.log(Status.INFO, "Entered Username");
		
		//log the test passed or fail
		test.log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");
		
		
		
		//at the end -  - only once
		extent.flush();
	}

}
