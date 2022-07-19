package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage6 {
    public AutomationPage6(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()=' Contact us']")
    public WebElement contactUsButon;
    @FindBy(xpath = "(//h2[@class='title text-center'])[2]")
    public WebElement getInTouch;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement getGetInTouchName;
    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement fileChoose;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submit;
    @FindBy(xpath = "//div[@class='status alert alert-success']")
    public WebElement submitted;
    @FindBy(xpath = "//div[@class='header-middle']//div[@class='col-sm-4']")
    public WebElement homePage;
}
