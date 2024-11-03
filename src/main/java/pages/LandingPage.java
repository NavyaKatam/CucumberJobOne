package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.ElementUtils;
import util.Utilities;

public class LandingPage {
	
	WebDriver driver;
	ElementUtils elementUtils;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementUtils = new ElementUtils(driver);
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myAccountDropMenu;
	
	@FindBy(linkText="Register")
	private WebElement registerOption;
	
	public void clickOnMyAccountDropMenu() {
		elementUtils.clickOnTheElement(myAccountDropMenu,Utilities.EXPLICIT_WAIT_TIME);
	}
	
	public RegisterPage selectRegisterOption() {
		elementUtils.clickOnTheElement(registerOption,Utilities.EXPLICIT_WAIT_TIME);
		return new RegisterPage(driver);
	}

}
