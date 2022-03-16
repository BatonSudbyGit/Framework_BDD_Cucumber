package main.steps;

import bdd.main.managers.DriverManager;
import bdd.main.pages.HomePage;
import bdd.main.utils.Steps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class CucumberSteps {

    WebDriver webDriver = DriverManager.getWebDriver();

    Steps steps = new Steps(webDriver);

    @Given("^I open Yandex main page")
    public void iOpenYandexMainPage() {
        //new HomePage(driver).openYandexMainPage();
    }

    @When("^I login to mail with (.*) and (.*)$")
    public void iLogin(String login, String password) {
        new HomePage(webDriver).clickLogInButton();
        steps.login(login, password);
    }

    @And("^I open Account management page")
    public void iOpenAccountManagementPage() {
        steps.openAccountManagementPage();
    }

    @And("^I write new message with ([A-z0-9\\W]*@[a-z]*.[com]*), (.*), (.*)$")
    public void iWriteNewMessage(String email, String topic, String text) {
        steps.openWriteMessagePage();
        steps.writeNewMessage(email, topic, text);
    }

    @And("^I open drafts page")
    public void iOpenDraftsPage() {
        steps.openDraftsPage();
    }

    @And("^I find and send message")
    public void iFindAndSendMessage() {
        steps.findAndSendMessage();
    }

    @Then("^I check sending message")
    public void iCheckSendingMessage() {
        steps.openSentMessagePage();
        steps.checkSendingMessage();
    }
}