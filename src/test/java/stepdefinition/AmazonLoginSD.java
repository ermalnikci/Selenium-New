package stepdefinition;


import framework.webPages.AmazonLandingPage;
import framework.webPages.AmazonLoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AmazonLoginSD {

    AmazonLandingPage landingPage = new AmazonLandingPage();
    AmazonLoginPage login = new AmazonLoginPage();

    @When("^I mouse over Hello, Sign In$")
    public void mouseOverHelloSignIn(){
        landingPage.mouseOverSignIn();
    }

    @When("^I click on floating Sign-in$")
    public void clickFloatingSignIn(){
        landingPage.clickOnFloatingSignIn();
    }

    @When("^I write email address$")
    public void writeEmailAddress(){
        login.writeEmail();
    }

    @When("^I click on Continue button$")
    public void clickContinueButton(){
        login.clickOnContinueButton();
    }

    @When("^I write the password$")
    public void writeThepassword(){
        login.writeAmazonPass();
    }

    @When("^I click on final Sign-In button$")
    public void clickFinalSignIn(){
        login.clickOnFinalSignin();
    }

    @Then("^Verify invalid login error msg$")
    public void verifyInvalidLoginErrorMsg(){
        String actualErrorMsg = login.getErrorMsgHeading() ;
        String expectedErrorMsg = "There was a problem";
        Assert.assertEquals(actualErrorMsg, expectedErrorMsg, "Something wrong in error msg");
    }


}
