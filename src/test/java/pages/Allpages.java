package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class Allpages {

    public Allpages() {

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(25)), this);

    }

    @FindBy(xpath = "//a[@title='Giriş Yap']")
    public WebElement profileIcon;

    @FindBy(css = "#UserName")
    public WebElement email;
    @FindBy(css = "#Password")
    public WebElement password;

    @FindBy(id = "searchBtn")
    public WebElement searchButton;

    @FindBy(xpath = "(//span[@class='tab-label'])[2]")
    public WebElement Hotel_Butonu;

    @FindBy(xpath = "//*[text()='Giriş Yap / Üye Ol']")
    public WebElement signInButton;

    @FindBy(xpath = "(//a[@data-testid='hotel-select-button'])[1]") //filtrelenen ilk oteli seçer
    public WebElement selectButton;
    @FindBy(xpath = "(//button[text()='Rezervasyon Yap'])[2]")
    public WebElement reservationButton;

    @FindBy(name = "contact[email]")
    public WebElement emailInput;
    @FindBy(name = "contact[mobilePhone][number]")
    public WebElement contactMobile;

    @FindBy(xpath = "//input[@id='CustomerViewModel_1__Name']")
    public WebElement adult_first_name;

    @FindBy(xpath = "//input[@id='CustomerViewModel_1__SurName']")
    public WebElement adult_last_name;


}
