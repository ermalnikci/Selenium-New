package stepdefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.AmazonLandingPage;
import org.testng.Assert;


public class AmazonSD {

    private AmazonLandingPage amazon = new AmazonLandingPage();


    @Given("^I am on Amazon home page$")
    public void iAmOnHomePage() {
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Amazon.com. Spend less. Smile more.", "Invalid Home Page");
    }

    @When("^I search for an (.*)$")
    public void searhForItem(String item){
        amazon.writeItemName(item);
    }

    @Then("^I verify (.*)$")
    public void verifyItem(String name){
        Assert.assertTrue(amazon.isAppleWatchDisplayed(name));

    }


}
