package stepdefinition;

import framework.webPages.AmazonCart;
import io.cucumber.java.en.When;

public class AmazonCartSD {

    AmazonCart cart = new AmazonCart();


    @When("^I scroll down to (.+)$")
    public void scrollDownToProvider(String value){
        cart.scrollDownTExpectedProvider(value);
    }
}
