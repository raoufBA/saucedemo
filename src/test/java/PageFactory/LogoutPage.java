package PageFactory;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    WebDriver driver;

    @FindBy(id="react-burger-menu-btn")
    WebElement MenuButton;

    @FindBy(xpath = "//*[@id='logout_sidebar_link']")
    WebElement LogoutButton;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void je_clique_sur_menu() {
        MenuButton.click();
    }

    public void je_clique_sur_logout() {
    LogoutButton.click();
    }

}
