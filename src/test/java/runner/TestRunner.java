package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportingConfig;

@RunWith(Cucumber.class)
@CucumberOptions(
		
features = "classpath:features", // C:\\New Eclipse Projects\\com.myproject\\src\\test\\resources\\features",
glue = "stepDefinitions", //"src\\test\\java\\stepDefinitions",
tags = "@Desktops",  // we can put here stepDefinition file path here or its name. 
dryRun = false, // when we test we must type false here. 
strict = true,
monochrome = true,
plugin = {         // this plugin is used to create report for us. 
		"pretty",
		"html:target/site/cucumber-pretty",
		"json:target/cucumber.json"
},
publish = true
	
)
public class TestRunner {
		
		@AfterClass
		public static void generatReport() {
			CucumberReportingConfig.reportConfig();
			
}

}