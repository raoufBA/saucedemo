package PageFactory;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveProductPage {

    WebDriver driver;


    @FindBy(xpath = "//*[@id='remove-sauce-labs-onesie']")
    WebElement RemoveButton;


    public RemoveProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void je_clique_sur_supprimer() {
        RemoveButton.click();
    }

}
