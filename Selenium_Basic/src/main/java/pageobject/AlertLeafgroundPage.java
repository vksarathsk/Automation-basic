package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertLeafgroundPage {
    public WebDriver driver;

    public AlertLeafgroundPage(WebDriver driver){
        this.driver = driver;
    }

    public void GotoAlertModelPage(){
        driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
        driver.findElement(By.linkText("Alert")).click();
    }
    public void clickShowButtonForAlertSimpleDialog(){
        driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']/child::span[2]")).click();
    }
    public String getTheSimpledialogAlertModelText(){
      String getalertModelText = driver.switchTo().alert().getText();
      return getalertModelText;
    }
    public void acceptTheAlertModel(){
        driver.switchTo().alert().accept();
    }
    public String verifyTheAlertsimpleDialogUIText(){
       String getvalueforafteracceptalert = driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
       return getvalueforafteracceptalert;
    }
}