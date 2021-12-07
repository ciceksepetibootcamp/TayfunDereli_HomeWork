package LCW.pages;

import LCW.utils.Drivers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {
    public HomePage() {
        PageFactory.initElements(Drivers.get(), this); // sayfaları bir kez cagırmak ıcın olusturduk.
    }
    @FindBy(xpath = "//li[@class=\" outlet\"]")
    public WebElement kategori;
    @FindBy(className = "searchButton")
    public WebElement searchClick;

    @FindBy(xpath = "//input[@placeholder=\"Ürün, kategori veya marka ara\"]")
    public WebElement searchBox;

    @FindBy(xpath = "//*[text()=\"Anladım\"]")
    public WebElement cerezKapama ;

    @FindBy(css = ".dropdown-toggle:nth-child(1)")
    public  WebElement girisYapButon;

    @FindBy(xpath ="//span[text()=\"Hesabım\"]")
    public  WebElement girisKontrol;

    public void loginSayfasinaGit() {
    girisYapButon.click();
    }

    public void cerezkapa() throws InterruptedException {
        Thread.sleep(1000);
        cerezKapama.click();
    }

    public void loginCheck() {
        String actual = girisKontrol.getText();
        String expected = "Hesabım" ;
        Assert.assertEquals(actual,expected);
    }

    public void searchBoxTikla() {
        searchClick.click();
    }
    public void urunarama(String searchKey) {
        searchBox.sendKeys(searchKey);
        searchClick.click();
    }


    public void kategorisecimi() {
        kategori.click();
        Assert.assertTrue(Drivers.get().getCurrentUrl().contains("outlet"));

    }
}
