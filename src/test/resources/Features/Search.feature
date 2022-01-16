Feature: To test log in funtionality

  Scenario: Check if user can login succesfully
    Given I am on the homepage
    When I see the welcome message
    And I click on the search box
    Then I should be logged in
