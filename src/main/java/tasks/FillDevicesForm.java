package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userinterfaces.SignupPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillDevicesForm implements Task {

    private String computerOperatingSystem;
    private String osVersion;
    private String osLanguage;
    private String mobileDeviceBrand;
    private String mobileModel;
    private String mobileDeviceOperatingSystem;

    public FillDevicesForm(
            String computerOperatingSystem,
            String osVersion,
            String osLanguage,
            String mobileDeviceBrand,
            String mobileModel,
            String mobileDeviceOperatingSystem) {
        this.computerOperatingSystem = computerOperatingSystem;
        this.osVersion = osVersion;
        this.osLanguage = osLanguage;
        this.mobileDeviceBrand = mobileDeviceBrand;
        this.mobileModel = mobileModel;
        this.mobileDeviceOperatingSystem = mobileDeviceOperatingSystem;

    }

    public static Performable withInputValues(
            String computerOperatingSystem,
            String osVersion,
            String osLanguage,
            String mobileDeviceBrand,
            String mobileModel,
            String mobileDeviceOperatingSystem) {
        return instrumented(FillDevicesForm.class, computerOperatingSystem, osVersion, osLanguage, mobileDeviceBrand, mobileModel, mobileDeviceOperatingSystem);
    }

    @Override
    // Inherit the actor
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SignupPage.COMPUTER_OS_DIV),
                Enter.theValue(computerOperatingSystem).into(SignupPage.COMPUTER_OS_INPUT),
                Hit.the(Keys.ENTER).into(SignupPage.COMPUTER_OS_INPUT),
                Click.on(SignupPage.OS_VERSION_DIV),
                Enter.theValue(osVersion).into(SignupPage.OS_VERSION_INPUT),
                Hit.the(Keys.ENTER).into(SignupPage.OS_VERSION_INPUT),
                Click.on(SignupPage.OS_LANGUAGE_DIV),
                Enter.theValue(osLanguage).into(SignupPage.OS_LANGUAGE_INPUT),
                Hit.the(Keys.ENTER).into(SignupPage.OS_LANGUAGE_INPUT),
                Click.on(SignupPage.MOBILE_DEVICE_DIV),
                Enter.theValue(mobileDeviceBrand).into(SignupPage.MOBILE_DEVICE_INPUT),
                Hit.the(Keys.ENTER).into(SignupPage.MOBILE_DEVICE_INPUT),
                Click.on(SignupPage.MOBILE_MODEL_DIV),
                Enter.theValue(mobileModel).into(SignupPage.MOBILE_MODEL_INPUT),
                Hit.the(Keys.ENTER).into(SignupPage.MOBILE_MODEL_INPUT),
                Click.on(SignupPage.MOBILE_DEVICE_OS),
                Enter.theValue(mobileDeviceOperatingSystem).into(SignupPage.MOBILE_DEVICE_OS_INPUT),
                Hit.the(Keys.ENTER).into(SignupPage.MOBILE_DEVICE_OS_INPUT),
                Click.on(SignupPage.NEXT_STEP_BUTTON)
                );

    }
}
