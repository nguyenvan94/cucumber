package utils;

import org.openqa.selenium.WebDriver;

import stepDefinition.Hooks;

public class TestBase {

 public static WebDriver driver;
 public TestBase(){
	 this.driver = Hooks.getDriver();
 }
 
}
