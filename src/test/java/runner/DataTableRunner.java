package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".\\Features\\LoginHashMap.feature"
        ,glue={"HashMapStepsDef"},
        format={"pretty", "html:REPORTS/cucumber.html","json:REPORTS/cucumber.json"},
        dryRun = false
)
public class DataTableRunner {
}
