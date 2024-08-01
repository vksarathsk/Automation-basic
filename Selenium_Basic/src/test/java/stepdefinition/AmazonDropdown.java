package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.tr.Ama;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import utility.AmazonBase;

public class AmazonDropdown {
    WebDriver driver;
    WebElement dropdowns;
    AmazonBase AmazonBase;

    public AmazonDropdown(){

        AmazonBase = new AmazonBase();

    }



//    @Given("user navigate to Amazon home page")
//    public void open_amazon(){
//        driver = new ChromeDriver();
//        driver.get("https://www.amazon.in/");
//    }


    @When("get the dropdown values")
    public void dropdown(){

        driver = AmazonBase.getDriver();

        dropdowns = driver.findElement(By.id("searchDropdownBox"));
        int dropdownsize = dropdowns.findElements(By.tagName("option")).size();
        for (int i=0; i<dropdownsize; i++){
          String values = dropdowns.findElements(By.tagName("option")).get(i).getText();
          System.out.println(values);
        }
    }
    @And("select value option")
    public void selectvalue(){
        Select s = new Select(dropdowns);
        s.selectByIndex(2);
    }
}