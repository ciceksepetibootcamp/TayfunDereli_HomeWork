package LCW.step_def;

import LCW.pages.HomePage;
import LCW.pages.LoginPage;
import LCW.pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MySteps {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    SearchPage searchPage = new SearchPage() ;
    @Given("Login sayfasını gidilir.")
    public void loginSayfasınıGidilir() {
        homePage.loginSayfasinaGit();

    }

    @Given("cerezkapama")
    public void cerezkapama() throws InterruptedException {
        homePage.cerezkapa() ;
    }

    @Then("Kullanıcı bilgileri girilir.")
    public void kullanıcıBilgileriGirilir() {
        loginPage.idoldurma(); ;
    }

    @And("Üye girişi kontrol edilir.")
    public void üyeGirişiKontrolEdilir() {
        homePage.loginCheck();
    }

    @Given("SearchFindKeywords butonuna tıklanır.")
    public void searchfindkeywordsButonunaTıklanır() {
        homePage.searchBoxTikla();

    }

    @Then("{string} ürünü aratılır.")
    public void ürünüAratılır(String searchKey) {
        homePage.urunarama(searchKey);

    }

    @And("İlgili arama {string} mi diye kontrol edilir.")
    public void ilgiliAramaMiDiyeKontrolEdilir(String searchKey) {
        searchPage.arananurunkontrolu(searchKey);
    }

    @Given("Outlet kategorine tıklanır")
    public void outletKategorineTıklanır() {
        homePage.kategorisecimi();
    }

    @Then("Ürün seçimi yapılır.")
    public void ürünSeçimiYapılır() {
        searchPage.urunSecimi();

    }

    @And("Ürün sepete eklenir.")
    public void ürünSepeteEklenir() throws InterruptedException {
        searchPage.sepetekle();
    }

    @And("Ürün sepette mi bakılır.")
    public void ürünSepetteMiBakılır() {
        searchPage.sepetCheck();
    }
}
