package bdd.main.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WriteMessagePage extends AbstractWaitersPge {

    @FindBy(css = ".ComposeRecipients-ToField .composeYabbles")
    private WebElement inputFieldWhom;

    @FindBy(xpath = "//input[@name='subject']")
    private WebElement inputFieldTopicOfMessage;

    @FindBy(css = ".cke_wysiwyg_div")
    private WebElement inputFieldWriteSomething;

    @FindBy(xpath = "//div[@class='ControlButton ControlButton_button_close']")
    private WebElement closeWindowWriteLetter;

    @FindBy(xpath = "//span[text()='Черновики']")
    private WebElement draftsButton;

    public WriteMessagePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public WriteMessagePage searchInputFieldWhom(String receiverEmailAddress) {
        waitForElementPresent(inputFieldWhom);
        inputFieldWhom.sendKeys(receiverEmailAddress);
        return this;
    }

    public WriteMessagePage searchInputFieldTopic(String topicOfMessage) {
        waitForElementPresent(inputFieldTopicOfMessage);
        inputFieldTopicOfMessage.sendKeys(topicOfMessage);
        return this;
    }

    public WriteMessagePage searchInputFieldWriteSomething(String textOfMessage) {
        waitForElementPresent(inputFieldWriteSomething);
        inputFieldWriteSomething.sendKeys(textOfMessage);
        return this;
    }

    public WriteMessagePage clickCloseWriteMessageWindowButton() {
        waitForElementPresent(closeWindowWriteLetter);
        closeWindowWriteLetter.click();
        return this;
    }

    public DraftsPage clickDraftsButton() {
        waitForElementPresent(draftsButton);
        draftsButton.click();
        return new DraftsPage(webDriver);
    }
}
