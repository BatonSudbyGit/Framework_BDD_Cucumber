package bdd.main.pages;

import bdd.main.managers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static bdd.main.Constants.ConstantsForTests.*;

public class HomePage extends AbstractWaitersPge{

    @FindBy(xpath = "//div[text()='Войти']")
    private WebElement logInButton;

    @FindBy(xpath = "//span[@class='username desk-notif-card__user-name']")
    private WebElement userIcon;

    @FindBy(xpath = "//span[text()='Управление аккаунтом']")
    private WebElement accountManagementButton;

    public HomePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public PopUpWindowLogIn clickLogInButton() {
        waitForElementPresent(logInButton);
        logInButton.click();
        return new PopUpWindowLogIn(webDriver);
    }

    public HomePage clickUserIconButtonFromHomePage() {
        waitForElementPresent(userIcon);
        userIcon.click();
        return this;
    }

    public AccountManagementPage clickAccountManagementButton() {
        waitForElementPresent(accountManagementButton);
        accountManagementButton.click();
        return new AccountManagementPage(webDriver);
    }

    public HomePage openYandexMainPage() {
        webDriver.get(YANDEX_MAIN_PAGE);
        webDriver.manage().window().maximize();
        return this;
    }
}