package framework.webPages;

import com.google.common.base.Function;
import com.sun.org.apache.xml.internal.utils.StringToStringTableVector;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import stepdefinition.SharedSD;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;



public class BasePage {

	WebDriverWait driverWait = new WebDriverWait(SharedSD.getDriver(), 15);

	// This is the most common wait function used in selenium
	public static WebElement webAction(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(SharedSD.getDriver())
				.withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofMillis(250))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.ignoring(ElementClickInterceptedException.class)
				.withMessage(
						"Webdriver waited for 15 seconds but still could not find the element therefore Timeout Exception has been thrown");

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});
		return element;
	}

	public void clickOn(By locator) {
		try{
//			SharedSD.getDriver().findElement(locator).click();
			webAction(locator).click();
		} catch (NoSuchElementException e){
			e.printStackTrace();
		}

	}

	public void setValue(By locator, String value) {
		webAction(locator).sendKeys(value);
	}

	public String getTextFromElement(By locator) {
		return webAction(locator).getText();
	}

	public boolean isElementDisplayed(By locator) {
		return webAction(locator).isDisplayed();
	}

	public boolean isElementSelected(By locator) {
		return webAction(locator).isSelected();
	}

	public void selectFromDropdown(By locator, String dropdownText) {
		WebElement month = webAction(locator);
		Select selectMonth = new Select(month);
		//select element by visible text
		selectMonth.selectByVisibleText(dropdownText);
	}

	public void selectFromDropdown(By locator, int index) {
		WebElement month = webAction(locator);
		Select selectMonth = new Select(month);
		//select element by index
		selectMonth.selectByIndex(index);
	}

	public boolean isElementEnabled(By locator) {
		return webAction(locator).isEnabled();
	}

	public void selectFromCalendar(By monthNameLocator,String expectedMonthText,By arraySignLocator,By allDaysLocatorOfMonth){

		while (true) {

			String text = SharedSD.getDriver().findElement( monthNameLocator ).getText();

			if (text.equals( expectedMonthText ))
			{
				break;

			}
			else
			{
				SharedSD.getDriver().findElement( arraySignLocator ).click();

			}
		}
		SharedSD.getDriver().findElement( allDaysLocatorOfMonth ).click();
	}


	public void selectFromMenuList(By allMenuListLocator,String IndivisualMenuText){
		List<WebElement> list = SharedSD.getDriver().findElements(allMenuListLocator);
		for (WebElement ele : list) {
			if (ele.getText().contains(IndivisualMenuText)) {
				ele.click();
				break;
			}
		}
	}

	public void autoComplete(By destinationFieldLocator, String cityName, By suggestedCities, String finalDestination){
		setValue( destinationFieldLocator , cityName);
		List<WebElement> list = SharedSD.getDriver().findElements(suggestedCities);
		for (WebElement ele : list) {
			if(ele.getText().contains(finalDestination)) {
				ele.click();
				break;
			}
		}
	}

	public void scrollToElement(By locator) {
		JavascriptExecutor js = (JavascriptExecutor) SharedSD.getDriver();
		WebElement element = SharedSD.getDriver().findElement(locator);
		js.executeScript("arguments[0].scroolIntoView(true);" , element);
	}


	public void waitUntilClickable(By locator){
		driverWait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void waitUntilElementVisible(By locator){
		driverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void mouseOver(By locator){
		Actions action = new Actions(SharedSD.getDriver());
		action.moveToElement(SharedSD.getDriver().findElement(locator)).perform();
	}

}
