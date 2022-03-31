package stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.AmazonCart;
import framework.webPages.AmazonLandingPage;
import org.testng.Assert;


public class AmazonCheckOutSD {

    AmazonLandingPage landingPage = new AmazonLandingPage();
    AmazonCart cart = new AmazonCart();

    @When("^I search for (.+)$")
    public void searchForProduct(String value){
        cart.searchForItem(value);
    }



    @When("^I click on my cart$")
    public void clickOnMyCart(){
        cart.clickOnCart();
    }

    @When("^I click on search box$")
    public void clickSearch(){
    landingPage.clickOnSearch();
    }


    @When("^I write (.*) in search box$")
    public void writeProductName(String name){
        landingPage.writeItemName(name);
    }

    @When("^I click on search icon$")
    public void clickOnSearchIcon(){
        landingPage.clickSearchIcon();
    }

    @Then("^Verify (.*) is added to my Amazon cart for appropriate (.*)$")
    public void verifyCartItem(String value, String text){
        String actualText = "";
        if(text.equals("counter table")) {
            actualText = cart.getCounterTableTitle();
        } else if (text.equals("counter chair")){
            actualText = cart.getCounterChairTitle();
        } else if(text.equals("Mug")){
            actualText = cart.getMugTitle();
        }
        String expectedText = value;
        Assert.assertEquals(actualText, expectedText, "Expected title is not matching expected title.");
    }

    @Then("^I should see (.+) in my cart$")
    public void verifyProductInCart(String value){
        String expectedValue = value;
        String actualValue= cart.getActualItemName();
        Assert.assertEquals(actualValue, expectedValue, " Verification failed");
    }


}
