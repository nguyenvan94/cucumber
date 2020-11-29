package utils;
import org.openqa.selenium.Point;

import java.awt.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension ;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowersFatory {

	private static WebDriver currentDriver = null;
	
	//get current driver running 
	public static WebDriver getcurrentDriver(){
		if(currentDriver == null){
			currentDriver = BrowersFatory.createBrower();
			
		}
		return currentDriver;
		
	}

	private static WebDriver createBrower() {
	WebDriver driver;
	driver = createChromeDriver();
	addAllBrowerSetup(driver);
		return driver;
	}

	private static void addAllBrowerSetup(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().setPosition(new Point(0, 0));
        java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dim = new Dimension((int) screenSize.getWidth(), (int) screenSize.getHeight());
        driver.manage().window().setSize(dim);
		
	}

	private static WebDriver createChromeDriver() {
	System.setProperty("webdriver.chrome.driver", "src/main/config/chromedriver.exe");
		return new ChromeDriver();
	}
	//Close current brower
	public static void closecurrentBrower(){
		if(currentDriver != null){
			currentDriver.quit();
		}
		  currentDriver = null;
	}
	
}
