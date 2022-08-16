package step.definition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import page.objects.DesktopPageObject;
import utilities.Utils;

@SuppressWarnings("deprecation")
public class DesktopPageStepDefinition extends Base {

	DesktopPageObject desktopPageObj = new DesktopPageObject();

	//BACKGROUNG METHODS:
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktopPageObj.clickOnDesktopTab();
		logger.info("Desktop Button was click successfully");
		
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktopPageObj.clickOnShowAllDesktopTab();
		Utils.hardWait(1000);
		logger.info("We have successfully clicked the: Show All Desktop Tab" );
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		List<WebElement> desktopImages = desktopPageObj.desktopsItems();
		for (WebElement image:desktopImages) {
			Assert.assertTrue(image.isDisplayed());
			logger.info(image.getAttribute("title") + " Is present");
		}
		Utils.takeScreenshotForStep();
	}

	//HP LP3065 LAPTOP METHODS:
	@When("User click  ADD TO CART option on HP LP3065item")
	public void user_click_add_to_cart_option_on_hp_lp3065item() {
		desktopPageObj.clickOnHPLaptopAddToCartButton();
		logger.info("Add to Cart Button on HP laptop was clicked Successfully");
	}

	@When("User select quantity1")
	public void user_select_quantity1() {
		desktopPageObj.enterQuantityOfProduct();
		Utils.hardWait(1000);
		logger.info("We have entered our desired Quantity successfully");
	}

	@And("User click add to Cart button On HP")
	public void user_click_add_to_cart_button_On_HP() {
		desktopPageObj.clickOnAddToCartAfterSelectingTheQuantity();
		Utils.hardWait(3000);
		logger.info("We have successfully clicked on Add to Cart Button");
	}

	@Then("User should see a message: {string}")
	public void user_should_see_a_message(String text) {
		String Actualtext = desktopPageObj.getSuccessMsgHPLaptop(text);
		String actualtextSub = Actualtext.substring(0, Actualtext.length()-2);
		String ExpectedMsg = text;
		Assert.assertEquals(ExpectedMsg , actualtextSub);
		logger.info(Actualtext);
		Utils.takeScreenshotForStep();
	}
	
	
	//CANON EOS 5D METHODS:
	@When("User click  ADD TO CART option on Canon EOS5D item")
	public void user_click_add_to_cart_option_on_canon_eos5d_item() {
		desktopPageObj.clickOnCameraAddToCartButton();
		logger.info("User clicked on ADD TO CART option on Canon EOS5D item successfully");
	}

	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktopPageObj.selectColorDropDown();
		logger.info("Color red was selected from dropdown list successfully");
	}

	@And("User select quantity 1")
	public void user_Select_Quantity_1() {
		desktopPageObj.enterQuantityCamera();
		Utils.hardWait(1000);
		logger.info("We have entered our desired Quantity successfully");
	}

	@And("User click add to Cart button On EOS")
	public void user_Click_Add_To_Cart_Button_On_EOS() {
		desktopPageObj.clickOnAddToCartCamera();
		Utils.scrolldownPage();
		Utils.hardWait(1000);
		logger.info("We have successfully clicked on Add to Cart Button");
	}

	@Then("User should see a Success message {string}")
	public void user_should_see_a_success_message(String successMsg) {
		String ActualText = desktopPageObj.getSucessMsgFromUICamera(successMsg);
		String actualTextSub = ActualText.substring(0, ActualText.length()-2);
		String ExpectedText = successMsg;
		Assert.assertEquals(ExpectedText, actualTextSub);
		logger.info(ActualText);
		Utils.takeScreenshotForStep();
	}

	//CANON EOS 5D REVIEW METHODS:
	@When("User click on Canon EOS5D item")
	public void user_click_on_canon_eos5d_item() {
		desktopPageObj.clickOnCanonEOS5dLink();
		logger.info("User clicked on Canon EOS5D item successfully");
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopPageObj.clickOnWriteAReviewLink();
		logger.info("User clicked on write a review link successfully");
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		desktopPageObj.enterYourName(data.get(0).get("yourname"));
		desktopPageObj.enterYourReview(data.get(0).get("yourReview"));
		logger.info("the Review form was filled successfully");
	}

	@When("User click on desired rating")
	public void user_click_on_desired_rating() {
		desktopPageObj.ratingCameraRadioButton();
		Utils.hardWait(2000);
		logger.info("Desired Rating was clicked successfully");
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		desktopPageObj.clickOnContinueButtonCameraPage();
		Utils.hardWait(2000);
		logger.info("Continue button was clicked");
	}

	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String msg) {
		String ExpectedText = msg;
		String ActualText = desktopPageObj.getSuccessMessageFromReviewPage(msg);
		String actualTextSub = ActualText.substring(0, ActualText.length());
		Assert.assertEquals(ExpectedText, actualTextSub);
		logger.info(ActualText);
		Utils.takeScreenshotForStep();
	}

}