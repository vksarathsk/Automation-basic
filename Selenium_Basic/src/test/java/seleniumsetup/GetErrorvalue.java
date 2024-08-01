package seleniumsetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetErrorvalue {
    public static void main(String[] args) {
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://login.salesforce.com/");
        Driver.findElement(By.xpath("//input [@type='email']")).sendKeys("Sarath");
        Driver.findElement(By.xpath("//input [@type='password']")).sendKeys("qwerty123");
        Driver.findElement(By.xpath("//input [@type='submit']")).click();
        String error = Driver.findElement(By.id("error")).getText();
        System.out.println(error);
    }
}
