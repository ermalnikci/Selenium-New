package framework;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		// This creates cucumber reports
        plugin = {"pretty", "json:target/cucumber.json"},
        //This create auto method name in camelCase
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        
        //Path to your feature file
        features = {"src/test/resources/features"},
        // Specify tags to be executed
        tags= "@amazonSignIn-1",

        //Specify step definition package name (Note: make sure to have this package on current directory) 
        glue = {"stepdefinition"}
)
public class TestRunner {
	
}
