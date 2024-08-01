package seleniumsetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpath {
    public static void main(String[] args) {
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://www.amazon.in/");
        Driver.findElement(By.xpath("//input [@type='text']")).sendKeys("iPhone");
        Driver.findElement(By.xpath("//input [@type='submit']")).click();

    }
}
