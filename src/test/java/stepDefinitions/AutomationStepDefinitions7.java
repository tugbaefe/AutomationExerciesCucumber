package stepDefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.AutomationPage7;

public class AutomationStepDefinitions7 {
    AutomationPage7 automationPage7=new AutomationPage7();

    @And("Click on Test Cases button")
    public void clickOnTestCasesButton() {
        automationPage7.testCases.click();

    }

    @And("Verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {
        Assert.assertTrue(automationPage7.testCasesVisible.isDisplayed());
    }
}
