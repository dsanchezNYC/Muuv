package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.*;
import cucumber.api.CucumberOptions;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features={"resources"},
            glue={"stepDefinition"},
            plugin={"html:target/selenium-reports"})

    public class runner {

    }
