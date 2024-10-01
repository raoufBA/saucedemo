package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProductPage {
    WebDriver driver;


    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-onesie']")
    WebElement AddcartButton1;


    @FindBy(name = "add-to-cart-sauce-labs-bike-light")
    WebElement AddcartButton2;


    @FindBy(xpath = "//*[@id='shopping_cart_container']/a")
    WebElement PanierButton;


    public AddProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void je_clique_add_to_card_pour_Sauce_Labs_Onesie() {
        AddcartButton1.click();
    }

    public void je_clique_add_to_card_pour_Sauce_Labs_Bolt_T_Shirt() {
        AddcartButton2.click();
    }

    public void les_produits_sajoutent_dans_le_panier() {
        PanierButton.click();
    }


}
