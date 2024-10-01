package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id='user-name']")
    WebElement UsernameButton;

    @FindBy(xpath = "//*[@id='password']")
    WebElement PasswordButton;

    @FindBy(xpath = "//*[@id='login-button']")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setLoginButton(String name) {
        UsernameButton.sendKeys(name);
    }

    public void setPassword(String pass) {
        PasswordButton.sendKeys(pass);
    }


    public void ClickLoginButton() {
        loginButton.click();
    }


}
