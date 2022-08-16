package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class LaptopNoteBooksPageObject extends Base {

	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}

	// Background Locators:

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopAndNotebookTab;

	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopAndNotebookLink;

	// MacBook Locator:

	@FindBy(xpath = "//h4//a[text()='MacBook']")
	private WebElement macBookItemLink;

	@FindBy(id= "button-cart")
	private WebElement clickAddToCartOnMacBook;

	@FindBy(xpath = "//div[text()='Success: You have added ']")
	private WebElement successMsgFromUIOnMacBookPage;

	@FindBy(xpath="//span[@id='cart-total']//ancestor::button")
	private WebElement getTextShowedOnCartfromMacBook;

	@FindBy(xpath = "//div[@id='cart']")
	private WebElement clickOnCartOptionsMacBookPage;

	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement clickOnRedXButtonMacBookPage;

	@FindBy(xpath ="//span[@id='cart-total']//ancestor::button")
	private WebElement getTextAfterRemovingItemMacBookPage;

	// PRODUCT COMPARISON LOCATORS:

	@FindBy(xpath = "//button[contains(@onclick, \"compare.add('43');\")]")
	private WebElement comparisonIconMacBook;

	@FindBy(xpath = "//button[contains(@onclick, \"compare.add('44');\")]")
	private WebElement comparisonIconMacBookAir;

	@FindBy(xpath = "//div[text()=' Success: You have added ']")
	private WebElement SuccessMessageClickMacBookAirComparison;

	@FindBy(xpath = "//div//a[@id='compare-total']")
	private WebElement productComparisonLink;

	@FindBy(xpath = "//div//h1[text()='Product Comparison']")
	private WebElement textFromProductComparisonPage;

	// ADD AN ITEM TO WISHLIST LOCATORS:

	@FindBy(xpath = "//button[contains(@onclick, \"wishlist.add('46');\")]")
	private WebElement heartIconSonyVaioLaptop;

	@FindBy(xpath = "//div[text()=' You must '] ")
	private WebElement textAfterClickingHeartIconSonyVaio;

	// MACBOOK PRO PRICE LOCATOR:

	@FindBy(xpath = "//a[text()='MacBook Pro'] ")
	private WebElement macBookProItem;

	@FindBy(xpath = "//ul//h2[text()='$2,000.00']")
	private WebElement priceTagOfMacBookPro;

	// Background Action Methods:

	public void clickLaptopnAndNotebookTab() {
		Utils.hoveMouseOverElement(laptopAndNotebookTab);
	}

	public void clickShowAllLaptopAndNotebookLink() {
		showAllLaptopAndNotebookLink.click();
	}

	// MacBook Action Methods:

	public void clickOnMacBookLink() {
		macBookItemLink.click();
	}

	public void clickAddToCartButtonOnMacBook() {
		clickAddToCartOnMacBook.click();
	}

	public String getSuccessMsgOnMacBookPage(String text) {
		String textFromUI = Utils.getText(successMsgFromUIOnMacBookPage);
		return textFromUI;
	}

	public String getTextShowedOnCartMacBookPage() {
		String textFromUI = Utils.getText(getTextShowedOnCartfromMacBook);
		return textFromUI;
	}

	public void clickCartOptionMacBookPage() {
		clickOnCartOptionsMacBookPage.click();
	}

	public void clickRedXButtonMacBookPage() {
		clickOnRedXButtonMacBookPage.click();
	}

	public String getTextAfterRemovingItemFromMacBookPage() {
		String textFromUI = Utils.getText(getTextAfterRemovingItemMacBookPage);
		return textFromUI;
	}

	// PRODUCT COMPARISON ACTION METHODS:

	public void clickComparisonIconMacBook() {
		comparisonIconMacBook.click();
	}

	public void clickComparisonIconMacBookAir() {
		comparisonIconMacBookAir.click();
	}

	public String getMsgMacBookAirComparison(String msg) {
		String textFromUI = Utils.getText(SuccessMessageClickMacBookAirComparison);
		return textFromUI;
	}

	public void clickOnProductComparisonLink() {
		productComparisonLink.click();
	}

	public String getTextFromProductComparisonPage() {
		String textFromUI = Utils.getText(textFromProductComparisonPage);
		return textFromUI;
	}
	// ADD AN ITEM TO WISHLIST ACTION METHODS:

	public void clickOnHeartIconSonyVaio() {
		heartIconSonyVaioLaptop.click();
	}

	public String getTextAfterClickHeartIcon(String text) {
		String textFromUI = Utils.getText(textAfterClickingHeartIconSonyVaio);
		return textFromUI;
	}

	// MACBOOK PRO PRICE ACTION METHODS:

	public void clickOnMacBookProItem() {
		macBookProItem.click();
	}

	public String getPriceTagOfMacBookPro(String price) {
		String priceTag = Utils.getText(priceTagOfMacBookPro);
		return priceTag;
	}

}