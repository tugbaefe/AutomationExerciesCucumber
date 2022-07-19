package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage5;
import utilities.Driver;

public class AutomationStepDefinitions5 {
    AutomationPage5 automationPage5=new AutomationPage5();
    Actions actions=new Actions(Driver.getDriver());

    @And("Enter name and already registered email address")
    public void enterNameAndAlreadyRegisteredEmailAddress() {
       actions.click(automationPage5.name).sendKeys("efe").
               sendKeys(Keys.TAB).sendKeys("efetugba1515@gmail.com").
               sendKeys(Keys.TAB).click().perform();

    }

    @And("Verify error Email Address already exist! is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible() {
        Assert.assertTrue(automationPage5.nameEmailVisible.isDisplayed());

    }
}
