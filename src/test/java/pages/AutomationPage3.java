package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage3 {
    public AutomationPage3(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement emailLogin;

    @FindBy(xpath = "//*[text()='Your email or password is incorrect!']")
    public WebElement incorrectVisible;

}
