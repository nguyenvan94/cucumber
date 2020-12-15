package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateOrder {

	WebDriver driver;
	WebElement element;
	
	public  CreateOrder(WebDriver driver) {
		this.driver= driver;
	}
	
	public WebElement create_order() {
		element = driver.findElement(By.xpath(".//a[@href=\"/order/update\"]"));
		return element;
		
	}
	public WebElement Enter_phone() {
		element = driver.findElement(By.xpath(".//input[@id=\"CustomerPhone\"]"));
	   return element;
	}
	public WebElement Enter_deliver_phone() {
		element = driver.findElement(By.xpath(".//input[@id=\"DeliveryPhone\"]"));
	   return element;
	}
    public WebElement Enter_name() {
    	element = driver.findElement(By.xpath(".//input[@id=\"CustomerName\"]"));
	   return element;
   }
    public WebElement Enter_Address() {
    	element = driver.findElement(By.xpath(".//input[@id=\"DeliveryAddress\"]"));
    	return element;
    }
    public WebElement SelectDistrict() {
    	element = driver.findElement(By.xpath(".//select[@id=\'ddlDistrict\']"));
    	return element;
    }
}


