from Pages.base_page import BasePage
from Utils.locators import Locators


class HomePage(BasePage) :
    def __init__(self, driver):
        self.locator = Locators
        super().__init__(driver)

    def aramabutonu(self):
        self.find_element(*self.locator.aramakutusu).click()
        self.find_element(*self.locator.aramakutusu).send_keys('dolar')
        self.find_element(*self.locator.aramabutonu).click()

    def control(self):
        return self.get_url()

    def kategorisecimi(self):
        self.find_element(*self.locator.categoryclick).click()


