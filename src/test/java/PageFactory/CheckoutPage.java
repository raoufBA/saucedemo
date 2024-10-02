package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    WebDriver driver;

    @FindBy(id="shopping_cart_container")
    WebElement Panier1Button;

    @FindBy(id="checkout")
    WebElement CheckoutButton;

    @FindBy(xpath = "//*[@id='first-name']")
    WebElement SetFirstname;

    @FindBy(id = "last-name")
    WebElement SetLastname;

    @FindBy(id = "postal-code")
    WebElement SetAddress;

    @FindBy(id = "continue")
    WebElement Continuebutton;

    @FindBy(id = "finish")
    WebElement Finishbutton;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void je_clique_sur_le_panier() {
        Panier1Button.click();
    }

    public void je_clique_sur_chekout() {
        CheckoutButton.click();
    }

    public void je_saisie_mon_first_name(String firstname) {
        SetFirstname.sendKeys(firstname);
    }

    public void je_saisie_mon_last_name(String lastname) {
        SetLastname.sendKeys(lastname);
    }

    public void je_saisie_mon_postal_code(String postalcode) {
        SetAddress.sendKeys(postalcode);
    }

    public void je_clique_sur_continue() {
        Continuebutton.click();

    }

    public void je_clique_sur_finish() {
        Finishbutton.click();
    }

}


