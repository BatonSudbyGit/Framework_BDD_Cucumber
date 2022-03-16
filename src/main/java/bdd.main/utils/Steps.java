package bdd.main.utils;

import bdd.main.managers.DriverManager;
import bdd.main.pages.AccountManagementPage;
import bdd.main.pages.DraftsPage;
import bdd.main.pages.HomePage;
import bdd.main.pages.PopUpWindowLogIn;
import bdd.main.pages.SentMessagePage;
import bdd.main.pages.WriteMessagePage;
import org.openqa.selenium.WebDriver;

public class Steps {

    WebDriver webDriver = DriverManager.getWebDriver();

    HomePage homePage = new HomePage(webDriver);
    PopUpWindowLogIn logInPage = new PopUpWindowLogIn(webDriver);
    AccountManagementPage accountManagementPage = new AccountManagementPage(webDriver);
    WriteMessagePage writeMessagePage = new WriteMessagePage(webDriver);
    DraftsPage draftsPage = new DraftsPage(webDriver);
    SentMessagePage sentMessagePage = new SentMessagePage(webDriver);

    public Steps(WebDriver webDriver) {
    }

    public void openYandexMainPage() {
        homePage.openYandexMainPage();
    }

    public void openLoginPage() {
        homePage.clickLogInButton();
        System.out.println("Login page has been opened");
    }

    public void login(String login, String password) {
        logInPage.findLoginInputField(login);
        System.out.println("Login " + login + "has been entered successful");
        logInPage.clickSingInButtonAfterEnterLogin();
        logInPage.findPasswordInputField(password);
        System.out.println("Password " + password + "has been entered successful");
        logInPage.clickSingInButtonAfterEnterPasswordForBackHomePage();
        System.out.println("Authorization has been successful");
    }

    public void openAccountManagementPage() {
        homePage.clickUserIconButtonFromHomePage();
        homePage.clickAccountManagementButton();
        System.out.println("The account management page has been opened successfully");
    }

    public void openWriteMessagePage() {
        accountManagementPage.clickUserIconFromAccountPage();
        accountManagementPage.clickOnWriteMessageButton();
        System.out.println("The write message page has been opened successfully");
    }

    public void writeNewMessage(String receiverEmailAddress, String topicOfMessage, String textOgMessage) {
        writeMessagePage.searchInputFieldWhom(receiverEmailAddress);
        writeMessagePage.searchInputFieldTopic(topicOfMessage);
        writeMessagePage.searchInputFieldWriteSomething(textOgMessage);
        writeMessagePage.clickCloseWriteMessageWindowButton();
        System.out.println("The letter has been written successfully");
    }

    public void openDraftsPage() {
        writeMessagePage.clickDraftsButton();
        System.out.println("The drafts page has been opened successfully");
    }

    public void findAndSendMessage() {
        draftsPage.findWroteMessage();
        System.out.println("The wrote message has been found successfully");
        draftsPage.clickSentMessageButton();
        System.out.println("The message has been sent successfully");
    }

    public void openSentMessagePage() {
        draftsPage.clickSentMessageButton();
        System.out.println("The sent letter page has been opened successfully");
    }

    public void checkSendingMessage() {
        sentMessagePage.checkSendingMessage();
        System.out.println("The letter has been found successfully");
    }
}