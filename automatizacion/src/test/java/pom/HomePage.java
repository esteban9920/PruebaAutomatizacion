package pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(className = "login")
   private WebElement titleLogin;
   private String titleHome="My Store";

    public HomePage(WebDriver driver){
       super(driver);
    }

    public boolean homePageIsDisplayed() throws Exception {
       return this.getTitle().equals(titleHome);
    }
    public void clickOnTitleLogin() throws Exception {
       this.click(titleLogin);
    }
}
