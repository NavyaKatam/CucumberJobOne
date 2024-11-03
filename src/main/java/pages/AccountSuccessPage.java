package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.ElementUtils;
import util.Utilities;

public class AccountSuccessPage {
	
	WebDriver driver;
	ElementUtils elementUtils;
	
	public AccountSuccessPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementUtils = new ElementUtils(driver);
	}
	
	@FindBy(xpath="//ul[@class='breadcrumb']//a[text()='Success']")
	private WebElement successBreadcrumb;
	
	@FindBy(xpath="//a[@class='btn btn-primary'][text()='Continue']")
	private WebElement continueButton;
	
	public boolean displayStatusOfSuccessBreadcrumb() {
		return elementUtils.checkWetherElementIsDisplayed(successBreadcrumb);
	}
	
	public AccountPage clickOnContinueButton() {
		elementUtils.clickOnTheElement(continueButton,Utilities.EXPLICIT_WAIT_TIME);
		return new AccountPage(driver);
	}

}
