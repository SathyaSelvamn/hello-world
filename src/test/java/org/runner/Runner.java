package org.runner;


import java.io.File;

import org.junit.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "./testhelp/test1.feature",
		glue = "testPack",
		dryRun = false,
		plugin = "com.cucumber.listener.ExtentCucumberFormatter:reports/html/ExtentReport.html,pretty",
		monochrome = true
	
		)

public class Runner extends AbstractTestNGCucumberTests {
@AfterClass
public static void setup() {
	Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
	Reporter.setSystemInfo("User Name", "Sathya");
	Reporter.setSystemInfo("Application Name", "Facebook");
	Reporter.setSystemInfo("Environment", "Production");
	Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
}


}
