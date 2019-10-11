package AutomationFramework.runner;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import AutomationFramework.pageObjects.MasterPage;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(features = { "src/test/java/AutomationFramework/features" }, glue = {
		"AutomationFramework.steps" }, monochrome = true, tags = {}, plugin = { "pretty", "html:target/cucumber",
				"json:target/cucumber.json", "com.cucumber.listener.ExtentCucumberFormater:target/report.html" })

public class MainRunner extends AbstractTestNGCucumberTests {
	@AfterClass
	public static void writeExtentReport() throws IOException {
		Reporter.loadXMLConfig(
				new File(System.getProperty("user.dir") + "\\src\\main\\java\\utils\\ReportsConfig.xml"));
		MasterPage.copyLatestExtentReport();
	}
}
