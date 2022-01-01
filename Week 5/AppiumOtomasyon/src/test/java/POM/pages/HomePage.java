package POM.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;

public class HomePage extends BasePage{
    public HomePage(AndroidDriver driver) {
        super(driver);
    }
    public HomePage clickMenu() {
        MobileElement menuButton = driver.findElementByXPath("//*[@text='Menu']");
        menuButton.click();
        return this;
    }

    public void assertMenu(String title) {
        MobileElement menuTitle = driver.findElementByXPath("//android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView");
        Assert.assertEquals(title,menuTitle.getText());
    }


    public void isOnMainPage(String title) {
        MobileElement imOnPage = driver.findElementById("tvHomeContent");
        Assert.assertTrue(imOnPage.getText().contains(title));

    }

    public void clickCardPageMenu() {
        MobileElement starbucksCardMenu = driver.findElementByXPath("//*[@text='Starbucks Card']");
        starbucksCardMenu.click();
    }
}
