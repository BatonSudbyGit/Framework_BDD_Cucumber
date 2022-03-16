package bdd.main.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {

    private static WebDriver webDriver;

    private DriverManager() {
    }

    public static WebDriver getWebDriver() {
        if (webDriver == null) {
            setWebDriver();
        }
        return webDriver;
    }

    public static void setWebDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\РС\\Desktop\\Selenium_Grid\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        webDriver = new ChromeDriver(options);
    }
}