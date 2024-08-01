package seleniumsetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginBlogspot {
    public static void main(String[] args) {
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://learnmoreplayground.blogspot.com/p/loginpage.html");
        Driver.findElement(By.id("username")).sendKeys("LearnMore");
        Driver.findElement(By.id("password")).sendKeys("learnmore@123");
        //Driver.findElement()

    }
}
