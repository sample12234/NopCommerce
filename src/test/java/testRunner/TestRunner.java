package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features={".//Features/Login.features",".//Features/Login.features"} mutiple features
		     features=".//Features/Customers.feature",
		     glue="stepDefinations",
		     dryRun=false,//give true it check every step have method or not, false it will go browser execute
		     monochrome=true,//it will remove unneccesary cahracters in consloe
		     plugin= {"pretty","html:test-output"}//output result ver clearly by pretty
		     
		)
public class TestRunner {

}
