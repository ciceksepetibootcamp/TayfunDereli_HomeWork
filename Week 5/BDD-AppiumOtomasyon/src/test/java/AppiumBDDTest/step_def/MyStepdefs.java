package AppiumBDDTest.step_def;
import AppiumBDDTest.pages.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class MyStepdefs {

    HomePage homePage = new HomePage();
    MenuPage menuPage = new MenuPage();
    CardPage cardPage = new CardPage();
    SplashScreen splashScreen = new SplashScreen();

    public MyStepdefs() throws MalformedURLException {
    }

    @Given("Kullanıcı uygulamayı açar")
    public void kullanici_Uygulamayi_Acar() {

    }

    @And("Splash Secreen butonlarına tıklar.")
    public void splashSecreen_Butonlarina_Tiklar() throws MalformedURLException {
        splashScreen
                .Next();


    }

    @And("PopUp kapatılır.")
    public void popupKapatilir() {
        splashScreen
                .closePopUp();
    }

    @When("Menu sayfasına gidilir.")
    public void menuSayfasınaGidilir() throws MalformedURLException {
        homePage
                .clickMenu();

    }

    @Then("Menu sayfasında oldugu kontrol edilir.")
    public void menuSayfasındaOlduguKontrolEdilir() throws MalformedURLException {
        homePage
                .assertMenu("Menu");
    }

    @And("{string} ürünü seçilir ve kontrol edilir.")
    public void ürünüSeçilirVeKontrolEdilir(String arg0) throws MalformedURLException {
        menuPage
                .clickProduct()
                .assertProduct(arg0);

    }

    @And("ÜrünDetay Sayfası kapatılır.")
    public void üründetaySayfasıKapatılır() throws MalformedURLException {
        menuPage
        .closeProductDetail();
    }



    @When("Card Sayfasına gidilir.")
    public void cardSayfasınaGidilir() throws MalformedURLException {
        homePage
                .clickCardPageMenu();


    }

    @Then("Card Sayfasındaki {string} kontrol edilir.")
    public void cardSayfasındakiKontrolEdilir(String arg0) throws MalformedURLException {
        cardPage
                .asserCardMenu(arg0);
    }

    @When("Anasayfaya geri dönülür ve {string} yazısı kontrol edilir.")
    public void anasayfayaGeriDönülürVeYazısıKontrolEdilir(String arg0) throws MalformedURLException {
        homePage
                .isOnMainPage(arg0);

    }
}
