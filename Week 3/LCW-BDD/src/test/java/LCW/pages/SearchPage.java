package LCW.pages;

import LCW.utils.Drivers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    public SearchPage() {
        PageFactory.initElements(Drivers.get(), this); // sayfaları bir kez cagırmak ıcın olusturduk

    }
    @FindBy(id = "spanCart")
    public WebElement checkCart;
    @FindBy(linkText = "M")
    public WebElement selectSize;
    @FindBy(css = ".add-to-cart.button-link.add-to-cart-button")
    public WebElement addToCart;
    @FindBy(xpath = "//img[@data-index=\"0\"]")
    public WebElement urunSec;
    @FindBy(tagName = "b")
    public WebElement breadCrump;
    public void arananurunkontrolu(String searchKey) {
        String expected = searchKey.toLowerCase();
        String actual = breadCrump.getText().toLowerCase();
        Assert.assertTrue(actual.contains(expected)); // gelen deger beklediğimi içeriyor mu

    }

    public void urunSecimi() {
        urunSec.click();
    }

    public void sepetekle() throws InterruptedException {
        selectSize.click();
        addToCart.click();
        Thread.sleep(1000);
    }

    public void sepetCheck() {
        Assert.assertEquals(checkCart.getText(),"1");
    }
}
