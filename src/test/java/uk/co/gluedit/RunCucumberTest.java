package uk.co.gluedit;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {
                "uk.co.gluedit.pmux",
                "uk.co.gluedit.webby"
        }
)
public class RunCucumberTest {
}
