package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageobject.AmazonHomepage;
import pageobject.AmazonSearchpage;
import utility.AmazonBase;
import utility.TestContext;

public class SearchAmazon {
    WebDriver driver;
    TestContext context;

    public SearchAmazon(TestContext context){
        this.context = context;
    }

    @When("select the dropdown value for {string}")
    public void selectDropdownValue(String DropdownValue) {

        context.pageObjectManager.getAmazonHomepage().selectDropdownValue(DropdownValue);
    }

    @And("user enter the value {string}")
    public void userEnterTheValue(String SearchValue) {
        context.pageObjectManager.getAmazonHomepage().enterSearchValue(SearchValue);
    }

    @Then("click the search icon")
    public void clickSearchIcon() {
        context.pageObjectManager.getAmazonHomepage().clickSearchButton();
    }

    @And("User is navigated the search page")
    public void navigatedSearchPage() {
        String searchresultsoutput = context.pageObjectManager.getAmazonSearchpage().vanigateNewSearchpage();
       Assert.assertEquals("SAMSUNG GALAXY S23 FE 5G (MINT 128 GB STORAGE) (8 GB RAM)", searchresultsoutput);
    }
}
