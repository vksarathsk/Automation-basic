package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeLoginpage {

    WebDriver driver;

    @Given("User is on OrangeHRM login page")
    public void Login_Page (){
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("Verify the login page")
    public void Verify_Login_age(){

        System.out.println("Placeholder");
    }

    @And("User enter the {string} and {string}")
    public void Verify_Login_Credential(String Username, String Password){

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Username);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Password);
    }

    @Then("Click the Login button")
    public void ClickLoginbutton(){

       // driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @And("User is navigated to Dashboard page")
    public void navigated_Dashboard_Page(){
        System.out.println("123");

    }

}
