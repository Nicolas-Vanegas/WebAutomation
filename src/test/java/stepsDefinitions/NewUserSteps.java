package stepsDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.*;
import userinterfaces.HomePage;
import userinterfaces.WelcomePage;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class NewUserSteps {

    @Managed()
    private WebDriver browser;
    private Actor actor = Actor.named("Global");
    private HomePage homePage = new HomePage();

    @Given("^that new user accesses the Utest Website$")
    public void thatNewUserAccessesTheUtestWebsite() {
        actor.can(BrowseTheWeb.with(browser));
        actor.wasAbleTo(Open.browserOn(homePage));
        browser.manage().window().maximize();
    }

    @When("^the user opens the form and fill the signup form with followings values (.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$")
    public void theUserOpensTheFormAndFillTheSignupFormWithFollowingsValues(
            String firstName,
            String lastName,
            String email,
            String language,
            String monthOfBirth,
            String dayOfBirth,
            String yearOfBirth,
            String city,
            String zip,
            String state,
            String computerOperatingSystem,
            String osVersion,
            String osLanguage,
            String mobileDeviceBrand,
            String mobileModel,
            String mobileDeviceOperatingSystem,
            String password) {
        actor.wasAbleTo(
                OpenForm.withJoinTodayButton(),
                FillPersonalForm.withInputValues(firstName, lastName, email, language, monthOfBirth, dayOfBirth, yearOfBirth),
                GoToNextFormStep.next(),
                FillLocationForm.withInputValues(city, zip, state),
                GoToNextFormStep.next(),
                FillDevicesForm.withInputValues(computerOperatingSystem, osVersion, osLanguage, mobileDeviceBrand, mobileModel, mobileDeviceOperatingSystem),
                FillLastSteps.withInputValues(password),
                GoToNextFormStep.next()
        );
    }

    @Then("^the Customer is redirected to welcome page$")
    public void theCustomerIsRedirectedToWelcomePage() {
        actor.attemptsTo(WaitUntil.the(WelcomePage.WELCOME_PAGE_CONTAINER, isPresent()).forNoMoreThan(5).seconds());
        actor.should(seeThat(the(WelcomePage.WELCOME_PAGE_CONTAINER), isPresent()));
    }

    @When("^the user opens the form and fill the signup form$")
    public void theUserOpensTheFormAndFillTheSignupForm(List<String> data) {
        actor.wasAbleTo(
                OpenForm.withJoinTodayButton(),
                FillPersonalForm.withInputValues(data.get(0), data.get(1), data.get(2), data.get(3), data.get(4), data.get(5), data.get(6)),
                GoToNextFormStep.next(),
                FillLocationForm.withInputValues(data.get(7), data.get(8), data.get(9)),
                GoToNextFormStep.next(),
                FillDevicesForm.withInputValues(data.get(10), data.get(11), data.get(12), data.get(13), data.get(14), data.get(15)),
                FillLastSteps.withInputValues(data.get(16)),
                GoToNextFormStep.next()
        );
    }
}
