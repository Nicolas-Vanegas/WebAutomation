package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/welcome?from=signup")
public class WelcomePage extends PageObject {

    public static final Target WELCOME_PAGE_CONTAINER = Target.the("welcome highlight").located(By.className("welcome-page"));
}
