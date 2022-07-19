package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage5 {
    public AutomationPage5(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement name;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement emailadress;
    @FindBy(xpath = "//p[normalize-space()='Email Address already exist!']")
    public WebElement nameEmailVisible;
}
