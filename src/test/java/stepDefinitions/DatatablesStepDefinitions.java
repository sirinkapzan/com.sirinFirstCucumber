package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;
import utilities.Driver;

public class DatatablesStepDefinitions {

    DataTablesPage dataTablesPage = new DataTablesPage();


    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        dataTablesPage.newButton.click();

    }

    @Then("isim bolumune {string} yazar")
    public void isim_bolumune_yazar(String firstname) {
        dataTablesPage.firstname.sendKeys(firstname);

    }

    @Then("soyisim bolumune {string} yazar")
    public void soyisim_bolumune_yazar(String lastname) {
        dataTablesPage.lastname.sendKeys(lastname);

    }

    @Then("position bolumune {string} yazar")
    public void position_bolumune_yazar(String position) {
        dataTablesPage.position.sendKeys(position);
    }

    @Then("office bolumune {string} yazar")
    public void office_bolumune_yazar(String office) {
        dataTablesPage.office.sendKeys(office);
    }

    @Then("extension bolumune {string} yazar")
    public void extension_bolumune_yazar(String extension) {
        dataTablesPage.extension.sendKeys(extension);
    }

    @Then("startDate bolumune {string} yazar")
    public void start_date_bolumune_yazar(String startDate) {
        dataTablesPage.starDate.sendKeys(startDate);

    }

    @Then("salary bolumune {string} yazar")
    public void salary_bolumune_yazar(String salary) {
        dataTablesPage.salary.sendKeys(salary);

    }

    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        dataTablesPage.createButton.click();
    }


    @When("kullanici ilk isim ile {string} arama yapar")
    public void kullaniciIlkIsimIleAramaYapar(String firstname) {
        dataTablesPage.searchButton.sendKeys(firstname);

    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String firstname) {
        Assert.assertTrue(dataTablesPage.resultSearch.getText().contains(firstname));
    }

    @When("kullanici anasayfada")
    public void kullaniciAnasayfada() {
        Driver.getDriver().get("https://editor.datatables.net/");
    }
}
