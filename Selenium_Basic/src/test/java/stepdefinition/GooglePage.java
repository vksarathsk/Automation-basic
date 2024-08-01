package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePage {

    WebDriver driver;

    @Given("user is on google search page")
    public void googlePage(){
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
    @When("user enter a {string} in search box")
    public void searchField(String selenium ){
        driver.findElement(By.id("APjFqb")).sendKeys(selenium);
    }
    @And("hits enter")
    public void searchButton(){
        driver.findElement(By.name("btnK")).click();
    }
    @Then("user is navigated to search results")
    public void results(){
      driver.findElement(By.partialLinkText("Selenium")).click();
    }
}

