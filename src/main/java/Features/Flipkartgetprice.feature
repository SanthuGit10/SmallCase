Feature: Getting the Price details from the Flipkart page

@FirstScenario
Scenario: Get Price from Flipkart
	Given Go to https://www.flipkart.com/
	Then Search for mobile
	And Click on the First Item in the list.
	Then Print Price of the Item.
	Then Add to cart in guest mode
	When Increase Quantity by 1
	Then Print the Price after addition of Quantity.
	
	
	

	