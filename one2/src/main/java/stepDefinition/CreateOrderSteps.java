package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObject.CreateOrder;
import pageObject.LoginPage;
import utils.TestBase;

public class CreateOrderSteps extends TestBase {
	public CreateOrderSteps() {
		
	}
   LoginPage Login = new LoginPage(driver);
   CreateOrder Order = new CreateOrder(driver);

	@When("^User is loged in$")
	public void user_is_loged_in() throws Throwable{
		driver.get("https://omsclient.kitchen.dvg-lc.com");
		Login.user_name().sendKeys("admin1");
		Login.pass_word().sendKeys("123456");
		Login.login_button().click();
	}
	
   @Given("^User click on create order from front site$")
   public void ClickOnCreateOrder() {
   	Order.create_order().click();
   }
   @And ("^User enters valid name$")
   public void user_enters_valid_name() throws Throwable {
   	Order.Enter_name().sendKeys("Van_test_auto");
   }
   @When("^User enters valid phone$")
   public void user_enters_valid_phone() throws Throwable {
   	Order.Enter_phone().sendKeys("0974297304");
   	Order.Enter_deliver_phone().sendKeys("0974297304");
   }
@When("^User enters valid Address$")
   public void user_enters_valid_Address() throws Throwable {
   	Order.Enter_Address().sendKeys("909/4, Trường Chinh, Phường Tây Thạnh, Quận Tân Phú, Tây Thạnh, Tân Phú, Thành phố Hồ Chí Minh, Vietnam");
   }
@When("^User enters valid date$")
public void user_enters_valid_date() throws Throwable {
	Order.SelectDistrict().click();
	
}

}
