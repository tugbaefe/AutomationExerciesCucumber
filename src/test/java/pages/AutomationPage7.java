package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage7 {
    public AutomationPage7(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()=' Test Cases']")
    public WebElement testCases;
    @FindBy(xpath = "//*[text()='Below is the list of test Cases for you to practice the Automation. Click on the scenario for detailed Test Steps:']")
    public WebElement testCasesVisible;
}
