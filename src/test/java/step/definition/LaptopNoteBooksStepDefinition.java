package step.definition;

import core.Base;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import page.objects.LaptopNoteBooksPageObject;
import utilities.Utils;

@SuppressWarnings("deprecation")
public class LaptopNoteBooksStepDefinition extends Base {

	LaptopNoteBooksPageObject lapNoteObj = new LaptopNoteBooksPageObject();

	// BACKGROUND METHOD:
	@When("User click on Laptop & NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		lapNoteObj.clickLaptopnAndNotebookTab();
		logger.info("Laptop & NoteBook tab was clicked by User");
	}

	@When("User click on Show all Laptop & NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		lapNoteObj.clickShowAllLaptopAndNotebookLink();
		logger.info("Show all Laptop & NoteBook Option was selected by User from Laptop & Notebook tab");
	}

	// MACBOOK METHODS:
	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		lapNoteObj.clickOnMacBookLink();
		Utils.hardWait(2000);
		logger.info("MacBook item was Clicked by User");
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		lapNoteObj.clickAddToCartButtonOnMacBook();
		logger.info("User Clicked on add to Cart Button");
	}

	@Then("User should see a message1 {string}")
	public void user_should_see_a_message1(String text) {
		String actualText = lapNoteObj.getSuccessMsgOnMacBookPage(text);
		String actualTextSub = actualText.substring(0, actualText.length() - 2);
		String expectedText = text;
		Assert.assertEquals(expectedText, actualTextSub);
		logger.info(actualText);
	}

	@Then("User should see one item\\(s) showed to the cart")
	public void user_should_see_one_item_s_showed_to_the_cart() {
		String actualText = lapNoteObj.getTextShowedOnCartMacBookPage();
		String actualTextSub = actualText.substring(0, 18);
		String expectedText = "1 item(s) - $602.0";
		Assert.assertEquals(expectedText, actualTextSub);
		logger.info("User was able to see: " + actualTextSub + " On UI");
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		lapNoteObj.clickCartOptionMacBookPage();
		logger.info("User Clicked on add to Cart Button");
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		lapNoteObj.clickRedXButtonMacBookPage();
		Utils.hardWait(2000);
		logger.info("Red X button was clicked, and Item from our Cart was removed");
	}

	@Then("item should be removed and cart should show zero item\\(s)")
	public void item_should_be_removed_and_cart_should_show_zero_item_s() {
		String actualText = lapNoteObj.getTextAfterRemovingItemFromMacBookPage();
		String expectedText = "0 item(s) - $0.00";
		Assert.assertEquals(expectedText, actualText);
		logger.info("User successfully removed Item from Cart, now it shows: " + actualText);
	}

	// PRODUCT COMPARISON ACTION METHODS:
	@When("User click on product comparison icon on MacBook")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		lapNoteObj.clickComparisonIconMacBook();
		logger.info("User clicked on Compare button on MacBook");
	}

	@When("User click on product comparison icon on MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		lapNoteObj.clickComparisonIconMacBookAir();
		Utils.hardWait(2000);
		logger.info("User clicked on Compare button on MacBook Air");
	}

	@Then("User should see a message2 {string}")
	public void user_should_see_a_message2(String msg) {
		String actualText = lapNoteObj.getMsgMacBookAirComparison(msg);
		String actualTextSub = actualText.substring(0, actualText.length() - 2);
		String expectedText = msg;
		Assert.assertEquals(expectedText, actualTextSub);
		logger.info(actualText);
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		lapNoteObj.clickOnProductComparisonLink();
		logger.info("Product Comparison Link was Clicked");
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		String actualText = lapNoteObj.getTextFromProductComparisonPage();
		String expectedText = "Product Comparison";
		Assert.assertEquals(expectedText, actualText);
		logger.info("We are able to see every Comparison Chart");
		Utils.takeScreenshotForStep();
	}

	// ADD AN ITEM TO WISHLIST METHODS:
	@When("User click on heart icon to add Sony VAIO laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_vaio_laptop_to_wish_list() {
		lapNoteObj.clickOnHeartIconSonyVaio();
		logger.info("Sony VAIO Laptop was added to Wish List using the Heart Icon on UI");
	}

	@Then("User should get a message3 {string}")
	public void user_should_get_a_message3(String text) {
		String actualText = lapNoteObj.getTextAfterClickHeartIcon(text);
		String actualTextSub = actualText.substring(0, actualText.length() - 2);
		String expectedText = text;
		Assert.assertEquals(expectedText, actualTextSub);
		logger.info(actualText);
		Utils.takeScreenshotForStep();
	}

	// MACBOOK PRO PRICE METHODS:
	@When("User click on MacBook Pro item")
	public void user_click_on_mac_book_pro_item() {
		lapNoteObj.clickOnMacBookProItem();
		logger.info("MacBook Pro item was Clicked By User");
	}

	@Then("User should see  {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String price) {
		String actualText = lapNoteObj.getPriceTagOfMacBookPro(price);
		String expectedText = "$2,000.00";
		Assert.assertEquals(expectedText, actualText);
		logger.info("MacBook Pro's Price: " + actualText + " Was retrieved successfully from TekSchool Retail WebSite");
	}
}