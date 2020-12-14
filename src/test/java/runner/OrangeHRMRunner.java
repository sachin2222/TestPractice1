package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".\\Features\\HooksTest.feature"
        ,glue={"hooks"},
        format={"pretty", "html:REPORTS/cucumber.html","json:REPORTS/cucumber.json"},
        dryRun = false,
        tags={"~@Smoke","~@Regression","~@End2End"},
        monochrome = true
)
public class OrangeHRMRunner {
}
