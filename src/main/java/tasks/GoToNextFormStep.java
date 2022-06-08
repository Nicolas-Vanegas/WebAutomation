package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.HomePage;
import userinterfaces.SignupPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToNextFormStep implements Task {
    public static Performable locationStep() {
        return instrumented(GoToNextFormStep.class);
    }

    @Override
    //Inherit the actor
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SignupPage.NEXT_STEP_BUTTON)
        );
    }
}
