Feature: Main Page Bibit

    @mulaiinvestasi
  Scenario: User click Mulai Berinvestasi from Bibit homepage
    Given user is on home page
    When user click Mulai Berinvestasi button
    Then the Register page will have displayed

    @loginvalid
  Scenario: User login with valid data
    Given user is on home page
    When user click Log In menu
    And user fill login form with valid data
    #Then the error message will has displayed
