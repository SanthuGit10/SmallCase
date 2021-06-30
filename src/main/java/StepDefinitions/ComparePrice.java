package StepDefinitions;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.ComparePageOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ComparePrice {
	public WebDriver driver;
	int price;
	int FlipkartPrice;
	int Amazonprice;
	boolean flipkart = true;
	ComparePageOM compareObj;

	@Given("^Go to flipkart$")
	public void Go_to_flipkart() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		compareObj = new ComparePageOM(driver);
		compareObj.closeButtonElement.click();
	}

	@When("^Search for APPLE iPhone (\\d+) \\(Blue, (\\d+) GB\\)$")
	public void Search_for_APPLE_iPhone_Blue_GB(int arg1, int arg2) throws Throwable {
		compareObj.search();
	}

	@Then("^Click on the First Item in the list$")
	public void Click_on_the_First_Item_in_the_list() throws Throwable {
		compareObj.selectFirstitem();

	}

	@Then("^Print Price of the Item$")
	public void Print_Price_of_the_Item() throws Throwable {
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		price = compareObj.printPriceItem();
		System.out.println("Price of the item : " + price);

	}

	@When("^Add to cart in guest mode.$")
	public void Add_to_cart_in_guest_mode() throws Throwable {
		compareObj.addToCart();
	}

	@Then("^Print the Price.$")
	public void Print_the_Price() throws Throwable {
		FlipkartPrice = compareObj.FinalPrice();
		System.out.println("Price of the item in Flipkart : " + FlipkartPrice);
	}

	@Given("^Go to https://www.amazon.in/$")
	public void Go_to_https_www_amazon_in() throws Throwable {
		driver.navigate().to("https://www.amazon.in/");

	}

	@When("^Search for APPLE iPhone (\\d+) \\(Blue, (\\d+) GB\\) in amazon$")
	public void Search_for_APPLE_iPhone_Blue_GB_in_amazon(int arg1, int arg2) throws Throwable {
		compareObj.amznsearch();

	}

	@Then("^Click on the exact Item as in amazon.$")
	public void Click_on_the_exact_Item_as_in_amazon() throws Throwable {

		compareObj.amznitemSelect();

	}

	@Then("^Print the Price  in amazon.$")
	public void Print_the_Price_in_amazon() throws Throwable {
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1)).close();
		driver.switchTo().window(tabs2.get(2));

		price = compareObj.amznprintPriceItem();
		System.out.println("Price of the  amzon item : " + price);

	}

	@Then("^Add to cart\\(in guest Mode\\)  in amazon.$")
	public void Add_to_cart_in_guest_Mode_in_amazon() throws Throwable {
		compareObj.amznaddToCart();

	}

	@Then("^Go to Cart  in amazon.$")
	public void Go_to_Cart_in_amazon() throws Throwable {
		Amazonprice = compareObj.amznprintPriceItemcart();
		System.out.println("Price of the item in Amazon  : " + Amazonprice);
	}

	@Then("^Compare both the Prices.$")
	public void Compare_both_the_Prices() throws Throwable {

		if (FlipkartPrice < Amazonprice) {
			flipkart = false;
		}
	}

	@Then("^Print which site is giving Cheaper rates.$")
	public void Print_which_site_is_giving_Cheaper_rates() throws Throwable {

		if (!flipkart) {
			System.out.println("Flipkart is cheaper");

		} else {
			System.out.println("Amazon is cheaper");
		}
		driver.quit();
	}

}
