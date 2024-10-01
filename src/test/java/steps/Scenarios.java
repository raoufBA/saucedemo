package steps;

import PageFactory.*;
import Utils.ElementUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Scenarios {
    WebDriver driver;
    LoginPage loginPage;
    AddProductPage addProductPage;
    RemoveProductPage removeProductPage;
    CheckoutPage checkoutPage;
    LogoutPage logoutPage;
    ElementUtils utilities;

    @Given("je suis dans le site saucedemo")
    public void je_suis_dans_le_site_saucedemo() {
        driver = DriverManager.getDriver();
        addProductPage = new AddProductPage(driver);
        removeProductPage = new RemoveProductPage(driver);
        loginPage = new LoginPage(driver);
        checkoutPage = new CheckoutPage(driver);
        logoutPage = new LogoutPage(driver);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        utilities = new ElementUtils(driver);
    }

    @When("Je saisie userName {string}")
    public void je_saisie_user_name(String username) {
        loginPage.setLoginButton(username);
    }

    @When("Je saisie password {string}")
    public void je_saisie_password(String password) {
        loginPage.setPassword(password);
    }

    @When("je clique sur le bouton Login")
    public void je_clique_sur_le_bouton_login() {
        loginPage.ClickLoginButton();
    }

    @Then("redirection vers la page Home")
    public void redirectToHomePageHome() {
        utilities.Confirmation("https://www.saucedemo.com/inventory.html");
    }

    @When("je clique add to card pour Sauce Labs Onesie")
    public void je_clique_add_to_card_pour_Sauce_Labs_Onesie() {
        addProductPage.je_clique_add_to_card_pour_Sauce_Labs_Onesie();
    }

    @When("je clique add to card pour Sauce Labs Bolt T-Shirt")
    public void je_clique_add_to_card_pour_Sauce_Labs_Bolt_T_Shirt() {
        addProductPage.je_clique_add_to_card_pour_Sauce_Labs_Bolt_T_Shirt();
    }

    @Then("les produits sajoutent dans le panier")
    public void les_produits_sajoutent_dans_le_panier() {
        addProductPage.les_produits_sajoutent_dans_le_panier();
    }

    @When("je clique sur le panier")
    public void je_clique_sur_le_panier() {
        checkoutPage.je_clique_sur_le_panier();
    }
    @When("je clique sur Chekout")
    public void je_clique_sur_chekout() {
        checkoutPage.je_clique_sur_chekout();
    }

    @Then("je saisie mon First name {string}")
    public void je_saisie_mon_first_name(String firstname) {
        checkoutPage.je_saisie_mon_first_name(firstname);
    }

    @Then("je saisie mon Last name {string}")
    public void je_saisie_mon_last_name(String lastname) {
        checkoutPage.je_saisie_mon_last_name(lastname);
    }

    @Then("je saisie mon postal code {string}")
    public void je_saisie_mon_postal_code(String arg0) {
        int postalcode = Integer.parseInt(arg0);
        checkoutPage.je_saisie_mon_postal_code(postalcode);
    }

    @Then("je clique sur continue")
    public void je_clique_sur_continue() {
        checkoutPage.je_clique_sur_continue();
    }

    @Then("je clique sur Finish")
    public void je_clique_sur_finish() {
        checkoutPage.je_clique_sur_finish();
    }

    @Then("une redirection vers une autre page")
    public void une_redirection_vers_une_autre_page() {
        utilities.Confirmation("https://www.saucedemo.com/checkout-complete.html");
    }

    @When("je clique sur supprimer")
    public void je_clique_sur_supprimer() {
        removeProductPage.je_clique_sur_supprimer();
    }

    @Then("les produits se sont supprimes")
    public void les_produits_se_sont_supprimes() {
        utilities.Exist("Sauce Labs Onesie");
    }

    @When("je clique sur menu")
    public void je_clique_sur_menu() {
        logoutPage.je_clique_sur_menu();
    }

    @When("je clique sur Logout")
    public void je_clique_sur_logout() {
        logoutPage.je_clique_sur_logout();
    }

    @Then("une redirection vers la page d'acceuil")
    public void une_redirection_vers_la_page_d_acceuil() {
        utilities.Confirmation("https://www.saucedemo.com/");
    }
}










