Feature: Go to the Utest.com page and click on the registration option.
  fill the form to create a new user. Then redirect to welcome page.

  @Scenario
  Scenario: Filling the registration form
    Given that new user accesses the Utest Website
    When the user opens the form and fill the signup form with followings values Nicolas,Vanegas,sa42@game4hr.com,Spanish,number:1,24,1999,Washington,99301,United States,District of Columbia,Windows,10,Spanish,Lenovo,Lenovo X505L,Android 4.0.4,Utest121314.
    Then the Customer is redirected to welcome page

  @ScenarioWithExamples
  Scenario Template: Filling the registration form
    Given that a new user accesses the Utest website
    When the user opens the form and fill the signup form
      | <firstName> | <lastName> | <email> | <language> | <birthMonth> | <birthDay> | <birthYear> | <city> | <zip> | <country> | <state> | <os> | <osVersion> | <osLanguage> | <mobileDeviceBrand> | <mobileDeviceModel> | <mobileDeviceOs> | <mobileDeviceOs> | <password> |
    Then the Customer is redirected to welcome page

    Examples:
      | firstName | lastName   | email                        | language | birthMonth | birthDay | birthYear | city       | zip    | country       | state                | os      | osVersion | osLanguage | mobileDeviceBrand | mobileDeviceModel | mobileDeviceOs | password     |
      | Nicolas   | Vanegas    | a4@game3hr.com               | Spanish  | number:1   | 24       | 1999      | Washington | 99301  | United States | District of Columbia | Windows | 10        | Spanish    | Lenovo            | Lenovo X505L      | Android 4.0.4  | Utest121314. |
      | Pedro     | Picapierda | PedroPicapiedra3@hotmail.com | Spanish  | number:3   | 4        | 1979      | Bogota     | 110831 | Colombia      | null                 | Windows | Xp        | Chinese    | LG                | Neon 2            | Android 4.0.3  | Utest121314. |
      | Pablo     | Marmol     | PabloMarmol3@hotmail.com     | Spanish  | number:2   | 12       | 2003      | New Delhi  | 110001 | India         | null                 | Linux   | Ubuntu    | English    | Apple             | Iphone            | iOS 15.1       | Utest121314. |

    # number:1 = January month