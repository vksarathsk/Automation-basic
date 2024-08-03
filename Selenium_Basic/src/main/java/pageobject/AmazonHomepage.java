package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AmazonHomepage {

    WebDriver driver;
    WebElement element;
    WebElement dropdowns;

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
    public void getDropDownValue(){
        dropdowns = driver.findElement(By.id("searchDropdownBox"));
        int dropdownsize = dropdowns.findElements(By.tagName("option")).size();
        for (int i=0; i<dropdownsize; i++){
            String values = dropdowns.findElements(By.tagName("option")).get(i).getText();
            System.out.println(values);
        }
    }
    public void selectGetDropDownvalue(){
        WebElement dropdownsvalue = driver.findElement(By.id("searchDropdownBox"));
        Select s = new Select(dropdownsvalue);
        s.selectByVisibleText("Under ₹500");
    }

}
