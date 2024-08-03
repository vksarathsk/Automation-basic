package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utility.TestContext;

public class DropdownLeafground {
    TestContext context;

    public DropdownLeafground(TestContext context){
        this.context = context;
    }

    @Given("Go to the Drodown page")
    public void dropdownPage(){
        context.pageObjectManager.getDropdownLeafgroundpage().DropdownPage();
    }

    @Then("Select favorite UI Automation tool {string}")
    public void FavoriteUIAutomationTool(String SelectTool) {
        context.pageObjectManager.getDropdownLeafgroundpage().FavoriteUIAutomationTool(SelectTool);
    }
}
