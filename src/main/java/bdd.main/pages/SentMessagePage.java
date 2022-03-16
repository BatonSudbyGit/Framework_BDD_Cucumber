package bdd.main.pages;

import bdd.main.jsexecutor.JSExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static bdd.main.Constants.ConstantsForTests.*;

public class SentMessagePage extends AbstractWaitersPge {

    @FindBy(xpath = "//*[@id='js-apps-container']/div[2]/div[7]/div/div[3]/div[3]/div[3]/div[1]/div[5]/div[1]/div/div/div[3]/div/div[2]/div/div/div/a/div/span[2]/div")//For example
    private WebElement toShow;

    @FindBy(xpath = "//div[@class='user-pic user-pic_has-plus_ user-account__pic']")
    private WebElement userIconFromSentLetters;

    @FindBy(xpath = "//span[text()='Выйти из сервисов Яндекса']")
    private WebElement loginOffButton;

    @FindBy(xpath = "//span[text()='"+ SUBJECT_OF_LETTER_WHO_WE_FIND +"']")
    private WebElement sendLetter;

    public SentMessagePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public SentMessagePage checkSendingMessage() {
        waitForElementPresent(sendLetter);
        JSExecutor.highlightWithJS(webDriver.findElement(By.xpath("//span[text()='"+ SUBJECT_OF_LETTER_WHO_WE_FIND +"']")));
        return this;
    }

    public SentMessagePage clickUserIconFromSentLetters() {
        waitForElementPresent(userIconFromSentLetters);
        userIconFromSentLetters.click();
        return this;
    }

    public SentMessagePage clickLogOfButton() {
        waitForElementPresent(loginOffButton);
        loginOffButton.click();
        return this;
    }
}
