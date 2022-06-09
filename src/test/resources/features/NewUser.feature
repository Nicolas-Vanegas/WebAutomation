Feature: Go to the Utest.com page and click on the registration option.
  fill the form to create a new user. Then redirect to welcome page.

  Background:
    Given that new user accesses the Utest Website

  @Scenario
  Scenario: Filling the registration form
    When the user opens the form and fill the signup form with followings values Nicolas,Vanegas,NicolasVanegas1@hotmail.com,Spanish,number:1,24,1999,Washington,99301,District of Columbia,Windows,10,Spanish,Lenovo,Lenovo X505L,Android 4.0.4,Asdlkj121314.
    Then the Customer is redirected to welcome page

  @ScenarioWithExamples
  Scenario Template: Filling the registration form
    When the user opens the form and fill the signup form
      | <firstName> | <lastName> | <email> | <language> | <birthMonth> | <birthDay> | <birthYear> | <city> | <zip> | <state> | <os> | <osVersion> | <osLanguage> | <mobileDeviceBrand> | <mobileDeviceModel> | <mobileDeviceOs> | <mobileDeviceOs> | <password> |
    Then the Customer is redirected to welcome page

    Examples:
      | firstName | lastName | email                      | language | birthMonth | birthDay | birthYear | city       | zip    | state                | os      | osVersion | osLanguage | mobileDeviceBrand | mobileDeviceModel | mobileDeviceOs | password      |
      | Camila    | Pineda   | CamilaPineda1@hotmail.com  | Spanish  | number:1   | 24       | 1999      | Washington | 99301  | District of Columbia | Windows | 10        | Spanish    | Lenovo            | Lenovo X505L      | Android 4.0.4  | Asdlkj121314. |
      | Sofia     | Cardenas | SofiaCardenas1@hotmail.com | Spanish  | number:3   | 1        | 1989      | Bogota     | 110831 | null                 | Windows | Xp        | Chinese    | LG                | Neon 2            | Android 4.0.3  | Asdlkj121314. |

    # number:1 = January month