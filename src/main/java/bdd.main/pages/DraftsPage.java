package bdd.main.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static bdd.main.Constants.ConstantsForTests.*;

public class DraftsPage extends AbstractWaitersPge {

    @FindBy(xpath = "//button[@class='Button2 Button2_pin_circle-circle Button2_view_default Button2_size_l']")
    private WebElement sendMailButton;

    @FindBy(xpath = "//span[text()='" + SUBJECT_OF_LETTER_WHO_WE_FIND + "']")
    private WebElement letterThatWasWritten;

    @FindBy(xpath = "//span[text()='Отправленные']")
    private WebElement sentLetterButton;

    public DraftsPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public DraftsPage findWroteMessage() {
        waitForElementPresent(letterThatWasWritten);
        letterThatWasWritten.click();
        return this;
    }

    public DraftsPage clickSendMailButton() {
        waitForElementPresent(sendMailButton);
        sendMailButton.click();
        return this;
    }

    public SentMessagePage clickSentMessageButton() {
        waitForElementPresent(sentLetterButton);
        sentLetterButton.click();
        return new SentMessagePage(webDriver);
    }
}