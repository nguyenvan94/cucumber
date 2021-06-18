package stepDefinition;
import cucumber.api.Scenario;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.BrowersFatory;

public class Hooks {
private static final Logger LOGGER =  Logger.getLogger(Hooks.class.getName());
public static WebDriver driver;
public static WebDriver getDriver(){
	return driver;
	
}
@Before
public void BeforeScenario() {
	  BasicConfigurator.configure();
    try {
    	
        driver = BrowersFatory.getcurrentDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    } catch (Exception ex) {
        LOGGER.error(ex.getMessage(), ex);
    }
}

/*@After
public void AfterScenario(Scenario scenario) {
BrowersFatory.closecurrentBrower();
}*/

}
