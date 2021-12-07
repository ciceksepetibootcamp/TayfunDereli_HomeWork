package LCW.pages;

import LCW.utils.ConfReader;
import LCW.utils.Drivers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Drivers.get(), this); // sayfaları bir kez cagırmak ıcın olusturduk

    }

    @FindBy(id = "LoginEmail")
    public WebElement iddoldur;
    @FindBy(id = "Password")
    public WebElement pwdoldur;
    @FindBy(id = "loginLink")
    public WebElement loginbuton;

    public void idoldurma() {
        iddoldur.click();
        iddoldur.sendKeys(ConfReader.get("email"));
        pwdoldur.click();
        pwdoldur.sendKeys(ConfReader.get("password"));
        loginbuton.click();
    }

}
