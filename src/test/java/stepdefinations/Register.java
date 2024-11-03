package stepdefinations;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.AccountPage;
import pages.AccountSuccessPage;
import pages.LandingPage;
import pages.NewsletterPage;
import pages.RegisterPage;
import util.Utilities;

public class Register {
	
	WebDriver driver;
	LandingPage landingPage;
	RegisterPage registerPage;
	AccountSuccessPage accountSuccessPage;
	AccountPage accountPage;
	NewsletterPage newsletterPage;
	
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Given("User navigates to Register Account page")
	public void User_navigates_to_Register_Account_page() {
		landingPage = new LandingPage(driver);
		landingPage.clickOnMyAccountDropMenu();
		registerPage = landingPage.selectRegisterOption();
	}
	
	@When("User enters the below fields")
	public void user_enters_the_below_fields(DataTable dataTable) {
		Map<String, String> map = dataTable.asMap(String.class,String.class);
		registerPage.enterFirstName(map.get("firstName"));
		registerPage.enterLastName(map.get("lastName"));
		registerPage.enterEmail(Utilities.getNewEmailWithTimeStamp());
		registerPage.enterTelephoneNumber(map.get("telephone"));
		registerPage.enterPassword(map.get("password"));
		registerPage.enterConfirmPassword(map.get("password"));
	}

	@When("User selects Privacy Policy field")
	public void user_selects_privacy_policy_field() {
		registerPage.selectPrivacyPolicyField();
	}

	@When("User clicks on Continue button")
	public void user_clicks_on_continue_button() {
	   accountSuccessPage = registerPage.clickOnContinueButton();
	}

	@Then("User Account should get created successfully")
	public void user_account_should_get_created_successfully() {
	    Assert.assertTrue(accountSuccessPage.displayStatusOfSuccessBreadcrumb());
	}

	
	@When("User selects Yes Newsletter option")
	public void user_selects_yes_newsletter_option() {
		registerPage.selectYesNewsletterOption();
	}

	@When("User clicks on Continue button on Account Success page")
	public void user_clicks_on_continue_button_on_account_success_page() {
		accountPage = accountSuccessPage.clickOnContinueButton();
	}

	@When("User selects Subscribe Unsubscribe Newsletter option")
	public void user_selects_subscribe_unsubscribe_newsletter_option() {
		newsletterPage = accountPage.clickOnSubscribeUnsubscribeOption();
	}

	@Then("User should be taken to Nesletter page")
	public void user_should_be_taken_to_nesletter_page() {
	    Assert.assertTrue(newsletterPage.displayStatusOfNewsletterBreadcrumb());
	}

	@And("Yes radio button should be in selected state")
	public void yes_radio_button_should_be_in_selected_state() {
	    Assert.assertTrue(newsletterPage.selectedStateOfYesRadioOption());
	}

	@When("User selects No Newsletter option")
	public void user_selects_no_newsletter_option() {
		registerPage.selectNoNewsletterOption();
	}

	@Then("No radio button should be in selected state")
	public void no_radio_button_should_be_selected_state() {
	    Assert.assertTrue(newsletterPage.selectStateOfNoRadioOption());
	}

}
