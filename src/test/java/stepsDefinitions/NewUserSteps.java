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

    @When("^the user clicks Join Today button$")
    public void theUserClicksJoinTodayButton() {
        actor.wasAbleTo(

        );
    }

    @Then("^the registration form opens$")
    public void theRegistrationFormOpens() {
    }

    @Given("^that a new user accesses the Utest website$")
    public void thatANewUserAccessesTheUtestWebsite() {
    }

    @When("^the user clicks join Today button$")
    public void theUserClicksJoinTodayButton(DataTable arg1) {
    }

}
