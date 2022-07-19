package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage2;
import utilities.Driver;

public class AutomationStepDefinitions2 {
    AutomationPage2 automationPage2=new AutomationPage2();
    Faker faker=new Faker();
    Actions actions=new Actions(Driver.getDriver());

    @Then("Verify Login to your account is visible")
    public void verify_login_to_your_account_is_visible() {
        automationPage2.loginaccount.isDisplayed();


    }

    @Then("Enter correct email address and password")
    public void enter_correct_email_address_and_password() {
        actions.click(automationPage2.emailLogin).sendKeys("ydu82@hotmail.com").
                sendKeys(Keys.TAB).sendKeys("123456").perform();



    }

    @Then("Click login button")
    public void click_login_button() {
        automationPage2.clickLogin.click();

    }

    @Then("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {
        Assert.assertTrue(automationPage2.loggedText.isDisplayed());

    }

    @Then("Click Delete Account button")
    public void click_delete_account_button() {
        automationPage2.deleteAccount.click();

    }

    @Then("Verify that ACCOUNT DELETED! is visible")
    public void verify_that_account_deleted_is_visible() {
        Assert.assertTrue(automationPage2.accountDeleteVisible.isDisplayed());

    }



}
