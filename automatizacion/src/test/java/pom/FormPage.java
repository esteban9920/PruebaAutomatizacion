package pom;

import cucumber.api.java.en_lol.AN;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormPage extends BasePage {
    @FindBy(className="page-subheading")

    private WebElement formCreate;
    private String titleform="CREATE AN ACCOUNT";

    public FormPage (WebDriver driver){
        super(driver);
    }


    public boolean isTitleFormDisplayed() throws Exception {
        return this.isDisplayed(formCreate)&& this.getText(formCreate).equals(titleform);
    }
}
