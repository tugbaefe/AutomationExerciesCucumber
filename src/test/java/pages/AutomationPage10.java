package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage10 {
    public AutomationPage10(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    public WebElement subcriptionText;

    @FindBy(xpath = "//input[@id='susbscribe_email']")
    public WebElement emailGir;

    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    public WebElement emailGirClick;

    @FindBy(xpath = "//div[@class='alert-success alert']")
    public WebElement succesfullMail;

}
