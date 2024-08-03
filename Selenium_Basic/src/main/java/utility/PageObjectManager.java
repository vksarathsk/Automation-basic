package utility;

import org.openqa.selenium.WebDriver;
import pageobject.AlertLeafgroundPage;
import pageobject.AmazonHomepage;
import pageobject.AmazonSearchpage;
import pageobject.DropdownLeafgroundPage;

public class PageObjectManager {

    WebDriver driver;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public AmazonHomepage getAmazonHomepage(){
        AmazonHomepage amazonHomepage = new AmazonHomepage(driver);
        return amazonHomepage;
    }
    public AmazonSearchpage getAmazonSearchpage(){
        AmazonSearchpage amazonSearchpage = new AmazonSearchpage(driver);
        return amazonSearchpage ;
    }
    public AlertLeafgroundPage AlertLeafgroundPage (){
        AlertLeafgroundPage alertLeafgroundPage = new AlertLeafgroundPage(driver);
        return alertLeafgroundPage;
    }
    public DropdownLeafgroundPage getDropdownLeafgroundpage(){
        DropdownLeafgroundPage dropdownLeafgroundPage = new DropdownLeafgroundPage(driver);
        return dropdownLeafgroundPage;
    }

}
