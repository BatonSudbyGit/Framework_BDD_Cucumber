package main.cucumber;


import bdd.main.Constants.ConstantsForTests;
import bdd.main.managers.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;


public class Hooks {

    WebDriver webDriver = DriverManager.getWebDriver();

    @Before
    public void beforeTest() {
        webDriver = DriverManager.getWebDriver();
        webDriver.get(ConstantsForTests.YANDEX_MAIN_PAGE);
        webDriver.manage().window().maximize();
    }

    @After
    public void afterTest() {
        webDriver.quit();
    }
}