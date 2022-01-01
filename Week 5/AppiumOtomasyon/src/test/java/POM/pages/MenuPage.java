package POM.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


public class MenuPage extends BasePage {
    public MenuPage(AndroidDriver driver) {
        super(driver);
    }

    public MenuPage clickProduct() {
        MobileElement productImage = driver.findElementByXPath("//*[@text='Lemon Cake']");
        productImage.click();
        return this;
    }

    public MenuPage assertProduct(String title) {
        MobileElement productTitle = driver.findElementById("tvTitle");
        Assert.assertEquals(title, productTitle.getText());
        return this;
    }

    public MenuPage closeProductDetail() {
        MobileElement closeProductPage = driver.findElementById("imClose");
        closeProductPage.click();
        return this;

    }
}


