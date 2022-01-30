package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/Feature/Activity1_5.feature",
glue= {"step_definition"},
tags = "@activity1_5",
plugin = {"pretty","html:target/cucumber-reports/reports" }, 
monochrome = true)
public class ActivitiesRunner {

}
