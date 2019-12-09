package com.unsplash.cucumber;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/screenPlayFeatures",
        tags = { "@regression" },
        glue = { "com.unsplash.cucumber.steps" }
)
public class CukesScreenPlayTestSuite {}
