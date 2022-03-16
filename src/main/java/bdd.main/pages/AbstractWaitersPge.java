package bdd.main.pages;

import bdd.main.managers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static bdd.main.Constants.ConstantsForTests.*;


public abstract class AbstractWaitersPge {

    WebDriver webDriver = DriverManager.getWebDriver();

    public void waitForElementWebsite(WebElement element) {
        new WebDriverWait(webDriver, WAIT_FOR_ELEMENT_SECONDS).until(ExpectedConditions.visibilityOfAllElementsLocatedBy((By) element));
    }

    protected void waitForElementPresent(WebElement element) {
        new WebDriverWait(webDriver, WAIT_FOR_ELEMENT_SECONDS).until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementBeClickable(WebElement element) {
        new WebDriverWait(webDriver, WAIT_FOR_ELEMENT_SECONDS).until(ExpectedConditions.elementToBeClickable(element));
    }
}