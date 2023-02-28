package Stepdefinations;


import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Users/gandepudi.jayakumar/eclipse-workspace/Cucumberdemo2/src/test/resources/Features",

glue = {"Stepdefinations"},
monochrome = true,
plugin = {"pretty","junit:target/JUnitReports/report.xml",
		"html:target/HtmlReports/HtmlReports.html",
		"json:target/Jsonreports/reports.json"},
		//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                   tags="@retest"
)


public class Testrunner {
 
}




