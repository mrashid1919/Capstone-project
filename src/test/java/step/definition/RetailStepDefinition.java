package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import page.objects.RetailPageObject;
import utilities.Utils;

public class RetailStepDefinition extends Base {

	// Initiating
	RetailPageObject retailPageObj = new RetailPageObject();

	// BACKGROUND METHODS:


	



	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		String expectedText = "TEST ENVIRONMENT";
		String actualText = retailPageObj.getTestEnvironmentText();
		Assert.assertEquals(expectedText, actualText);
		logger.info("Since we can see this Text: " + actualText
				+ " It Confirms that indeed We are in TekSchool Retail Website");
	}

	@Given("User click on MyAccount")
	public void user_click_on_my_account() {
		retailPageObj.clickOnMyAccountButton();
		logger.info("MyAccount button was clicked sucessfully");
	}

	@When("User click on Login")
	public void user_click_on_login() {
		retailPageObj.clickOnLoginLink();
		logger.info("Login link was clicked sucessfully");
	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String email, String password) {
		retailPageObj.enterEmail(email);
		retailPageObj.enterPassword(password);
		logger.info("Email and password were entered successfully");
		Utils.hardWait(2000);
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		retailPageObj.clickOnLoginButton();
		logger.info("Login Button was clicked sucessfully");
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		String expectedText = "My Account";
		String actualText = retailPageObj.getTextAfterLogin();
		Assert.assertEquals(expectedText, actualText);
		logger.info(actualText);
		Utils.hardWait(2000);
		Utils.takeScreenshotForStep();
	}
	// REGISTERING TO AFFILIATE ACCOUNT:

	

	
		@When("User click on Register for an Affiliate Account link")
		public void user_click_on_register_for_an_affiliate_account_link() {
		
		retailPageObj.registerAnAffiliateAccountLink();
		logger.info("The Affiliate Account link was clicked successfully");
	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailPageObj.enterCompanyName(data.get(0).get("company"));
		retailPageObj.enterCompanyWebsite(data.get(0).get("website"));
		retailPageObj.enterCompanyTaxID(data.get(0).get("taxID"));
		logger.info("The Affiliate form was filled Successfully");
		Utils.hardWait(2000);
	}

	@When("User fill the Cheque Payee name")
	public void user_fill_the_cheque_payee_name() {
		retailPageObj.enterchequePayeeName();
		logger.info("The Cheque Payee Field was filled successfully");
	}

	@When("User click on About us check box")
	public void user_click_on_about_us_check_box() {
		retailPageObj.clickOnCheckBox();
		logger.info("We have Successfully clicked on the Checkbox");
		Utils.hardWait(2000);
	}

	@When("User click on Continue button1")
	public void user_click_on_continue_button1() {
		retailPageObj.clickOnContinueButton();
		logger.info("Continue Button was Clicked successfully");
	}

	@Then("User should see a success message1")
	public void user_should_see_a_success_message1() {
		String ExpectedText = "Success: Your account has been successfully updated.";
		String ActualText = retailPageObj.getTextAfterCreatingAffiliateAcc().toUpperCase();
		String actualTextSub = ActualText.substring(0, ActualText.length());
		Assert.assertEquals(ExpectedText.toUpperCase(), actualTextSub);
		logger.info(actualTextSub);
		Utils.hardWait(3000);
	}
	// EDITING OUR AFFILIATE ACCOUNT:
	@When("User click on Edit your affiliate information link")
	public void user_click_on_edit_your_affiliate_information_link() {
		retailPageObj.clickEditAffiliateAcc();
		logger.info("Edit your affiliate information link was clicked successfully");

	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retailPageObj.clickOnBankTransferRadio();
		logger.info("The Bank Transfer Radio Button was clicked Successfully");
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailPageObj.enterBankName(data.get(0).get("bankName"));
		retailPageObj.enterAbaNumber(data.get(0).get("abaNumber"));
		retailPageObj.enterSwiftCode(data.get(0).get("swiftCode"));
		retailPageObj.enterAccountName(data.get(0).get("accountName"));
		retailPageObj.enterAccountNumber(data.get(0).get("accountNumber"));
		logger.info("User filled the Bank information form successfully");
		Utils.hardWait(2000);
	}

	@When("User click on Continue button2")
	public void user_click_on_continue_button2() {
		retailPageObj.clickContinueButtonEditAffiliate();
		logger.info("Continue Button on Edit Affiliate was clicked Successfully");
	}

	@Then("User should see a success message2")
	public void user_should_see_a_message() {
		String ActualText = retailPageObj.getMsgAfterEditAffiliate();
		String ExpectedText = "Success: Your account has been successfully updated.";
		Assert.assertEquals(ExpectedText, ActualText);
		logger.info("Our Affiliate Account has been edited Successfully");
	}

	// EDIT YOUR ACCOUNT INFORMATION:
	@When("User click on Edit your account information link")
	public void user_click_on_edit_your_account_information_link() {
		retailPageObj.clickOnEditAccInfo();
		logger.info("Edit your Account Information link was clicked successfully");
	}

	@Then("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

		retailPageObj.enterFirstName(data.get(0).get("firstname"));
		retailPageObj.enterLastName(data.get(0).get("lastName"));
		retailPageObj.enterEmailAddress(data.get(0).get("email"));
		retailPageObj.enterTelephoneNum(data.get(0).get("telephone"));
		logger.info("We have Successfully edited our Acount's information");
	}

	@Then("User click on continue button3")
	public void user_click_on_continue_button3() {
		retailPageObj.clickOnContinueButtonAccEdit();
		logger.info("The Continue Button on Edit your Account page was clicked successfully");
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String UItext) {
		String ActualText = retailPageObj.getSuccessMessageAfterEdit(UItext);
		String ExpectedText = UItext;
		Assert.assertEquals(ActualText, ExpectedText);
		logger.info(ActualText);

	}
}