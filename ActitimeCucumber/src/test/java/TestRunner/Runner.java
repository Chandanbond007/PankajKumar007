package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features ="C:\\Users\\mechr\\OneDrive\\Desktop\\Cucumber\\ActitimeCucumber\\src\\test\\java\\ActititmeFeature\\featurefile.feature",			
		glue="StepDefination",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/cucumber-reports/reports1_html.html"}
		
		)
public class Runner {

}