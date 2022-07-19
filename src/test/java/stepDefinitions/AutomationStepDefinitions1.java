package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.animation.model.KeyframeStyle;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage1;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationStepDefinitions1 {
    AutomationPage1 automationPage1=new AutomationPage1();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();

    @Given("navigate to {string}")
    public void navigateTo(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }




    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue(automationPage1.homePage.isDisplayed());

    }
    @Then("Click on Signup Login button")
    public void click_on_button() {
       automationPage1.login.click();


    }
    @Then("Verify New User Signup! is visible")
    public void verify_is_visible() {
        Assert.assertTrue(automationPage1.newUserSignUp.isDisplayed());

    }
    @Then("Enter name and email address")
    public void enter_name_and_email_address() {
        actions.click(automationPage1.name).sendKeys(faker.name().name()).
                sendKeys(Keys.TAB).
                sendKeys(faker.internet().emailAddress()).perform();



    }
    @Then("Click Signup button")
    public void click_button() {
        automationPage1.sigInButon.click();

    }
    @Then("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verify_that_is_visible() {
        Assert.assertTrue(automationPage1.enterAccount.isDisplayed());

    }
    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {
        actions.click(automationPage1.gender).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
               // sendKeys(Keys.TAB).
                sendKeys(faker.internet().password()).
                sendKeys(Keys.TAB).
                sendKeys("12").sendKeys(Keys.TAB).sendKeys("April").sendKeys(Keys.TAB).
                sendKeys("2000").perform();
    }
    
    @Then("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
        actions.click(automationPage1.firstName).
                sendKeys(faker.name().firstName()).
                sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).
                sendKeys(Keys.TAB).
                sendKeys(faker.company().name()).
                sendKeys(Keys.TAB).
                sendKeys(faker.address().fullAddress()).
                sendKeys(Keys.TAB).sendKeys(faker.address().city()).
                sendKeys(Keys.TAB).
                sendKeys("Canada").
                sendKeys(Keys.TAB).
                sendKeys(faker.address().state()).
                sendKeys(Keys.TAB).
                sendKeys(faker.address().city()).
                sendKeys(Keys.TAB).
                sendKeys(faker.address().zipCode()).
                sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().phoneNumber()).perform();

    }
    @Then("Click Continue button")
    public void click() {
        automationPage1.continueNuton.click();

    }
    @Then("Verify that {string} is visible and click {string} button")
    public void verify_that_is_visible_and_click_button() {
        automationPage1.loggedText.isDisplayed();

    }



    @And("Select checkbox Sign up for our newsletter!")
    public void selectCheckboxSignUpForOurNewsletter() {
        automationPage1.checkBox1.click();

    }

    @And("Select checkbox Receive special offers from our partners!'")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
        automationPage1.checkBox2.click();
    }



    @And("Verify that ACCOUNT CREATED! is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {
        Assert.assertTrue(automationPage1.accountCreat.isDisplayed());
    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @And("Page closed")
    public void pageClosed() {
        Driver.closeDriver();
    }

    @And("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {
        automationPage1.deleteAccountText.isDisplayed();
    }

    @And("Click Delete Account buttons")
    public void clickDeleteAccountButtons() {
        automationPage1.deleteAccount.click();
    }

    @And("Click Create Account button")
    public void clickCreateAccountButton() {automationPage1.creatAccount.click();
    }
}
