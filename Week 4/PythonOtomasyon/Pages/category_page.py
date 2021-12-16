from Pages.base_page import BasePage
from Utils.locators import Locators


class CategoryPage(BasePage) :
    def __init__(self, driver):
        self.locator = Locators
        super().__init__(driver)

    def aramakontrol(self):
        return self.find_element(*self.locator.categorycontrol).text




