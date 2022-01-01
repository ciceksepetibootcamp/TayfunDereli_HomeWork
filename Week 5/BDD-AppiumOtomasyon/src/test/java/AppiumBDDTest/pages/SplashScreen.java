package AppiumBDDTest.pages;

import AppiumBDDTest.utils.Driver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.util.List;

public class SplashScreen {
    //public AndroidDriver<MobileElement> driver;
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    public SplashScreen() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);


    }


    public SplashScreen Next() throws MalformedURLException {
        MobileElement els1 = (MobileElement) Driver.getDriver().findElementById("btnNext");
        els1.click();
        els1.click();
        els1.click();
        els1.click();
        return this;
    }

    public SplashScreen closePopUp() {
        try {
            By closeNotf = By.id("netmera_web_view_toolbar_cancel");
            wait.until(ExpectedConditions.visibilityOfElementLocated(closeNotf)).click();

        } catch (Exception e) {
            System.out.println("Reklam yok");
        }

        return this;
    }
}

