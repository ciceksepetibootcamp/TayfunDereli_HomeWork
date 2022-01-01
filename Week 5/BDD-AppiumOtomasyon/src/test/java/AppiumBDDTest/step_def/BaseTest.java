package AppiumBDDTest.step_def;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;



import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;

    @BeforeClass
    public void setup () throws MalformedURLException {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", "Android");
            caps.setCapability("app", "C:\\Users\\PC\\Downloads\\Starbucks Turkey_v2.3.1_apkpure.com.apk");
            caps.setCapability("devicename", "emulator-5554");
            caps.setCapability("fullReset", "false");
            caps.setCapability("noReset", "true");
            caps.setCapability("autoGrantPermissions", "true");

            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            wait = new WebDriverWait(driver, 20);
    }


    /*@AfterClass
    public void teardown() {
        driver.quit();
    }
*/
}
