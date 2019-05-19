package testrunner;

import cucumber.api.CucumberOptions;



@CucumberOptions(
		features = "./src/test/resources/features/",
		glue = "stepdefs")

public class TestRunner {

}
