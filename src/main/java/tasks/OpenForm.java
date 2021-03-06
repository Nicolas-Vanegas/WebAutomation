package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.HomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenForm implements Task{

    public static Performable withJoinTodayButton() {
        return instrumented(OpenForm.class);
    }

    @Override
    // Inherit the actor
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(HomePage.JOIN_TODAY_BUTTON)

        );
    }
}
