package bdd.main.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountManagementPage extends AbstractWaitersPge {

    @FindBy(xpath = "//div[@class='legouser legouser_fetch-accounts_yes legouser_hidden_yes i-bem']")
    private WebElement userIconFromAccountPage;

    @FindBy(xpath = "//span[text()='Написать письмо']")
    private WebElement writeMessage;

    public AccountManagementPage(WebDriver webDriver) {
         PageFactory.initElements(webDriver,this);
    }

    public AccountManagementPage clickUserIconFromAccountPage() {
        waitForElementPresent(userIconFromAccountPage);
        userIconFromAccountPage.click();
        return this;
    }

    public WriteMessagePage clickOnWriteMessageButton() {
        waitForElementPresent(writeMessage);
        writeMessage.click();
        return new WriteMessagePage(webDriver);
    }
}
