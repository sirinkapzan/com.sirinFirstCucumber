package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.US1010Page;
import utilities.Driver;

public class US1010StepDefs {

    US1010Page us1010Page = new US1010Page();

    @Given("Navigate to url")
    public void navigate_to_url_http_automationexercise_com() {
        Driver.getDriver().get("http://automationexercise.com/");

    }

    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue(us1010Page.exerciseYazisi.isDisplayed());
    }

    @Given("Click on Signup Login button")
    public void click_on_signup_login_button() {
        us1010Page.signUpButonu.click();

    }

    @Given("Verify Login to your account is visible")
    public void verify_login_to_your_account_is_visible() {
        assert us1010Page.emailKutusu.isDisplayed();
    }

    @Given("Enter correct email address and password")
    public void enter_correct_email_address_and_password() {
        us1010Page.emailKutusu.sendKeys("kani56@mail.com");
        us1010Page.passwordKutusu.sendKeys("12345");
    }

    @Given("Click login button")
    public void click_login_button() {
        us1010Page.loginButonu.click();
    }

    @Given("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {
        assert us1010Page.usernameIsmi.isDisplayed();
    }

    @Given("Click Delete Account button")
    public void click_delete_account_button() {
        us1010Page.deleteAccountButonu.click();
    }

    @Given("Verify that ACCOUNT DELETED! is visible")
    public void verify_that_account_deleted_is_visible() {
        Assert.assertTrue(us1010Page.deleteAccountYazisi.isDisplayed());
    }
}
