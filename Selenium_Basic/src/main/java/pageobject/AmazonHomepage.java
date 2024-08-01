package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AmazonHomepage {

    WebDriver driver;
    WebElement element;

    public AmazonHomepage(WebDriver driver){
        this.driver = driver;
    }


    public void selectDropdownValue(String DropdownValue){
        element = driver.findElement(By.id("searchDropdownBox"));
        Select dropdowncetogery = new Select(element);
        dropdowncetogery.selectByVisibleText(DropdownValue);
    }

    public void enterSearchValue(String SearchValue){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(SearchValue);
    }

    public void clickSearchButton(){

        driver.findElement(By.id("nav-search-submit-button")).click();
    }
}
