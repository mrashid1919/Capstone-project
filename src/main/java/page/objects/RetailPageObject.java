package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class RetailPageObject extends Base {

	// Constructor

	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	} 

	//locator

	// Background Locators:
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement retailWebsite;

	@FindBy(xpath = "//a[@title='My Account']")
	private WebElement MyAccountButton;

	@FindBy(xpath = "//ul//a[text()='Login']")
	private WebElement LoginLink;

	@FindBy(id = "input-email")
	private WebElement emailAddressField;

	@FindBy(id = "input-password")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;

	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountPage;

	// Registering to "Affiliate Account" Locators:
	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerForAffiliateLink;

	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement companyTextField;

	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement websiteTextField;

	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement taxIDTextField;

	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement chequeRadioButton;

	@FindBy(xpath = "//input[@name='cheque']")
	private WebElement chequePayeeField;

	@FindBy(xpath = "//input[@name='agree']")
	private WebElement checkBoxClick;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continueButton;

	@FindBy(xpath = "//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement affiliateSuccessMessageFromUI;

	// Editing "Affiliate Account" Locators:
	@FindBy(xpath = "//li//a[text()='Edit your affiliate information']")
	private WebElement editAffiliateInfoLink;

	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankTransferRadioButton;

	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement bankNameField;

	@FindBy(xpath = "//input[@id='input-bank-branch-number']")
	private WebElement branchNumber;

	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement swiftCodeField;

	@FindBy(xpath = "//input[@name='bank_account_name']")
	private WebElement accountNameField;

	@FindBy(xpath = "//input[@name='bank_account_number']")
	private WebElement accountNumberField;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continueButtonOnEditAffiliate;

	@FindBy(xpath = "//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement successMsgFromUI;

	// EDIT YOUR ACCOUNT INFORMATION:
	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editYourAccountInfoLink;

	@FindBy(id = "input-firstname")
	private WebElement firstNameField;

	@FindBy(id = "input-lastname")
	private WebElement lastNameField;

	@FindBy(id = "input-email")
	private WebElement emailEditYourAccField;

	@FindBy(id = "input-telephone")
	private WebElement telephoneField;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continueButtonAccEdit;

	@FindBy(xpath = "//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement successMessageAfterEdit;

	

	// Background Action Methods:
	public String getTestEnvironmentText() {
		String textFromUI = retailWebsite.getText();
		return textFromUI;
	}

	public void clickOnMyAccountButton() {
		MyAccountButton.click();
	}

	public void clickOnLoginLink() {
		LoginLink.click();
	}

	public void enterEmail(String email) {
		emailAddressField.sendKeys(email);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	public String getTextAfterLogin() {
		String myAccountText = Utils.getText(myAccountPage);
		return myAccountText;
	}

	// Registering to "Affiliate Account" Action Methods:
	public void registerAnAffiliateAccountLink() {
		registerForAffiliateLink.click(); 
	}

	public void enterCompanyName(String company) {
		companyTextField.sendKeys(company);
	}

	public void enterCompanyWebsite(String website) {
		websiteTextField.sendKeys(website);
	}

	public void enterCompanyTaxID(String taxID) {
		taxIDTextField.sendKeys(taxID);
	}

	public void clickChequeRadioButton() {
		chequeRadioButton.click();
	}

	public void enterchequePayeeName() {
		chequePayeeField.sendKeys("Tyron");
	}

	public void clickOnCheckBox() {
		checkBoxClick.click();
	}

	public void clickOnContinueButton() {
		continueButton.click();
	}

	public String getTextAfterCreatingAffiliateAcc() {
		String ActualText = Utils.getText(affiliateSuccessMessageFromUI);
		return ActualText;
	}

	// Editing the "Affiliate Account" Action Methods:
	public void clickEditAffiliateAcc() {
		editAffiliateInfoLink.click();
	}

	public void clickOnBankTransferRadio() {
		bankTransferRadioButton.click();
	}

	public void enterBankName(String bankName) {
		bankNameField.sendKeys(bankName);
	}

	public void enterAbaNumber(String abaNumber) {
		branchNumber.sendKeys(abaNumber);
	}

	public void enterSwiftCode(String swiftCode) {
		swiftCodeField.sendKeys(swiftCode);
	}

	public void enterAccountName(String accountName) {
		accountNameField.sendKeys(accountName);
	}

	public void enterAccountNumber(String accountNumber) {
		accountNumberField.sendKeys(accountNumber);
	}

	public void clickContinueButtonEditAffiliate() {
		continueButtonOnEditAffiliate.click();
	}

	public String getMsgAfterEditAffiliate() {
		String msgFromUI = Utils.getText(successMsgFromUI);
		return msgFromUI;
	}

	// EDIT YOUR ACCOUNT INFORMATION ACTION METHODS:
	public void clickOnEditAccInfo() {
		editYourAccountInfoLink.click();
	}

	public void enterFirstName(String firstname) {
		firstNameField.sendKeys(firstname);
	}

	public void enterLastName(String lastName) {
		lastNameField.sendKeys(lastName);
	}

	public void enterEmailAddress(String email) {
		emailEditYourAccField.clear();
		emailEditYourAccField.sendKeys(email);
	}

	public void enterTelephoneNum(String telephone) {
		telephoneField.sendKeys(telephone);
	}

	public void clickOnContinueButtonAccEdit() {
		continueButtonAccEdit.click();
	}

	public String getSuccessMessageAfterEdit(String UItext) {
		String msgFromUI = Utils.getText(successMessageAfterEdit);
		return msgFromUI;
	}

}
