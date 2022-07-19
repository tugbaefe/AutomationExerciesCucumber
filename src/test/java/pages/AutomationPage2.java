package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage2 {
    public AutomationPage2(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[text()='Login to your account']")
    public WebElement loginaccount;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement emailLogin;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement passwordLogin;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement clickLogin;

    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement loggedText;

    @FindBy(xpath = "(//a[@style='color:brown;'])[2]")
    public WebElement deleteAccount;

    @FindBy(xpath = "//h1")
    public WebElement accountDeleteVisible;
}
