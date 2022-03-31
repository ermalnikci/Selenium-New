package framework.webPages;

import org.openqa.selenium.By;

public class AmazonLoginPage extends BasePage{


    By emailField = By.id("ap_email");
    By continueButton = By.id("continue");
    By passWordField = By.id("ap_password");
    By finalSignInButton = By.id("signInSubmit");
    By errorHeading = By.className("a-alert-heading");


    public void writeEmail(){
        setValue(emailField, "nikci.ermal@gmail.com");
    }
    public void clickOnContinueButton(){
        clickOn(continueButton);
    }

    public void writeAmazonPass(){
        setValue(passWordField, "gshdgslf52386158@@");
    }

    public void clickOnFinalSignin(){
        clickOn(finalSignInButton);
    }

    public String getErrorMsgHeading(){
        waitUntilElementVisible(errorHeading);
       return getTextFromElement(errorHeading);
    }


}
