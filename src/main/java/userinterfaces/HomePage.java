package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://utest.com")
public class HomePage extends PageObject {

    public static final Target JOIN_TODAY_BUTTON = Target.the("Signup Button").locatedBy("((//div[@class='navbar navbar-default navbar-fixed-top unauthenticated-nav-bar']/div[contains(@class, 'unauthenticated-nav-bar__links')]/ul)[2]/li)[2]/a[@class='unauthenticated-nav-bar__sign-up']");
}
