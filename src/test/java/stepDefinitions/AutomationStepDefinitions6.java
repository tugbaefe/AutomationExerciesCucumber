package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.AutomationPage6;
import utilities.Driver;

import java.security.KeyFactorySpi;

public class AutomationStepDefinitions6 {
    AutomationPage6 automationPage6=new AutomationPage6();
    Actions actions=new Actions(Driver.getDriver());


    @Then("Click on Contact Us button")
    public void click_on_contact_us_button() {
        automationPage6.contactUsButon.click();


    }
    @Then("Verify GET IN TOUCH is visible")
    public void verify_get_ın_touch_is_visible() {
        Assert.assertTrue(automationPage6.getInTouch.isDisplayed());

    }
    @Then("Enter name, email, subject and message")
    public void enter_name_email_subject_and_message() {
        actions.click(automationPage6.getGetInTouchName).sendKeys("efe").sendKeys(Keys.TAB).
                sendKeys("efetugba1515@gmail.com").sendKeys(Keys.TAB).sendKeys("Test Cases").
                sendKeys(Keys.TAB).sendKeys("Test Cases very good!").perform();



    }

    @Then("Upload file")
    public void upload_file() {
        String dosyaYolu="C:\\Users\\efetu\\Desktop\\lambda";
        //wait.until(ExpectedConditions.visibilityOf(automationPage6.fileChoose));
        automationPage6.fileChoose.sendKeys(dosyaYolu);


    }
    @Then("Click Submit button")
    public void click_submit_button() {
        automationPage6.submit.click();

    }
    @Then("Click OK button")
    public void click_ok_button() {
        Driver.getDriver().switchTo().alert().accept();

    }
    @Then("Verify success message Success! Your details have been submitted successfully. is visible")
    public void verify_success_message_success_your_details_have_been_submitted_successfully_is_visible() {
    Assert.assertTrue(automationPage6.submitted.isDisplayed());
    }
    @Then("Click Home button and verify that landed to home page successfully")
    public void click_home_button_and_verify_that_landed_to_home_page_successfully() {
        Assert.assertTrue(automationPage6.homePage.isDisplayed());

    }


}
