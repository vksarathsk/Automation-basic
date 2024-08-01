package seleniumsetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {
    public static void main(String[] args) {
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://www.google.com/");
        Driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
        Driver.findElement(By.className("gNO89b")).click();
    }
}
