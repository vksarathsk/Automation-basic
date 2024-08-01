package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.TestCase;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utility.TestContext;

public class AlertLeafground {
    TestContext context;

    public AlertLeafground(TestContext context){
        this.context = context;
    }

    @Given("Go to the Alert model page")
    public void AlertModelPage(){
        context.pageObjectManager.AlertLeafgroundPage().GotoAlertModelPage();
    }
    @And("click the Show button for Alert Simple Dialog")
    public void clickTheShowButtonForAlertSimpleDialog() {
        context.pageObjectManager.AlertLeafgroundPage().clickShowButtonForAlertSimpleDialog();
    }

    @When("get the Alert model text")
    public void getTheAlertModelText() {
        context.pageObjectManager.AlertLeafgroundPage().getTheSimpledialogAlertModelText();
    }

    @And("Accept the Alert Model")
    public void acceptTheAlertModel() {
        context.pageObjectManager.AlertLeafgroundPage().acceptTheAlertModel();
    }

    @Then("Verify the UI text")
    public void verifyTheUIText() {

        Assert.assertEquals("You have successfully clicked an alert" ,context.pageObjectManager.AlertLeafgroundPage().verifyTheAlertsimpleDialogUIText());

    }
}
