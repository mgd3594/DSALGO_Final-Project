
package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber; 

@RunWith(Cucumber.class)
@CucumberOptions (features={ "src/test/resources/features" }, 
glue= {"stepDefinitions","newalgoutilities"},
monochrome=true,
dryRun=false,

plugin={"pretty","html:target/htmlReports/report.html",
		"json:target/jsonReports/report.json",
		"junit:target/junitReports/report.xml"
})
public class TestRunner {

	
}