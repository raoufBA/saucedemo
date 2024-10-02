package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {



    @Before
    public void login() {
        System.out.println("Before login");
    }

    @After
    public void closeBrowser() {
        DriverManager.quitDriver();
    }
}
