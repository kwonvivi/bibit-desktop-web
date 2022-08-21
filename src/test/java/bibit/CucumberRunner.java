package bibit;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue = {"stepdefs"}, features = {"src/test/resources/bibit/features"})

public class CucumberRunner extends AbstractTestNGCucumberTests {

}
