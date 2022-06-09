package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import userinterfaces.SignupPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Hit.the;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class FillLocationForm implements Task {

    private String city;
    private String zip;
    private String state;


    public FillLocationForm(
            String city,
            String zip,
            String state) {
        this.city = city;
        this.zip = zip;
        this.state = state;
    }

    public static Performable withInputValues(
            String city,
            String zip,
            String state) {
        return instrumented(FillLocationForm.class, city, zip, state);
    }

    @Override
    // Inherit the actor
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(city).into(SignupPage.CITY_INPUT), // city fill city field and country filed
                WaitUntil.the(SignupPage.SPAN_FROM_GOOGLE_MAP_LIST, isVisible()).forNoMoreThan(4).seconds(), // Await Api
                the(Keys.ARROW_DOWN).into(SignupPage.CITY_INPUT),
                the(Keys.ENTER).into(SignupPage.CITY_INPUT),
                WaitUntil.the(SignupPage.CITY_INPUT, isVisible()).forNoMoreThan(1).seconds(), // Await Api
                Enter.theValue(zip).into(SignupPage.ZIP_INPUT)
        );
        // Valid if the State Input div exist to fill
        if (Visibility.of(SignupPage.STATE_INPUT_DIV).viewedBy(actor).asBoolean()) {
            actor.attemptsTo(
                    Click.on(SignupPage.STATE_INPUT_DIV),
                    Enter.theValue(state).into(SignupPage.STATE_INPUT),
                    the(Keys.ENTER).into(SignupPage.STATE_INPUT)
            );
        }

    }
}
