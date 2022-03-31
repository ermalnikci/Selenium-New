package framework.webPages;

import org.openqa.selenium.By;

public class AmazonCart extends BasePage{


    By counterChairTitle = By.partialLinkText(" ALPHA HOME Bar Stools Counter Height");
    By counterTableTitle = By.partialLinkText("ACME Cargo Counter Height Table");
    By cartIcon = By.xpath("xpathForCart");
    By searchBar = By.xpath("searchBar");
    By searchIcon = By.xpath("searchIcon");
    By productInCart = By.id("djewdhw");
    String productName = "";
    By expectedProvider = By.xpath("//span[text()='" + productName + "']");



    public String getCounterTableTitle(){
       return getTextFromElement(counterTableTitle);
    }

    public String getCounterChairTitle(){
       return getTextFromElement(counterChairTitle);
    }

    public String getMugTitle(){
       return getTextFromElement(counterChairTitle);
    }

    public void clickOnCart(){
        clickOn(cartIcon);
    }

    public void searchForItem(String text){
        waitUntilElementVisible(searchBar);
    setValue(searchBar, text);
    clickOn(searchIcon);
    }

    public String getActualItemName(){
        return getTextFromElement(productInCart);
    }

    public void scrollDownTExpectedProvider(String value){
        productName = value;
        scrollToElement(expectedProvider);
    }

}
