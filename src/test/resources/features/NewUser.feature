Feature: Go to the Utest.com page and click on the registration option.
  fill the form to create a new user.

  @Scenario
  Scenario: Start filling the registration form
    Given that new user accesses the Utest Website
    When the user opens the form and enter the followings values Nicolas,Vanegas,vesorod724@falkyz.com,Spanish,number:1,24,1999,Washington,99301,United States,District of Columbia,Windows,10,Spanish,Lenovo,Lenovo X505L,Android 4.0.4,Utest121314.
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
      | vesorod724@falkyz.com |
      | Spanish               |
      | number:1              |
      | 24                    |
      | 1999                  |
      | Washington            |
      | 99301                 |
      | Colombia              |
      | District of Columbia  |
      | Windows               |
      | 10                    |
      | Spanish               |
      | Lenovo                |
      | Lenovo X505L          |
      | Android 4.0.4         |
      | Utest121314.          |
    # number:1 = January month