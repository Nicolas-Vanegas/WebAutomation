Feature: Go to the Utest.com page and click on the registration option.
  fill the form to create a new user.

  @Scenario
  Scenario: Start filling the registration form
    Given that new user accesses the Utest Website
    When the user clicks Join Today button
    Then the registration form opens

  Scenario Template: Start filling the registration form
    Given that a new user accesses the Utest website
    When the user clicks join Today button
    | <button> |
    Then the registration form opens

  Examples:
    | button |
    | Join Today |