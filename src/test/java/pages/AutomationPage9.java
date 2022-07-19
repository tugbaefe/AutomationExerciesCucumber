package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage9 {
    public AutomationPage9(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//input[@id='search_product']")
    public WebElement searchProduct;
    @FindBy(xpath = "//i[@class='fa fa-search']")
    public WebElement searchButon;
    @FindBy (xpath = "//h2[@class='title text-center']")
    public WebElement searchAllProducts;
    @FindBy(xpath = "//div[@class='product-image-wrapper']")
    public WebElement visibleProduct;

}
