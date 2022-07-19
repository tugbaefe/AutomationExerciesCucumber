package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.junit.runner.manipulation.Ordering;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage3;
import utilities.Driver;

public class AutomationStepDefinitions3 {
    AutomationPage3 automationPage3=new AutomationPage3();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();

    @And("Enter incorrect email address and password")
    public void enterIncorrectEmailAddressAndPassword() {
        actions.click(automationPage3.emailLogin).sendKeys(faker.internet().emailAddress()).
                sendKeys(Keys.TAB).sendKeys(faker.internet().password()).sendKeys(Keys.TAB).click().perform();

    }


    @And("Verify error Your email or password is incorrect! is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        Assert.assertTrue(automationPage3.incorrectVisible.isDisplayed());
    }
}
