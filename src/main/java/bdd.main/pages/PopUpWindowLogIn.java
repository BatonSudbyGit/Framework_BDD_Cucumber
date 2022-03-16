package bdd.main.pages;

import bdd.main.managers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopUpWindowLogIn extends AbstractWaitersPge {

    @FindBy(xpath = "//input[@data-t='field:input-login']")
    private WebElement loginInputField;

    @FindBy(xpath = "//button[@id='passp:sign-in']")
    private WebElement singInButton;

    @FindBy(xpath = "//input[@id='passp-field-passwd']")
    private WebElement passwordInputField;

    public PopUpWindowLogIn(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public PopUpWindowLogIn findLoginInputField(String login) {
        waitForElementPresent(loginInputField);
        loginInputField.sendKeys(login);
        return this;
    }

    public PopUpWindowLogIn findPasswordInputField(String password) {
        waitForElementPresent(passwordInputField);
        passwordInputField.sendKeys(password);
        return this;
    }

    public PopUpWindowLogIn clickSingInButtonAfterEnterLogin() {
        waitForElementPresent(singInButton);
        singInButton.click();
        return this;
    }

    public HomePage clickSingInButtonAfterEnterPasswordForBackHomePage() {
        waitForElementPresent(singInButton);
        singInButton.click();
        return new HomePage(webDriver);
    }
}