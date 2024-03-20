package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features ="C:\\Users\\mechr\\OneDrive\\Desktop\\Cucumber\\HospitalManagement\\src\\test\\java\\HMFeature\\HMFile.feature",
		glue="StepDefination",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/cucumber-reports/HMreports1_html.html"}
		
		)

public class Runner 
{

}
