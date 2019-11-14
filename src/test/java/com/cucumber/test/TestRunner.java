package com.cucumber.test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src\\test\\resources\\features")//(features="", tags="")-> tags means to select particular file
public class TestRunner extends AbstractTestNGCucumberTests{
 
}
