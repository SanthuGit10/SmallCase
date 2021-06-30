package StepDefinitions;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.FlipkartHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GetPriceFromFlipkart {

	public WebDriver driver;

	FlipkartHomePage pageObj;
	int price;
    String FinalPrice="";
	@Given("^Go to https://www.flipkart.com/$")
	public void Go_to_https_www_flipkart_com() throws Throwable {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		pageObj = new FlipkartHomePage(driver);
		pageObj.closeButtonElement.click();

	}

	@Then("^Search for mobile$")
	public void Search_for_any_item_e_g_vu_tv_() throws Throwable {
		pageObj.search();

	}

	@Then("^Click on the First Item in the list.$")
	public void Click_on_the_First_Item_in_the_list() throws Throwable {
		pageObj.selectFirstitem();

	}

	@Then("^Print Price of the Item.$")
	public void Print_Price_of_the_Item() throws Throwable {
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    price=pageObj.printPriceItem();
	    System.out.println("Price of the item : "+price);
	}

	@Then("^Add to cart in guest mode$")
	public void Add_to_cart_in_guest_mode() throws Throwable {
		pageObj.addToCart();

	}


	@When("^Increase Quantity by (\\d+)$")
	public void Increase_Quantity_by(int arg1) throws Throwable {
		pageObj.quantity();

	}

	@Then("^Print the Price after addition of Quantity.$")
	public void Print_the_Price_after_addition_of_Quantity() throws Throwable {
	FinalPrice=pageObj.FinalPrice();
     System.out.println("Final Price after increasing the Quantity : "+FinalPrice);
     driver.quit();
	}

}
