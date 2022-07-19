package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutomationPage4;

public class AutomationStepDefinitions4 {
    AutomationPage4 automationPage4=new AutomationPage4();


    @Then("Verify that user is navigated to login page")
    public void verify_that_user_is_navigated_to_login_page() {
        Assert.assertTrue(automationPage4.loginPage.isDisplayed());

    }

    @And("Click Logout button")
    public void clickLogoutButton() {
        automationPage4.logoutButon.click();
    }


}
