package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage8 {
    public AutomationPage8(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()=' Products']")
    public WebElement productsButon;
    @FindBy(xpath = "//img[@alt='Website for practice']")
    public WebElement allProdcuts;
    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement productsList;
    @FindBy(xpath = "(//*[text()='View Product'])[1]")
    public WebElement firstProduct;
    @FindBy(xpath = "//*[text()='Write Your Review']")
    public WebElement productDetail;
    @FindBy(xpath = "//*[text()='Category: Women > Tops']")
    public WebElement category;
    @FindBy(xpath = "(//h2)[3]")
    public WebElement productName;
    @FindBy(xpath = "//*[text()='Rs. 500']")
    public WebElement price;
    @FindBy(xpath = "//*[text()='Availability:']")
    public WebElement availabilitiy;
    @FindBy(xpath = "//*[text()='Condition:']")
    public WebElement condition;
    @FindBy(xpath = "//*[text()='Brand:']")
    public WebElement brand;


}
