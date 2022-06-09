package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/NewUser.feature",
        glue = "stepsDefinitions",
        tags = "",
        snippets = SnippetType.CAMELCASE
)

public class NewUserRunner {
}
