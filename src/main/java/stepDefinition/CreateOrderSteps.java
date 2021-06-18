package stepDefinition;

import java.util.concurrent.TimeUnit;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
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
   @When ("^User enters information customer$")
   public void user_enters_information_customer() throws Throwable {
   	Order.fillinfo_order();
   	try { Thread.sleep(5000);}
    catch (InterruptedException e) {}
   }
   
   @And("^User enters valid date$")
   public void user_enters_valid_date() throws Throwable {
	 Order.PickDate().click();
	 Thread.sleep(3000);
     Order.setDate().click();
   }
   /*
   @When ("^User enters valid name$")
   public void user_enters_valid_name() throws Throwable {
   	Order.Enter_name().sendKeys("Van_test_auto");
   }
   @And("^User enters valid phone$")
   public void user_enters_valid_phone() throws Throwable {
   	Order.Enter_phone().sendKeys("0974297304");
   }
   @And("^User enters deliver phone$")
   public void user_enters_deliver_phone() throws Throwable {
   	Order.Enter_deliver_phone().sendKeys("0974297304");
   }
   @And("^User enters valid Address$")
   public void user_enters_valid_Address() throws Throwable {
   	Order.Enter_Address().sendKeys("909/4, Trường Chinh, Phường Tây Thạnh, Quận Tân Phú, Tây Thạnh, Tân Phú, Thành phố Hồ Chí Minh, Vietnam");
   }
   @And("^User Select valid district$")
   public void User_Select_valid_district() throws Throwable {
	Order.SelectDistrict();
	 }
   @And("^User Select valid Ward$")
   public void user_Select_valid_Ward() throws Throwable {
      Order.SelectWard();
   }
      @And("^User Select valid SourceType$")
   public void user_Select_valid_SourceType() throws Throwable {
      Order.sourceType();
    
   }
   */
   @And("^User Select a dish at order$")
   public void user_Select_a_dish_at_order() throws Throwable {
       Order.search().sendKeys("SƯỜN NƯỚNG SỐT THƠM");
       Order.button_search().click();
       Order.pickdish().click();
     
   }
   @And("^User clicks on Search kitchen button$")
   public void user_clicks_on_Search_kitchen_button() throws Throwable {
      Order.Kitchen().click();
      try { Thread.sleep(5000);}
      catch (InterruptedException e) {}
   }

   @And("^User clicks on Create order button$")
   public void user_clicks_on_Create_order_button() throws Throwable {
       Order.Create_order_button().click();
       try { Thread.sleep(5000);}
       catch (InterruptedException e) {}
   }

   @Then("^User Create a order successfully into list$")
   public void user_Create_a_order_successfully_into_list() throws Throwable {
    
       
   }
}
