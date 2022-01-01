package AppiumBDDTest.pages;

import AppiumBDDTest.utils.Driver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;


public class CardPage{


    public CardPage(  ) throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);

    }

    public CardPage asserCardMenu(String title) throws MalformedURLException {
        MobileElement cartPageText = (MobileElement) Driver.getDriver().findElementById("tvNoLoginDescription");
        Assert.assertTrue(cartPageText.getText().contains(title));
        return this ;
    }
}
