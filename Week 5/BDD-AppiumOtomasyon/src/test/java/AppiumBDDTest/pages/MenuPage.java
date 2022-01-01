package AppiumBDDTest.pages;

import AppiumBDDTest.utils.Driver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;


public class MenuPage {

    public MenuPage() throws MalformedURLException {

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }



    public MenuPage clickProduct() throws MalformedURLException {
        MobileElement productImage = (MobileElement) Driver.getDriver().findElementByXPath("//*[@text='Lemon Cake']");
        productImage.click();
        return this;
    }

    public MenuPage assertProduct(String title) throws MalformedURLException {
        MobileElement productTitle = (MobileElement) Driver.getDriver().findElementById("tvTitle");
        Assert.assertEquals(title, productTitle.getText());
        return this;
    }

    public MenuPage closeProductDetail() throws MalformedURLException {
        MobileElement closeProductPage = (MobileElement) Driver.getDriver().findElementById("imClose");
        closeProductPage.click();
        Driver.getDriver().closeApp();
        return this;

    }
}


