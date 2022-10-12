package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon anasayfasinda")
    public void kullanici_amazon_anasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @Then("kullanici nutella aramasi yapar")
    public void kullanici_nutella_aramasi_yapar() {
        amazonPage.searchBox.sendKeys("Nutella" + Keys.ENTER);


    }
    @Then("sonuclarin Nutella icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_eder() {
        String arananKelime = "Nutella";
        String actualAramaSonucStr = amazonPage.searchResultText.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));

    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici java aramasi yapar")
    public void kullaniciJavaAramasiYapar() {
        amazonPage.searchBox.sendKeys("Java",Keys.ENTER);
    }

    @And("sonuclarin java icerdigini test eder")
    public void sonuclarinJavaIcerdiginiTestEder() {
        String arananKelime = "Java";
        String actualAramaSonucStr = amazonPage.searchResultText.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));

    }

    @Then("kullanici {string} aramasi yapar")
    public void kullanici_aramasi_yapar(String istenenKelime) {
        amazonPage.searchBox.sendKeys(istenenKelime + Keys.ENTER);

    }
    @Then("sonuclarin {string} icerdigini test eder")
    public void sonuclarin_icerdigini_test_eder(String istenenKelime) {
        String arananKelime = istenenKelime;
        String actualAramaSonucStr = amazonPage.searchResultText.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(istenenKelime));

    }

    @Given("kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @When("Url'in {string} icerdigini test eder")
    public void urlInIcerdiginiTestEder(String istenenKelime) {
        String expected = istenenKelime;
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expected));
    }

    @Then("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int beklenenZaman) {
        try {
            Thread.sleep(beklenenZaman*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
