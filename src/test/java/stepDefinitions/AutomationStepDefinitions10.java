package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage10;
import utilities.Driver;

public class AutomationStepDefinitions10 {

    AutomationPage10 automationPage10=new AutomationPage10();
    Actions actions=new Actions(Driver.getDriver());

    @Then("Scroll down to footer")
    public void scroll_down_to_footer() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,600)");


    }


    @Then("Enter email address in input and click arrow button")
    public void enter_email_address_in_input_and_click_arrow_button() {

        actions.click(automationPage10.emailGir).
                sendKeys("efetugba1515@gmail.com").perform();
        automationPage10.emailGirClick.click();

    }


    @And("Verify text SUBSCRIPTION")
    public void verifyTextSUBSCRIPTION() {
        Assert.assertTrue(automationPage10.subcriptionText.isDisplayed());
    }

    @And("Verify success message You have been successfully subscribed! is visible")
    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {
        Assert.assertTrue(automationPage10.succesfullMail.isDisplayed());
    }


}