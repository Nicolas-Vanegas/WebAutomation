package userinterfaces;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignupPage extends PageObject {

    // Share
    // The different buttons to go to next step
    public static final Target NEXT_STEP_BUTTON = Target.the("Signup Button").locatedBy("//form[@name='userForm']/div[2]/a | ((//form/div)[2]/div/a) | //div[contains(@class, 'next-step')]/a");

    // Step 1. Personal Form
    public static final Target LANGUAGE_DIV_ID = Target.the("language div").locatedBy("//*[@id = 'languages']/div/input");
    public static final Target SPANISH_CHOICE_LANGUAGE = Target.the("Spanish Choice").locatedBy("//*[@id = 'languages']/ul/li[@class='ui-select-choices-group']/div[@id='ui-select-choices-row-0-36']");
    public static final Target FIRST_NAME_INPUT = Target.the("FistName input").located(By.id("firstName"));
    public static final Target LAST_NAME_INPUT = Target.the("LastName input").located(By.id("lastName"));
    public static final Target EMAIL_INPUT = Target.the("Email input").located(By.id("email"));
    public static final Target MONTH_INPUT = Target.the("Birthday Month").located(By.id("birthMonth"));
    public static final Target DAY_INPUT = Target.the("Birthday Day").located(By.id("birthDay"));
    public static final Target YEAR_INPUT = Target.the("Birthday Year").located(By.id("birthYear"));

    // Step 2. Location Form
    // Containers
    public static final Target STATE_INPUT_DIV = Target.the("State input div").located(By.name("stateId"));
    public static final Target COUNTRY_INPUT_DIV = Target.the("Country input div").located(By.name("countryId"));

    // Inputs
    public static final Target CITY_INPUT = Target.the("City input").located(By.id("city"));
    public static final Target ZIP_INPUT = Target.the("Zip input").located(By.id("zip"));
    public static final Target STATE_INPUT = Target.the("State input").locatedBy("//div[@name='stateId']/input[@type='search']");
    public static final Target COUNTRY_INPUT = Target.the("Country input").locatedBy("//*[@name='countryId']/input[@type='search']");

    // Step 3. Devices Form
    // Containers
    public static final Target COMPUTER_OS_DIV = Target.the("Computer os div").located(By.name("osId"));
    public static final Target OS_VERSION_DIV = Target.the("Version div").located(By.name("osVersionId"));
    public static final Target OS_LANGUAGE_DIV = Target.the("Language div").located(By.name("osLanguageId"));
    public static final Target MOBILE_DEVICE_DIV = Target.the("Mobile Device div").located(By.name("handsetMakerId"));
    public static final Target MOBILE_MODEL_DIV = Target.the("Mobile Model div").located(By.name("handsetModelId"));
    public static final Target MOBILE_DEVICE_OS = Target.the("Mobile device os div").located(By.name("handsetOSId"));

    // Inputs
    public static final Target COMPUTER_OS_INPUT = Target.the("Computer os input").locatedBy("//div[@name='osId']/input[@type='search']");
    public static final Target OS_VERSION_INPUT = Target.the("Version input").locatedBy("//div[@name='osVersionId']/input[@type='search']");
    public static final Target OS_LANGUAGE_INPUT = Target.the("Language input").locatedBy("//div[@name='osLanguageId']/input[@type='search']");
    public static final Target MOBILE_DEVICE_INPUT = Target.the("Mobile Device input").locatedBy("//div[@name='handsetMakerId']/input[@type='search']");
    public static final Target MOBILE_MODEL_INPUT = Target.the("Model input").locatedBy("//div[@name='handsetModelId']/input[@type='search']");
    public static final Target MOBILE_DEVICE_OS_INPUT = Target.the("Mobile device os input").locatedBy("//div[@name='handsetOSId']/input[@type='search']");

    // Step 4. Last Step
    public static final Target PASSWORD_INPUT = Target.the("Password input").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD_INPUT = Target.the("Confirm the password input").located(By.id("confirmPassword"));
    public static final Target TERMS_OF_USE_CHECKMARK = Target.the("Confirm the password input").locatedBy("(//label[contains(@class, 'signup-consent')])[2]/span[contains(@class, 'checkmark')]");
    public static final Target PRIVACITY_AND_SECURITY_POLICY_CHECKMARK = Target.the("Confirm the password input").locatedBy("(//label[contains(@class, 'signup-consent')])[3]/span[contains(@class, 'checkmark')]");
}
