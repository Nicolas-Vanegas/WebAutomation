package userinterfaces;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignupPage extends PageObject {

    public static final Target LANGUAGE_DIV_ID = Target.the("language div").locatedBy("//*[@id = 'languages']/div/input");
    public static final Target SPANISH_CHOICE_LANGUAGE = Target.the("Spanish Choice").locatedBy("//*[@id = 'languages']/ul/li[@class='ui-select-choices-group']/div[@id='ui-select-choices-row-0-36']");
    public static final Target FIRST_NAME_INPUT = Target.the("FistName input").located(By.id("firstName"));
    public static final Target LAST_NAME_INPUT = Target.the("LastName input").located(By.id("lastName"));
    public static final Target EMAIL_INPUT = Target.the("Email input").located(By.id("email"));
    public static final Target MONTH_INPUT = Target.the("Birthday Month").located(By.id("birthMonth"));
    public static final Target DAY_INPUT = Target.the("Birthday Day").located(By.id("birthDay"));
    public static final Target YEAR_INPUT = Target.the("Birthday Year").located(By.id("birthYear"));
    public static final Target NEXT_STEP_BUTTON = Target.the("Signup Button").locatedBy("//form[@name='userForm']/div[2]/a | ((//form/div)[2]/div/a)");
    public static final Target STATE_INPUT_DIV = Target.the("State input div").located(By.name("stateId"));
    public static final Target COUNTRY_INPUT_DIV = Target.the("Country input div").located(By.name("countryId"));
    public static final Target CITY_INPUT = Target.the("City input").located(By.id("city"));
    public static final Target STATE_INPUT = Target.the("State input").locatedBy("//div[@name='stateId']/input[@type='search']");
    public static final Target ZIP_INPUT = Target.the("Zip input").located(By.id("zip"));
    public static final Target COUNTRY_INPUT = Target.the("Country input").locatedBy("//*[@name='countryId']/input[@type='search']");


}
