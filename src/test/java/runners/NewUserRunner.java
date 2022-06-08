package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class) // We specify with which acceptance test library it will be run
// Cucumber => behavior-based development.
// Allows you to specify the expected behaviors of the software
// In a logical language that clients can understand.
@CucumberOptions(
        features = "src/test/resources/features/NewUser.feature", // Feature Root
        glue = "stepsDefinitions", // Steps
        tags = "@Scenario",
        snippets = SnippetType.CAMELCASE // Converting steps to java methods
)

public class NewUserRunner {
}
