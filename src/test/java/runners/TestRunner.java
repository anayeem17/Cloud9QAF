package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
	
		features = "Features",
		glue = "steps",
		tags = "@googleSearch",
	    plugin = "pretty" ,
	    monochrome = true
		
		
		
		)




public class TestRunner extends AbstractTestNGCucumberTests {

}
