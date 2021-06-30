package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinitions.ComparePrice;

public class ComparePageOM  extends ComparePrice {
	
	public ComparePageOM(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[text()='✕']")
	public WebElement closeButtonElement;

	@FindBy(xpath = "//input[@title=\"Search for products, brands and more\"]")
	private static WebElement seaWebElement;
	
	@FindBy(xpath = "//button[@type='submit']//*[name()='svg']")
	private static WebElement submtsearch;
	
	@FindBy(xpath = "//div[@class='_1YokD2 _2GoDe3']//div[@class='_1AtVbE col-12-12'][1]//div[@class='_4rR01T']")
	private static WebElement selectFirstitem;

	@FindBy(xpath = ".//div[@class='_30jeq3 _16Jk6d']")
	private static WebElement priceItem;

	@FindBy(xpath = "//li[@class='col col-6-12'][1]")
	private static WebElement addTOCart;
	
	
	@FindBy(xpath = "//div[@class='_1dqRvU']//span")
	private static WebElement priceAfterIncrease;

	@FindBy(xpath = "//div[@class='nav-search-field '] //input")
	private static WebElement amznSearch;
	
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	private static WebElement amznSearchsubmit;
	
	
	@FindBy(xpath = "//table[@class='a-lineitem']//span[@id='priceblock_dealprice']")
	private static WebElement amznitemPrice;
	

	
	@FindBy(xpath = "//div[@class='s-main-slot s-result-list s-search-results sg-row']//div[@data-cel-widget='search_result_0']//h2//span")
	private static WebElement amznitemSelect;

	
	@FindBy(xpath = "//input[@title='Add to Shopping Cart']")
	private static WebElement amznaddTOCart;
	
	
	
	@FindBy(xpath = "//div[@id='attach-accessory-pane']//span[@id='attach-accessory-cart-subtotal']")
	private static WebElement amzncartPrice;
	
	public void search() {
		seaWebElement.sendKeys(" APPLE iPhone 12 (Black, 64 GB)");
		submtsearch.click();
	}
	public void selectFirstitem() throws InterruptedException {
		Thread.sleep(3000);
		selectFirstitem.click();
	}

	public int printPriceItem() throws InterruptedException {
		Thread.sleep(3000);
		String price = priceItem.getAttribute("innerHTML").split("₹")[1].replace(",", "");

		return Integer.parseInt(price);
	}
	public void addToCart() {
		addTOCart.click();

	}


	public int FinalPrice() throws InterruptedException {
		Thread.sleep(3000);
		int Finalprice =Integer.parseInt(priceAfterIncrease.getText().split("₹")[1].replace(",", ""));

		return Finalprice;
	}
	
	public void amznsearch() {
		amznSearch.sendKeys(" APPLE iPhone 12 (Black, 64 GB)");
		amznSearchsubmit.click();
	}
	
	public void amznitemSelect() throws InterruptedException {
		Thread.sleep(2000);
		amznitemSelect.click();
		
	}
	public int amznprintPriceItem() throws InterruptedException {
		Thread.sleep(3000);
		String price = amznitemPrice.getAttribute("innerHTML").split("₹")[1].replace(",", "").replace(".00", "").replace("&nbsp;", "");

		return Integer.parseInt(price);
	}
	public void amznaddToCart() {
		amznaddTOCart.click();

	}
	public int amznprintPriceItemcart() throws InterruptedException {
		Thread.sleep(3000);
		String price = amzncartPrice.getAttribute("innerHTML").split("₹")[1].replace(",", "").replace(".00", "").replace("&nbsp;", "");;

		return Integer.parseInt(price);
	}
}
