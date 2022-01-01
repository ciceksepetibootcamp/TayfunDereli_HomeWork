package POM.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SplashScreen extends BasePage {
    public SplashScreen(AndroidDriver driver) {
        super(driver);
    }

    public SplashScreen Next() {
        MobileElement els1 = driver.findElementById("btnNext");
        els1.click();
        els1.click();
        els1.click();
        els1.click();
        return this;
    }

    public SplashScreen closePopUp() {

        By closeNotf = By.id("netmera_web_view_toolbar_cancel");
        wait.until(ExpectedConditions.visibilityOfElementLocated(closeNotf)).click();
        return this;

    }
}

