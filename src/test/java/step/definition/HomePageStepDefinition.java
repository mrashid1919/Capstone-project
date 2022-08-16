package step.definition;


import core.Base;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import page.objects.HomePageObject;

@SuppressWarnings("deprecation")
public class HomePageStepDefinition extends Base{
	
	HomePageObject homePageObj = new HomePageObject();

@When("User click on Currency")
public void user_click_on_currency() {
	homePageObj.clickOnCurrencyButton();
	logger.info("User clicked on Currency Successfully");
}

@When("User Chose Euro from dropdown")
public void user_chose_euro_from_dropdown() {
	homePageObj.clickOnEuroButton();
	logger.info("User seleced his/her desired currency(Euro) successfully");
}

@Then("currency value should change to Euro")
public void currency_value_should_change_to_euro() {
	String actualSymbol = homePageObj.getEuroSymbol();
	String expectedSymbol = "€";
	Assert.assertEquals(expectedSymbol, actualSymbol);
	logger.info("User successfully retrieved: " + actualSymbol + " From UI");
	
}

@When("User click on shopping cart")
public void user_click_on_shopping_cart() {
	homePageObj.clickOnShoppingCart();
	logger.info("Shopping Cart button was clicked by User");
}

@Then("{string} message should display")
public void message_should_display(String text) {
	String actualText = homePageObj.getMsgFromUI(text);
	String expectedText = "Your shopping cart is empty!";
	Assert.assertEquals(expectedText, actualText);
	logger.info(actualText);
}

	
}