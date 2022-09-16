package runner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
		 features = "src/main/Feature/login.feature"
         , glue = "stepDefinition"
		//,plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		//monochrome = true
		)
public class LoginTestRunner {

}
