package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
	public void Enter_phone(String phone) {
		element = driver.findElement(By.xpath(".//input[@id=\"CustomerPhone\"]"));
	    element.sendKeys(phone);
	}
	public void Enter_deliver_phone(String phone2) {
		element = driver.findElement(By.xpath(".//input[@id=\"DeliveryPhone\"]"));
	    element.sendKeys(phone2);
	}
    public void Enter_name(String customername) {
    	element = driver.findElement(By.xpath(".//input[@id=\"CustomerName\"]"));
	    element.sendKeys(customername);
   }
    public void Enter_Address(String Address) {
    	element = driver.findElement(By.xpath(".//input[@id=\"DeliveryAddress\"]"));
    	element.sendKeys(Address);
    }
    public WebElement PickDate() {
    	element = driver.findElement(By.xpath(".//input[@name=\"DeliverDateStr\"]"));
    	return element;
    	
    }
    public WebElement setDate() {
    	element = driver.findElement(By.xpath(".//span[contains(.,'Set')]"));
    	return element;
    	
    }
    public WebElement ListDistrict() {
    	element = driver.findElement(By.xpath(""));
    	return element;
    }
    public void Select_District (String districtname) {
      Select drpDistrict = new Select(driver.findElement(By.xpath(".//select[@id=\'ddlDistrict\']")));
    	//return drpDistrict;
    	 drpDistrict.selectByVisibleText(districtname);
    
    }
    public void SelectWard(String ward) {
    	Select drpward = new Select(driver.findElement(By.xpath(".//select[@name=\"ddlWard\"]")));
    	drpward.selectByVisibleText(ward);
    
    }
    public void sourceType(String source) {
    	Select drpsourceType = new Select(driver.findElement(By.xpath(".//select[@name=\"ddlSourceType\"]")));
    	drpsourceType.selectByVisibleText(source);
    
    }
    public WebElement search() {
    	 return element = driver.findElement(By.xpath(".//input[@name=\"SearchProductModel.Keyword\"]"));
         
    }
    public WebElement button_search() {
   	 return element = driver.findElement(By.xpath(".//i[@class=\"fa fa-search\"]"));
        
   }
    
    public WebElement pickdish() {
   	 return element = driver.findElement(By.xpath(".//a[@class=\"btn btn-primary btn-sm ng-star-inserted\"]"));

   }
    
    public WebElement Kitchen() {
    	 return element = driver.findElement(By.xpath(".//button[contains(.,'Tìm bếp chính')]"));
    	
    }
    public WebElement Create_order_button() {
    	
          return element = driver.findElement(By.xpath(".//button[contains(.,'Tạo đơn')]"));
    }
    public void fillinfo_order() {
    	Enter_phone("0582857608");
    	Enter_deliver_phone("0582857608");
    	Enter_name("Van_auto");
    	Enter_Address("909/4, Trường Chinh, Phường Tây Thạnh, Quận Tân Phú, Tây Thạnh, Tân Phú, Thành phố Hồ Chí Minh, Vietnam");
    	Select_District("Quận 1");
    	SelectWard("Phường Phạm Ngũ Lão");
    	sourceType("Chat facebook");
    }
    
}


