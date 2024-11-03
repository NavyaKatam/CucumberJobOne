package util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtils {
	
	WebDriver driver;
	
	public ElementUtils(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnTheElement(WebElement element,int durationInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(durationInSeconds));
		WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable(element));
		webElement.click();
	}
	
	public void enterTextIntotheElement(WebElement element,int durationInSeconds,String textToBeEntered) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(durationInSeconds));
		WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable(element));
		webElement.click();
		webElement.sendKeys(textToBeEntered);
	}
	
	public boolean checkWetherElementIsDisplayed(WebElement element) {
		return element.isDisplayed();
	}
	
	public boolean checkWhetherElementIsSelected(WebElement element,int durationInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(durationInSeconds));
		WebElement webElement = wait.until(ExpectedConditions.visibilityOf(element));
		return webElement.isSelected();
	}

}
