package manager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObject.CreateOrder;
import pageObject.LoginPage;
public class managerPageObject {
WebDriver driver;
private CreateOrder createorder;

	public void managePageObject(WebDriver driver){
		this.driver= driver;
	}
	
	public CreateOrder getCreateOrder() {
		return (createorder==null)? createorder= new CreateOrder(driver): createorder;
	}
}
