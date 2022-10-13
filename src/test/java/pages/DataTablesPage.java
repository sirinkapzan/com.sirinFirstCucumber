package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTablesPage {
    public DataTablesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='New']")
    public WebElement newButton;

    @FindBy(xpath = "(//input[@type=\"text\"])[2]")
    public WebElement firstname;

    @FindBy(xpath = "(//input[@type=\"text\"])[3]")
    public WebElement lastname;

    @FindBy(xpath = "(//input[@type=\"text\"])[4]")
    public WebElement position;

    @FindBy(xpath = "(//input[@type=\"text\"])[5]")
    public WebElement  office  ;

    @FindBy(xpath = "(//input[@type=\"text\"])[6]")
    public WebElement  extension ;

    @FindBy(xpath = "(//input[@type=\"text\"])[7]")
    public WebElement starDate ;

    @FindBy(xpath = "(//input[@type=\"text\"])[8]")
    public WebElement salary;

    @FindBy(xpath = "//button[@class=\"btn\"]")
    public WebElement createButton;

    @FindBy(xpath = "//input[@type=\"search\"]")
    public WebElement searchButton;

    @FindBy(xpath = "(//td[@class=\"sorting_1\"])[1]")
    public WebElement resultSearch;



}
