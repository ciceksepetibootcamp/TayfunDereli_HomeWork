package AppiumBDDTest.pages;

import AppiumBDDTest.utils.Driver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;


public class HomePage {


    public HomePage() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    public HomePage clickMenu() throws MalformedURLException {
        MobileElement menuButton = (MobileElement) Driver.getDriver().findElementByXPath("//*[@text='Menu']");
        menuButton.click();
        return this;
    }

    public void assertMenu(String title) throws MalformedURLException {
        MobileElement menuTitle = (MobileElement) Driver.getDriver().findElementByXPath("//android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView");
        Assert.assertEquals(title, menuTitle.getText());
    }


    public void isOnMainPage(String title) throws MalformedURLException {
        Driver.getDriver().launchApp();
        MobileElement imOnPage = (MobileElement) Driver.getDriver().findElementById("tvHomeContent");
        Assert.assertTrue(imOnPage.getText().contains(title));

    }

    public void clickCardPageMenu() throws MalformedURLException {
        MobileElement starbucksCardMenu = (MobileElement) Driver.getDriver().findElementByXPath("//*[@text='Starbucks Card']");
        starbucksCardMenu.click();
    }
}
