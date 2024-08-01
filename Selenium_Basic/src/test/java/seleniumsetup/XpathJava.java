package seleniumsetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathJava {
    public static void main(String[] args) {
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://www.google.com/");
        Driver.findElement(By.xpath("//textarea [@name='q']")).sendKeys("Selenium");
        Driver.findElement(By.xpath("//input [@type='submit']")).click();
    }
}
