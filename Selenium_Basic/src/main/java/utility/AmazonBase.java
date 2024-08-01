package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBase {

    public WebDriver getDriver(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://leafground.com/");
        return driver;

    }
}
