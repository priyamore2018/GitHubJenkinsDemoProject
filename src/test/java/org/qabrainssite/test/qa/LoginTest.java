package org.qabrainssite.test.qa;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/Features/qabrainslogin.feature",
		glue = "org.qabrainssite.pages.qa",
		plugin = {"pretty","html:target/cucumber-reports.html" ,"json:target/cucumber-reports.json"
				
		}
		
		
		)
public class LoginTest extends AbstractTestNGCucumberTests{
	

}
