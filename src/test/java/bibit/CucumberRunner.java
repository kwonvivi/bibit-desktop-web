package kompas;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue = {"stepdefs"}, features = {"src/test/resources/kompas/features"})

public class CucumberRunner extends AbstractTestNGCucumberTests {

}
