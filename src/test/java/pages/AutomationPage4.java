package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage4 {
    public AutomationPage4(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()=' Logout']")
    public WebElement logoutButon;

    @FindBy(xpath = "//section[@id='form']")
    public WebElement loginPage;
}
