package POM.tests;

import POM.pages.CardPage;
import POM.pages.HomePage;
import POM.pages.MenuPage;
import POM.pages.SplashScreen;
import org.testng.annotations.Test;

public class TestCase2 extends BaseTest{
    @Test(priority = 2)
    public void turnHomePage()  {

        HomePage homePage = new HomePage(driver);

        homePage
                .isOnMainPage("Good evening");

    }

        @Test(priority = 3)
        public void goToCardPage()  {

            HomePage homePage = new HomePage(driver);
            CardPage cardPage = new CardPage(driver);

            homePage
                    .clickCardPageMenu();
            cardPage
                    .asserCardMenu("Starbucks Card");

        }
}
