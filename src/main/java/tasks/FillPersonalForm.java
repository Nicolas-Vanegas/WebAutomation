package tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterfaces.SignupPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillPersonalForm implements Task {

    private String firstName;
    private String lastName;
    private String email;
    private String language;
    private String monthOfBirth;
    private String dayOfBirth;
    private String yearOfBirth;

    public FillPersonalForm(
            String firstName,
            String lastName,
            String email,
            String language,
            String monthOfBirth,
            String dayOfBirth,
            String yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.language = language;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public static Performable withInputValues(
            String firstName,
            String lastName,
            String email,
            String language,
            String monthOfBirth,
            String dayOfBirth,
            String yearOfBirth) {
        return instrumented(FillPersonalForm.class, firstName, lastName, email, language, monthOfBirth, dayOfBirth, yearOfBirth);
    }

    @Override
    // Inherit the actor
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstName).into(SignupPage.FIRST_NAME_INPUT),
                Enter.theValue(lastName).into(SignupPage.LAST_NAME_INPUT),
                Enter.theValue(email).into(SignupPage.EMAIL_INPUT),
                Click.on(SignupPage.LANGUAGE_DIV_ID),
                Click.on(SignupPage.SPANISH_CHOICE_LANGUAGE),
                Click.on(SignupPage.MONTH_INPUT),
                SelectFromOptions.byValue(monthOfBirth).from(SignupPage.MONTH_INPUT),
                SelectFromOptions.byVisibleText(dayOfBirth).from(SignupPage.DAY_INPUT),
                SelectFromOptions.byVisibleText(yearOfBirth).from(SignupPage.YEAR_INPUT)
        );
    }
}
