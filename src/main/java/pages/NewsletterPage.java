package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.ElementUtils;
import util.Utilities;

public class NewsletterPage {
	
	WebDriver driver;
	ElementUtils elementUtils;
	
	public NewsletterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementUtils = new ElementUtils(driver);
	}
	
	@FindBy(xpath="//ul[@class='breadcrumb']//a[text()='Newsletter']")
	private WebElement newsletterBreadcrumb;
	
	@FindBy(xpath="//input[@name='newsletter'][@value='1']")
	private WebElement yesNewsletterOption;
	
	@FindBy(xpath="//input[@name='newsletter'][@value='0']")
	private WebElement noNewsletterOption;
	
	public boolean displayStatusOfNewsletterBreadcrumb() {
		return elementUtils.checkWetherElementIsDisplayed(newsletterBreadcrumb);
	}
	
	public boolean selectedStateOfYesRadioOption() {
		return elementUtils.checkWhetherElementIsSelected(yesNewsletterOption,Utilities.EXPLICIT_WAIT_TIME);
	}
	
	public boolean selectStateOfNoRadioOption() {
		return elementUtils.checkWhetherElementIsSelected(noNewsletterOption,Utilities.EXPLICIT_WAIT_TIME);
	}
}
