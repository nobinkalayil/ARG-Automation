package com.mavenit.selenium.training;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", dryRun = false, strict = true,tags = "@reg", plugin = "json:target/cucumber.json")

public class CucumberRunner {

}
