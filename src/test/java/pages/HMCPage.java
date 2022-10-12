package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HMCPage {
    public HMCPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href=\"/Account/Logon\"]")
    public WebElement LogIn;

    @FindBy(xpath = "//input[@class=\"form-control required\"]")
    public WebElement username;

    @FindBy(xpath = "//input[@placeholder=\"Password\"]")
    public WebElement password;


    @FindBy(id = "btnSubmit")
    public WebElement LogIn2;

    @FindBy(id = "menuHotels")
    public WebElement hotelManagement;


}
