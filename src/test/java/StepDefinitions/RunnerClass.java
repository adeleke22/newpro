package StepDefinitions;


import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Search.feature", 
glue={"StepDefinitions"}, 
monochrome= true,
	plugin=	{"pretty", "html:target/htmlReports/reports.HTML"} 
	)
public class RunnerClass {

}
