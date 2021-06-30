
Feature: Getting the Price details from the Flipkart page

@SecondScenario
Scenario: Price Comparision
	Given Go to flipkart
	When Search for APPLE iPhone 12 (Blue, 64 GB)
	Then Click on the First Item in the list
   	Then Print Price of the Item
    When Add to cart in guest mode.
	Then Print the Price.
	Given Go to https://www.amazon.in/
	When Search for APPLE iPhone 12 (Blue, 64 GB) in amazon
	Then Click on the exact Item as in amazon.
	Then Print the Price  in amazon.
	And Add to cart(in guest Mode)  in amazon.
	Then Go to Cart  in amazon.
	And Compare both the Prices.
    Then Print which site is giving Cheaper rates.
