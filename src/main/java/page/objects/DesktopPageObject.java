package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class DesktopPageObject extends Base {

	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}

	//BACKGROUND LOCATERS :
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopTabElement;

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktopElement;

	@FindBy(tagName = "img")
	private List <WebElement> allDesktopImage;

	//HP LP3065 LAPTOP LOCATERS:	
	@FindBy(xpath = "//button[contains(@onclick,\"cart.add('47', '1');\")]")
	private WebElement laptopHPAddToCartButton;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement quantityField;

	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement addToCartButton;

	@FindBy(xpath = "//div[text()='Success: You have added ']")
	private WebElement successMsgFromUI;
	
	//CANON EOS 5D LOCATERS: 
	@FindBy(xpath = "//button[contains(@onclick,\"cart.add('30', '1');\")]")
	private WebElement canonCameraAddToCartButton;

	@FindBy(xpath = "//select[@id='input-option226']")
	private WebElement colorDropDown;

	@FindBy(xpath = "//input[@name='quantity']")
	private WebElement quantityofCameraField;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartButtonCamera;

	@FindBy(xpath = "//div[text()='Success: You have added ']//ancestor::div[@class='alert alert-success alert-dismissible']")
	private WebElement successTextCamera;
	
	//CANON EOS 5D REVIEW LOCATERS:
	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement canonEOS5DLink;

	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement writeAReviewLink;

	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement nameField;

	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement reviewField;

	@FindBy(xpath = "//input[@value='4' and @type='radio']")
	private WebElement ratingRadioButton;

	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement clickOnContinueButtonReviewPage;

	@FindBy(xpath = "//div[text() =' Thank you for your review. It has been submitted to the webmaster for approval.']")
	private WebElement reviewPageSuccessMsg;

	//ACTION METHOD FOR BACKGROUNG KEYWORD:
	public void clickOnDesktopTab() {
		Utils.hoveMouseOverElement(desktopTabElement);
	}

	public void clickOnShowAllDesktopTab() {
		showAllDesktopElement.click();
	}

	public List<WebElement> desktopsItems() {
		List<WebElement> allDesktopImages = allDesktopImage;
		return allDesktopImages;
	}

	//  HP LP3065 METHODS:
	public void clickOnHPLaptopAddToCartButton() {
		laptopHPAddToCartButton.click();
	}

	public void enterQuantityOfProduct() {
		quantityField.clear();
		quantityField.sendKeys("1");
		
	}

	public void clickOnAddToCartAfterSelectingTheQuantity() {
		addToCartButton.click();
	}

	public String getSuccessMsgHPLaptop(String text) {
		String textFromUI = successMsgFromUI.getText();
		return textFromUI;
	}
	//CANON EOS 5D METHODS:
	public void clickOnCameraAddToCartButton() {
		canonCameraAddToCartButton.click();
	}

	public void selectColorDropDown() {
		Utils.selectByVisibleText(colorDropDown, "Red");
	}

	public void enterQuantityCamera() {
		quantityofCameraField.clear();
		quantityofCameraField.sendKeys("1");
	}

	public void clickOnAddToCartCamera() {
		addToCartButtonCamera.click();
	}

	public String getSucessMsgFromUICamera(String successMsg) {
		String textFromUI = successTextCamera.getText();
		return textFromUI;
	}
	
	//CANON EOS 5D REVIEW METHODS:
	public void clickOnCanonEOS5dLink() {
		canonEOS5DLink.click();
	}

	public void clickOnWriteAReviewLink() {
		writeAReviewLink.click();
	}

	public void enterYourName(String yourname) {
		nameField.sendKeys(yourname);
	}

	public void enterYourReview(String yourReview) {
		reviewField.sendKeys(yourReview);
	}

	public void ratingCameraRadioButton() {
		ratingRadioButton.click();
	}

	public void clickOnContinueButtonCameraPage() {
		clickOnContinueButtonReviewPage.click();
	}

	public String getSuccessMessageFromReviewPage(String msg) {
		String reviewTextFromUI = reviewPageSuccessMsg.getText();
		return reviewTextFromUI;
	}

}
