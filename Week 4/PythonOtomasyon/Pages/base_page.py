class BasePage(object):
    def __init__(self, driver, base_url='http://www.eksisozluk.com'):
        self.base_url = base_url
        self.driver = driver
        self.timeout = 10

    def open(self, url):
        url = self.base_url + url
        self.driver.get(url)

    def find_element(self, *locator):
        return self.driver.find_element(*locator)

    def get_url(self):
        return self.driver.current_url
