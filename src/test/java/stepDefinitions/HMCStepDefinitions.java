package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.HMCPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HMCStepDefinitions {
    public HMCPage hmcPage = new HMCPage();


    @Then("user login tiklar")
    public void user_login_tiklar() {
    hmcPage.LogIn.click();

    }
    @Then("user gecerli username girer")
    public void user_gecerli_username_girer() {
    hmcPage.username.sendKeys(ConfigReader.getProperty("HMCValidUsername"));

    }
    @Then("user gecerli password girer")
    public void user_gecerli_password_girer() {
        hmcPage.password.sendKeys(ConfigReader.getProperty("HMCValidPassword"));

    }
    @Then("user login2 butonuna basar")
    public void user_login2_butonuna_basar() {
        hmcPage.LogIn2.click();

    }
    @Then("user sayfaya giris yaptigini kontrol eder")
    public void user_sayfaya_giris_yaptigini_kontrol_eder() {
        Assert.assertTrue(hmcPage.hotelManagement.isDisplayed());

    }

}
