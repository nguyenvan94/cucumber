package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginPage {
 public static WebDriver driver;
 public static WebElement element;
 
 public LoginPage(WebDriver driver){
	 this.driver = driver;
	 
 }
 public static WebElement user_name(){
	 element = driver.findElement(By.xpath("//input[@name='UserName']"));
	return element;
	 
 }
 public static WebElement pass_word(){
	 return element = driver.findElement(By.xpath("//input[@name='Password']"));
 }
	
 public static WebElement login_button(){
	 return element = driver.findElement(By.xpath("//button[@type='button']"));
 }
	
 public static WebElement login_success(){
	 return element = driver .findElement(By.xpath(".//span[@class='ng-star-inserted']"));
 }
 public static WebElement login_unsucess() {
	 return element = driver .findElement(By.xpath(".//p[@class='notifier__notification-message ng-star-inserted']"));
 }
}
