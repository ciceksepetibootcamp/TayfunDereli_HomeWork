package POM.tests;

import POM.pages.HomePage;
import POM.pages.MenuPage;
import POM.pages.SplashScreen;
import org.testng.annotations.Test;

public class TestCase1 extends BaseTest{
    @Test (priority = 0)
    public void skipSplashScreen()  {
        SplashScreen splashScreen = new SplashScreen(driver);
        splashScreen
                .Next()
                .closePopUp();

    }

    @Test(priority = 1)
    public void HomePagetoProductPage() {
         HomePage homePage = new HomePage(driver);
         MenuPage menuPage = new MenuPage(driver);
        homePage
                .clickMenu()
                .assertMenu("Menu");
        menuPage
                .clickProduct()
                .assertProduct("Lemon Cake")
                .closeProductDetail();
    }
}
