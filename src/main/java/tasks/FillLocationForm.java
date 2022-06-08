package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.apache.bcel.generic.IFNONNULL;
import org.openqa.selenium.Keys;
import userinterfaces.SignupPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillLocationForm implements Task {

    private String city;
    private String zip;
    private String country;
    private String state;


    public FillLocationForm(
            String city,
            String zip,
            String country,
            String state) {
        this.city = city;
        this.zip = zip;
        this.country = country;
        this.state = state;
    }

    public static Performable withInputValues(
            String city,
            String zip,
            String country,
            String state) {
        return instrumented(FillLocationForm.class, city, zip, country, state);
    }

    @Override
    // Inherit the actor
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(city).into(SignupPage.CITY_INPUT),
                Hit.the(Keys.ARROW_DOWN).into(SignupPage.CITY_INPUT),
                Hit.the(Keys.ENTER).into(SignupPage.CITY_INPUT),
                Enter.theValue(zip).into(SignupPage.ZIP_INPUT),
                Click.on(SignupPage.COUNTRY_INPUT_DIV),
                Enter.theValue(country).into(SignupPage.COUNTRY_INPUT),
                Hit.the(Keys.ENTER).into(SignupPage.COUNTRY_INPUT)
        );
        // Valid if the State Input div exist to fill
        if (SignupPage.STATE_INPUT_DIV.getName() != null) {
            actor.attemptsTo(
                    Click.on(SignupPage.STATE_INPUT_DIV),
                    Enter.theValue(state).into(SignupPage.STATE_INPUT),
                    Hit.the(Keys.ENTER).into(SignupPage.STATE_INPUT)
            );
        }

    }
}
