package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.utility.RandomString;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.sql.Time;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Test extends TestBase {
    String correo = RandomString.make(4);

    @Given("^El usuario se encuentra en la pantalla home de automationpractice$")
    public void el_usuario_se_encuentra_en_la_pantalla_home_de_automationpractice() throws Throwable {
   Assert.assertTrue(homePage.homePageIsDisplayed());
    }

    @When("^Hace click sobre el boton de iniciar sesion$")
    public void hace_click_sobre_el_boton_de_iniciar_sesion() throws Throwable {
        homePage.clickOnTitleLogin();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement boxEmail = driver.findElement(By.id("email_create"));
        boxEmail.sendKeys(correo+"@gmail.com.co");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement buttonNewUser = driver.findElement(By.id("SubmitCreate"));
        buttonNewUser.submit();
    }
    @Then("^se debe redirigir al formulario de crear cuenta$")
    public void se_debe_redirigir_al_formulario_de_crear_cuenta() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue("no se redirecciono al login o el correo ya existe una cuenta con dicho correo",formPage.isTitleFormDisplayed());
    }
}
