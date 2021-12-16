from Pages.category_page import CategoryPage
from Pages.home_page import HomePage
from Test.base_test import BaseTest


class TestHomeTest(BaseTest):

    def test_hometest(self):
        home_page = HomePage(self.driver)
        category_page = CategoryPage(self.driver)
        self.assertIn('https://eksisozluk.com/', home_page.control())

        home_page.aramabutonu()
        self.assertTrue('dolar' in home_page.control())
        home_page.kategorisecimi()
        self.assertIn('gündem', category_page.aramakontrol())

