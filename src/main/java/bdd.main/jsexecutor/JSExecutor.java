package bdd.main.jsexecutor;

import bdd.main.managers.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class JSExecutor {

    private static final WebDriver webDriver = DriverManager.getWebDriver();

    static JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;

    public static void highlightWithJS(WebElement element) {
        String background = element.getCssValue("backgroundColor");
        javascriptExecutor.executeScript("arguments[0].style.backgroundColor = '" + "red" + "'", element);
        javascriptExecutor.executeScript("arguments[0].style.backgroundColor = '" + background + "'", element);
    }
}