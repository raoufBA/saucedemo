package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "steps",
        plugin = {"pretty", "html:target/cucumber-report/cucumber-html-report"}
//        tags = "@login and @logout"
)
public class TestRunner {
}
