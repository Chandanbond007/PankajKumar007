package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions 

(
		features ="C:\\Users\\mechr\\OneDrive\\Desktop\\Cucumber\\Cucumber\\src\\test\\java\\Feature\\Featurefile.feature",			
		glue="StepDefination",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/cucumber-reports/Login-report_html.html"}
		//stepNotifications = true 
)


public class TestRunner
{
	

}
