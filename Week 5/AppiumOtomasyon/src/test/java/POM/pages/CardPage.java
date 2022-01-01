package POM.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;


public class CardPage extends BasePage{
    public CardPage(AndroidDriver driver) {
        super(driver);
    }
    public CardPage asserCardMenu(String title) {
        MobileElement cartPageText = driver.findElementById("tvNoLoginDescription");
        Assert.assertTrue(cartPageText.getText().contains(title));
        return this ;
    }
}
