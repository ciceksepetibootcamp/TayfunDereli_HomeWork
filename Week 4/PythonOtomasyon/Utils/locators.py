from selenium.webdriver.common.by import By


class Locators(object):
    aramakutusu = (By.ID, "search-textbox")
    categoryclick = (By.XPATH, "//*[@id='quick-index-nav']/li[4]/a")
    aramabutonu = (By.XPATH, "//button[@aria-label='getir']")
    categorycontrol = (By.TAG_NAME, "h2")
