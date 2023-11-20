package com.Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.BaseClass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Umesh R\\eclipse-workspace\\Cucumber\\src\\test\\java\\com\\Feature\\Lime.feature",
glue = "com.step",
monochrome = true,
dryRun = false,
strict = true,
tags = "@smoketest",
plugin = {"pretty",
	
		"json:Resources/lime.json",
		"html:Res/limeroad.html",
    	"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}
)
		

public class Test_Runner extends BaseClass{
	@BeforeClass
	public static void launchBrowser() {
	  launchbrowser("firefox");

	}
	

}
