package stepsDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.FillLocationForm;
import tasks.FillPersonalForm;
import tasks.GoToNextFormStep;
import tasks.OpenForm;
import userinterfaces.HomePage;

public class NewUserSteps {

    @Managed(driver = "chrome")
    private WebDriver navigator;
    private Actor actor = Actor.named("Global");
    private HomePage homePage = new HomePage();

    @Given("^that new user accesses the Utest Website$")
    public void thatNewUserAccessesTheUtestWebsite() {
        actor.can(BrowseTheWeb.with(navigator));
        actor.wasAbleTo(Open.browserOn(homePage));
    }

    @When("^the user opens the form and enter the followings values (.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$")
    public void theUserOpensTheFormAndEnterTheFollowingsValues(
            String firstName,
            String lastName,
            String email,
            String language,
            String monthOfBirth,
            String dayOfBirth,
            String yearOfBirth,
            String city,
            String zip,
            String country,
            String state) {
        actor.wasAbleTo(
                OpenForm.withJoinTodayButton(),
                FillPersonalForm.withInputValues(firstName, lastName, email, language, monthOfBirth, dayOfBirth, yearOfBirth),
                GoToNextFormStep.locationStep(),
                FillLocationForm.withInputValues(city, zip, country, state),
                GoToNextFormStep.locationStep()
        );
    }

    @Then("^the user is created$")
    public void theUserIsCreated() {
    }

    @Given("^that a new user accesses the Utest website$")
    public void thatANewUserAccessesTheUtestWebsite() {
    }

    @When("^the user opens the form and enter the followings values$")
    public void theUserOpensTheFormAndEnterTheFollowingsValues(DataTable arg1) {
    }

}
