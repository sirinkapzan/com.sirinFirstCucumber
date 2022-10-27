package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US1010Page {

    public US1010Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
    public WebElement exerciseYazisi ;

    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
    public WebElement signUpButonu;

    @FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]")
    public WebElement emailKutusu;

    @FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[3]")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    public WebElement loginButonu;

    @FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]/a[1]")
    public WebElement usernameIsmi;

    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]")
    public WebElement deleteAccountButonu;

    @FindBy(xpath = "//b[contains(text(),'Account Deleted!')]")
    public WebElement deleteAccountYazisi;



}
