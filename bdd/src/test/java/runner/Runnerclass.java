package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "BddTest/hooks.feature", 
glue={"stepDefinitions","hooks"}, 
dryRun = false, 
monochrome =true, 
plugin = {"html:reports/htmlreport", "json:reports/jsonreport.json"}, 
tags = "@hooks"
)
/*
 * use tags="~@tag1" to avoid executing a file 
 * Tags can be used at feature file level and scenario level
 * Club and be done using both "and"/"or" tags, Example: "@Tags","Tag2" or "@Tag1,@Tag2"
*/

public class Runnerclass {

}
