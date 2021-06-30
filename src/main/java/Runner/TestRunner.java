package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:Features", glue = { "StepDefinitions" }, format = { "pretty",
		"html:target/cucumber" })
public class TestRunner {

}
