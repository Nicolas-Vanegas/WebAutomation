Feature: Go to the Utest.com page and click on the registration option.
  fill the form to create a new user.

  @Scenario
  Scenario: Start filling the registration form
    Given that new user accesses the Utest Website
    When the user opens the form and enter the followings values Nicolas,Vanegas,Nicolas.p@hotmail.com,Spanish,number:1,24,1999,Washington,99301,United States,District of Columbia
    Then the user is created

  Scenario Template: Start filling the registration form
    Given that a new user accesses the Utest website
    When the user opens the form with button JoinToday and enter the followings values
      | <inputValue> |
    Then the user is created

    Examples:
      | inputValue            |
      | Nicolas               |
      | Vanegas               |
      | Nicolas.p@hotmail.com |
      | Spanish               |
      | number:2              |
      | 24                    |
      | 1999                  |
      | Washington            |
      | 99301                 |
      | Colombia              |
      | District of Columbia  |

    # number:1 = January month