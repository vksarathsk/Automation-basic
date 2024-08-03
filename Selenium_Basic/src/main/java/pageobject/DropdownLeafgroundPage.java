package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownLeafgroundPage {

    WebDriver driver;
    public DropdownLeafgroundPage(WebDriver driver) {
        this.driver = driver;
    }

    public void DropdownPage(){
        driver.findElement(By.id("menuform:j_idt40")).click();
        driver.findElement(By.linkText("Dropdown")).click();
    }
    public void FavoriteUIAutomationTool(String SelectTool){
        WebElement dropdown = driver.findElement(By.className("ui-selectonemenu"));
        Select select = new Select(dropdown);
        select.selectByVisibleText(SelectTool);
    }
}
