package stepDefinition;
import utils.TestBase;
import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LoginPage;


public class LoginStep extends TestBase {
public LoginStep(){
	}

LoginPage Login = new LoginPage(driver);
@Given("User navigates to Login page of front site")
public void Navigatetopage(){
	driver.get("https://omsclient.kitchen.dvg-lc.com");
}

@And("^User enters valid account at front site0$")
public void EntervalidAccountAtFronsite(){
	
	Login.user_name().sendKeys("admin");
	
}

@And("User enters valid password at front site")
public void EntervalidPasswordAtFronsite(){
	Login.pass_word().sendKeys("123456");
}
@And("User clicks on Login button at front site")
public void ClickonLoginButtonAtFronsite(){
	Login.login_button().click();
}
@Then("User login successfully into front site")
public void LoginSuccessfullyIntoFronsite(){
	String AlertActual = Login.login_success().getText();
	Assert.assertEquals("Trang chủ", AlertActual);
}


		
}
