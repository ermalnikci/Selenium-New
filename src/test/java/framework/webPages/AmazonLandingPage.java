package framework.webPages;

import org.openqa.selenium.By;

public class AmazonLandingPage extends BasePage{

    String itemName= "";
     By searchBoxLocator = By.id("");
     By searchButton = By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']");
     By appleWatch = By.xpath("//span[contains(text(),'"+ itemName +"Series 5 (GPS, 44mm) - Space Gray Alum')]");
     By searchIcon = By.id("nav-search-submit-button");
    By helloSignIn = By.xpath("//span[text()='Hello, Sign in']");
    By floatingSignIn = By.xpath("//div[@id='nav-flyout-ya-signin']/a");


    public void mouseOverSignIn(){
        waitUntilElementVisible(helloSignIn);
        mouseOver(helloSignIn);
    }


    public void writeItemName(String text){
        setValue(searchBoxLocator, text);
    }

    public void clickOnSearch(){
        waitUntilClickable(searchButton);
        clickOn(searchButton);
    }

    public boolean isAppleWatchDisplayed(String itemName){
        this.itemName = itemName;
        return isElementDisplayed(appleWatch);
    }

    public void clickSearchIcon(){
        waitUntilElementVisible(searchIcon);
        clickOn(searchIcon);
    }

    public void clickOnFloatingSignIn(){
        clickOn(floatingSignIn);
    }


}
