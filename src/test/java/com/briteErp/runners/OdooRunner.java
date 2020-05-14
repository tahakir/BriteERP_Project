package com.briteErp.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/briteErp/step_definitions",
        features = "src/test/resources/features",
        dryRun = false,
        strict = false,
        tags = "@create_event",
        plugin = {
                "html:target/default-report",
                "json:target/cucumber1.json",
                "rerun:target/rerun.txt"
        }

)

public class OdooRunner {
}
