package stepDefinition;
import utils.TestBase;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import pageObject.LoginPage;


public class LoginStep extends TestBase {
public LoginStep(){
	}

LoginPage Login = new LoginPage(driver);
@Given("^User navigates to Login page of front site$")
public void Navigatetopage(){
	driver.get("https://omsclient.kitchen.dvg-lc.com");
}

@When("^User enters valid  account at front site$")
public void user_enters_valid_account_at_front_site() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Login.user_name().sendKeys("admin1");

}
/*
@And("^User enters valid account at front site$")
public void EntervalidAccountAtFronsite() throws Exception{
		Login.user_name().sendKeys("admin1");
}*/
@And("^User enters valid password at front site$")
public void user_enters_valid_password_at_front_site()throws Throwable{
	Login.pass_word().sendKeys("123456");

}
@And("^User clicks on Login button at front site$")
public void ClickonLoginButtonAtFronsite(){
	Login.login_button().click();
}
@Then("^User login successfully into front site$")
public void LoginSuccessfullyIntoFronsite(){
	String AlertActual = Login.login_success().getText();
	Assert.assertEquals("Trang chủ", AlertActual);
}

@When("^User enters admin(\\d+) at front site$")
public void User_enter_user_at_front_site(String username) throws Throwable{
	Login.user_name().sendKeys(username);
}
@When ("^User enters (\\d+) at front site$")
public void Use_enter_pass_at_front_site(String password) throws Throwable{
	Login.pass_word().sendKeys(password);
}
@When ("^User clicks Login button$")
public void Click_on_Login_Button()throws Throwable{
	Login.login_button().click();
}
@When ("^Show err messenger$")
public void Show_err_messenger(){
	String AlertActual2 = Login.login_unsucess().getText();
	Assert.assertEquals("Tên đăng nhập hoặc mật khẩu không chính xác", AlertActual2);
}



}
