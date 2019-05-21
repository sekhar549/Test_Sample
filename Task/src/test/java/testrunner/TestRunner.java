package testrunner;

import cucumber.api.CucumberOptions;



@CucumberOptions(
		features = "./src/test/resources/features/",
		glue = "stepdefs",
		plugin = "json:target/cucumber-reports/CucumberTestReport.json")

public class TestRunner {

}
