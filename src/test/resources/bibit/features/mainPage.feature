Feature: Form Submit Data

    @valid
  Scenario: User submit form with valid data
    Given user is on home page
    And user fill form with valid data
    Then the form has successfully submitted

    @invalid
  Scenario: User submit form with invalid data
    Given user is on home page
    And user fill form with invalid data
    Then the error message will has displayed
