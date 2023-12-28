package StepDefs;

import com.bdd_practise.BaseClass;
import com.bdd_practise.PageObjects.LoginPage;
import com.bdd_practise.Utils.PropertiesUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class LoginStepDefs extends BaseClass {

    Properties properties = PropertiesUtil.loadApplicationProperties();


    @Given("User enters valid username")
    public void userEntersValidUsername() {
        String username = properties.get("username").toString();
        LoginPage.enterUserName(username);
    }

    @And("User enters valid password")
    public void userEntersValidPassword() {
        String password = properties.get("password").toString();
        LoginPage.enterPassword(password);
    }

    @When("User clicks on Login button")
    public void userClicksOnLoginButton() {
        LoginPage.clickLogin();
    }

    @Then("User is logged in successfully")
    public void userIsLoggedInSuccessfully() {
    }

    @Given("User enters invalid username")
    public void userEntersInvalidUsername() {
    }

    @And("User enters invalid password")
    public void userEntersInvalidPassword() {
    }
}
