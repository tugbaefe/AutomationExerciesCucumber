package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutomationPage8;

public class AutomationStepDefinitions8 {
    AutomationPage8 automationPage8=new AutomationPage8();

    @Then("Click on Products button")
    public void click_on_products_button() {
        automationPage8.productsButon.click();

    }
    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() {
        Assert.assertTrue(automationPage8.allProdcuts.isDisplayed());

    }
    @Then("The products list is visible")
    public void the_products_list_is_visible() {
        Assert.assertTrue(automationPage8.productsList.isDisplayed());

    }
    @Then("Click on View Product of first product")
    public void click_on_view_product_of_first_product() {
        automationPage8.firstProduct.click();

    }
    @Then("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {
        Assert.assertTrue(automationPage8.productDetail.isDisplayed());

    }
    @Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand() {
        Assert.assertTrue(automationPage8.productName.isDisplayed());
        Assert.assertTrue(automationPage8.category.isDisplayed());
        Assert.assertTrue(automationPage8.price.isDisplayed());
        Assert.assertTrue(automationPage8.availabilitiy.isDisplayed());
        Assert.assertTrue(automationPage8.condition.isDisplayed());
        Assert.assertTrue(automationPage8.brand.isDisplayed());

    }


}
