package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.SignupPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;

public class FillLastSteps implements Task {

    private String password;

    public FillLastSteps(String password) {
        this.password = password;
    }

    public static Performable withInputValues(String password) {
        return instrumented(FillLastSteps.class, password);
    }

    @Override
    // Inherit the actor
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(password).into(SignupPage.PASSWORD_INPUT),
                Enter.theValue(password).into(SignupPage.CONFIRM_PASSWORD_INPUT),
                WaitUntil.the(SignupPage.PASSWORD_CONFIRM_IS_DONE, containsText("done")).forNoMoreThan(2).seconds(),
                Click.on(SignupPage.TERMS_OF_USE_CHECKMARK),
                Click.on(SignupPage.PRIVACITY_AND_SECURITY_POLICY_CHECKMARK)
        );

    }
}
