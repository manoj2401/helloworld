package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "/Users/manoj/eclipse-workspace/HackHireHomeLoanEligibility/src/test/java/features/homeloan.feature", //the path of the feature files
			glue={"stepDefinition"}, //the path of the step definition files			
			dryRun = false,
			monochrome = true,
			plugin = {"html:target/cucumber-html-report.html", "json:target/cucumber-json-report.json"},
			tags= {"@SmokeTest"}
			)
	 
	 
	public class TestRunner {
	 
	}