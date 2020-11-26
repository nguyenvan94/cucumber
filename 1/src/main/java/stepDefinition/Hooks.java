package stepDefinition;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Hooks {
private static final Logger LOGGER =  Logger.getLogger(Hooks.class);
public static WebDriver driver;
public static WebDriver getDriver(){
	return driver;
	
}

}
