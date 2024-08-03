package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.tr.Ama;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import utility.AmazonBase;
import utility.TestContext;

public class AmazonDropdown {
    TestContext context;
    public AmazonDropdown(TestContext context){
        this.context = context;
    }

    @Given("get the dropdown values")
    public void dropdown(){
    context.pageObjectManager.getAmazonHomepage().getDropDownValue();
    }
    @Then("select value option")
    public void selectvalue(){
        context.pageObjectManager.getAmazonHomepage().selectGetDropDownvalue();
    }
}