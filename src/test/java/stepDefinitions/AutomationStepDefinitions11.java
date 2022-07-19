package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage11;
import utilities.Driver;

public class AutomationStepDefinitions11 {
    AutomationPage11 automationPage11=new AutomationPage11();

    @And("Click Cart button")
    public void clickCartButton() {
        automationPage11.cartButon.click();

    }


}
