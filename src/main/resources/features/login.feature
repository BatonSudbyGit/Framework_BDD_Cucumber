Feature: Yandex Message Test

  Given I open Yandex main page

  Scenario Outline: Login and write new message with saving in Drafts
    When I login to mail with <login> and <password>
    And I open Account management page
    And I write new message with <email>, <topic>, <text>
    And I open drafts page
    And I find and send message
    Then I check sending message
    Examples:
      | login           | password        | email                    |topic                      | text                      |
      | wlad.ustinov349 | 2234562albatros | wladustinov349@gmail.com | First topic from Cucumber | First text from Cucumber  |
      | wlad.ustinov349 | 2234562albatros | wladustinov349@gmail.com | Second topic from Cucumber| Second text from Cucumber |