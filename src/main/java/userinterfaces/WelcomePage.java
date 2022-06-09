package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.utest.com/welcome?from=signup")
public class WelcomePage extends PageObject {

    public static final Target WELCOME_PAGE_DIV = Target.the("title").locatedBy("//div[@class='welcome-page']");
}
