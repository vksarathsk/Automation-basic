Feature: Access to Leafground page elements

  @AlertModel
  Scenario: Handle to Alert Model
    Given Go to the Alert model page
    And click the Show button for Alert Simple Dialog
    When get the Alert model text
    And Accept the Alert Model
    Then Verify the UI text

