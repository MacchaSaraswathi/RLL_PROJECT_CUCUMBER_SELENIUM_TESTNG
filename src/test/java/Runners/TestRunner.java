package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = { "C:\\Users\\Thilak\\eclipse-workspace\\COM.OPENRMS.CUCUMBER\\OPENMRS.CUCUMBER\\src\\test\\resources\\Features\\Login1.feature" }, 
                  glue = { "stepDefinitions" }, 
                  monochrome = true, plugin = {
		          "html:target/cucumber-html-report/cucumber.html"
		           })

public class TestRunner extends AbstractTestNGCucumberTests{

	    
	}



