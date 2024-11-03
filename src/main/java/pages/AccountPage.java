package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.ElementUtils;
import util.Utilities;

public class AccountPage {
	
	WebDriver driver;
	ElementUtils elementUtils;
	
	public AccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementUtils = new ElementUtils(driver);
	}
	
	@FindBy(linkText="Subscribe / unsubscribe to newsletter")
	private WebElement subscribeUnsubscribeOption;
	
	public NewsletterPage clickOnSubscribeUnsubscribeOption() {
		elementUtils.clickOnTheElement(subscribeUnsubscribeOption,Utilities.EXPLICIT_WAIT_TIME);
		return new NewsletterPage(driver);
	}

}
