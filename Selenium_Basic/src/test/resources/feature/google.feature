Feature: features to test google search functionality

  Scenario: Validate google search is working
    Given user is on google search page
    When user enter a "selenium" in search box
    And  hits enter
    Then user is navigated to search results

  Scenario: Amazon dropdown validation
    Given user navigate to Amazon home page
    When get the dropdown values
    And select value option

    Scenario Outline: OrangeHRM Login page validation
      Given User is on OrangeHRM login page
      When Verify the login page
      And User enter the "<Username>" and "<Password>"
      Then Click the Login button
      And User is navigated to Dashboard page

      Examples:
        | Username | Password |
        | Admin    | admin123 |

  @smoketest
  Scenario Outline: Amazon dropdown validation

    When select the dropdown value for "<DropdownValue>"
    And user enter the value "<SearchValue>"
    Then click the search icon
    And User is navigated the search page

    Examples:
      | DropdownValue | SearchValue |
      | Electronics   | samsung s23 |
