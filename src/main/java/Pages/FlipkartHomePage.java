package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinitions.GetPriceFromFlipkart;

public class FlipkartHomePage extends GetPriceFromFlipkart {

	public FlipkartHomePage(WebDriver driver) {

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

	@FindBy(xpath = "//button[text()='+']")
	private static WebElement IncreaseQunatity;

	@FindBy(xpath = "//div[@class='_1dqRvU']//span")
	private static WebElement priceAfterIncrease;

	public void search() {
		seaWebElement.sendKeys("mobiles");
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

	public void quantity() throws InterruptedException {
		Thread.sleep(3000);
		IncreaseQunatity.click();
	}

	public String FinalPrice() throws InterruptedException {
		Thread.sleep(3000);
		String Finalprice = priceAfterIncrease.getText();

		return Finalprice;
	}
}
