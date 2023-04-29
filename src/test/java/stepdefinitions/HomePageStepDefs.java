package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Allpages;
import utils.ConfigReader;
import utils.Driver;

public class HomePageStepDefs {

    Allpages elements = new Allpages();

    @Given("Kullanıcı tatilsepeti sayfasına gider")
    public void navigateToUrl() throws InterruptedException {
        Driver.getAppiumDriver().get(ConfigReader.getProperty("Url"));
        Thread.sleep(2000);
    }

    @And("Hotel butonuna tiklanir")
    public void hotelButonunaTiklanir() {
        elements.Hotel_Butonu.click();
    }


    @And("Profil icon tiklanir")
    public void clickProfileIcon() {

        JavascriptExecutor executor = (JavascriptExecutor) Driver.getAppiumDriver();
        executor.executeScript("arguments[0].click();", elements.profileIcon);

    }

    @And("Email input alanına gecerli email girilir")
    public void enterEmail() {
        elements.email.sendKeys("hasanozsoy19@gmail.com");
    }

    @And("Giriş Yap tıklanır.")
    public void girişYapTıklanır() {
        elements.signInButton.click();
    }

    @And("Login butonu tiklanir")
    public void clickLoginButton() throws InterruptedException {
        Thread.sleep(2000);
        Driver.getAppiumDriver().findElement(By.xpath("//button[text()='Giriş Yap']")).click();
    }

    @And("Otel bul butonu tıklanır")
    public void otelBulButonuTıklanır() {
        elements.searchButton.click();
    }

    @When("Otel sec butonu tıklanır.")
    public void otelSecButonuTıklanır() {
        elements.selectButton.click();
    }

    @And("Rezervasyon yap butonu tıklanır.")
    public void rezervasyonYapButonuTıklanır() {
        WebDriverWait wait = new WebDriverWait(Driver.getAppiumDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()='Rezervasyon Yap'])[2]")));
        elements.reservationButton.click();
    }

    @When("İletişim bilgileri email {string} girilir.")
    public void i̇letişimBilgileriEmailGirilir(String email) {
        elements.emailInput.sendKeys(email);
    }

    @When("İletişim bilgileri telefon {string} girilir.")
    public void i̇letişimBilgileriTelefonGirilir(String tel) {
        elements.contactMobile.sendKeys(tel);
    }

    @And("{int} sn bekle")
    public void snBekle(int arg0) throws InterruptedException {
        Thread.sleep(5000);
    }

    @And("Sayfa kapatilir")
    public void sayfaKapatilir() {
        Driver.quitAppiumDriver();
    }

    @And("Password input alanına gecerli password girilir")
    public void enterPassword() {
        WebDriverWait wait = new WebDriverWait(Driver.getAppiumDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Password")));
        elements.password.sendKeys("hasan12345.");
    }

    @And("ARA butonu tıklanır.")
    public void clickSearchButton() {
        Driver.getAppiumDriver().findElement(By.xpath("//button[@id='searchBtn']")).click();
    }

    @When("Detayları incele tıklanır.")
    public void detaylarıInceleTıklanır() {
        WebDriverWait wait = new WebDriverWait(Driver.getAppiumDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Detayları İncele'])[2]")));
        Driver.getAppiumDriver().findElement(By.xpath("(//a[text()='Detayları İncele'])[2]")).click(); // 2. sıradaki otel secilir
    }


    @And("Ödeme için devam et tıklanır")
    public void ödemeIçinDevamEtTıklanır() {
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getAppiumDriver();
        executor.executeScript("arguments[0].click();", Driver.getAppiumDriver().findElement(By.xpath("//button[@id='isValidateHotel']")));

    }

    @Then("{string} ekranı görülür.")
    public void ekranıGörülür(String str) {
        WebDriverWait wait = new WebDriverWait(Driver.getAppiumDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='" + str + "']")));

        Assert.assertTrue(Driver.getAppiumDriver().findElement(By.xpath("//h5[text()='" + str + "']")).isDisplayed());
    }

    @And("Yetiskin isim {string} ve soyisim {string} girilir")
    public void enterAdultNameAndSurname(String adult_first_name, String adult_last_name) {
        elements.adult_first_name.sendKeys(adult_first_name);
        elements.adult_last_name.sendKeys(adult_last_name);
    }
}

