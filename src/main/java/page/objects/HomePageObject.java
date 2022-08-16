package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class HomePageObject extends Base {
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(xpath="//span[text()='Currency']//ancestor::button")
		private WebElement currencyButton;
		
		@FindBy(xpath="//button[@name='EUR']")
		private WebElement euroButton;

		@FindBy(xpath="//strong[text()='€']")
		private WebElement euroSymbol;

		@FindBy(xpath="//div[@id='cart']//button[@data-toggle='dropdown']")
		private WebElement shoppingCartmessageDisplay;

		@FindBy(id="cart")
		private WebElement clickOnShoppingCartLocator;

		@FindBy(xpath="//ul//p[@class='text-center']")
		private WebElement messageFromUI;
		
		public void clickOnCurrencyButton() {
			currencyButton.click();
		}
		public void clickOnEuroButton() {
			euroButton.click();
		}
		public String getEuroSymbol() {
			String textFromUI = Utils.getText(euroSymbol);
			return textFromUI;
		}
		public void clickOnShoppingCart() {
			clickOnShoppingCartLocator.click();
		}
		public String getMsgFromUI(String text) {
			String msgFromUI = Utils.getText(messageFromUI);
			return msgFromUI;
		}
	}

