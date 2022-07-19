package stepDefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage9;
import utilities.Driver;

public class AutomationStepDefinitions9 {
    AutomationPage9 automationPage9=new AutomationPage9();
    Actions actions=new Actions(Driver.getDriver());



    @Then("Enter product name in search input and click search button")
    public void enter_product_name_in_search_input_and_click_search_button() {
        actions.click(automationPage9.searchProduct).sendKeys("Sleeveless Dress").perform();
        automationPage9.searchButon.click();


    }

    @Then("Verify all the products related to search are visible")
    public void verify_all_the_products_related_to_search_are_visible() {
        Assert.assertTrue(automationPage9.visibleProduct.isDisplayed());


    }

    @And("Verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {
        Assert.assertTrue(automationPage9.searchAllProducts.isDisplayed());

    }
}
