package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage1 {
    public AutomationPage1(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='header-middle']//div[@class='col-sm-4']")
    public WebElement homePage;

    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    public WebElement login;

    @FindBy(xpath = "//*[text()='New User Signup!']")
    public WebElement newUserSignUp;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement name;

    @FindBy(xpath = "//button[normalize-space()='Signup']")
    public WebElement sigInButon;

    @FindBy(xpath = "//*[text()='Enter Account Information']")
    public WebElement enterAccount;

    @FindBy(xpath = "//input[@id='id_gender2']")
    public WebElement gender;

    @FindBy(xpath = "//button[normalize-space()='Create Account']")
    public WebElement creatAccount;

    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement accountCreat;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement continueNuton;

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    public WebElement checkBox1;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement checkBox2;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement loggedText;

    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
    public WebElement deleteAccount;

    @FindBy(xpath = "//h1")
    public WebElement deleteAccountText;
}
