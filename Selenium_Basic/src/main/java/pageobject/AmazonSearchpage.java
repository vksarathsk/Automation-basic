package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AmazonSearchpage {
    WebDriver driver;

    public AmazonSearchpage(WebDriver driver){
        this.driver = driver;
    }

    public String vanigateNewSearchpage(){
      String getsearchpagevalue = driver.findElement(By.partialLinkText("SAMSUNG")).getText();
      return getsearchpagevalue;
    }
}
