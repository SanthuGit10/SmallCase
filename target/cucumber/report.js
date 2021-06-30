$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Flipkartgetprice.feature");
formatter.feature({
  "line": 1,
  "name": "Getting the Price details from the Flipkart page",
  "description": "",
  "id": "getting-the-price-details-from-the-flipkart-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Get Price from Flipkart",
  "description": "",
  "id": "getting-the-price-details-from-the-flipkart-page;get-price-from-flipkart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@FirstScenario"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Go to https://www.flipkart.com/",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Search for mobile",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click on the First Item in the list.",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Print Price of the Item.",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Add to cart in guest mode",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Increase Quantity by 1",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Print the Price after addition of Quantity.",
  "keyword": "Then "
});
formatter.match({
  "location": "GetPriceFromFlipkart.Go_to_https_www_flipkart_com()"
});
formatter.result({
  "duration": 9015254267,
  "status": "passed"
});
formatter.match({
  "location": "GetPriceFromFlipkart.Search_for_any_item_e_g_vu_tv_()"
});
formatter.result({
  "duration": 771707843,
  "status": "passed"
});
formatter.match({
  "location": "GetPriceFromFlipkart.Click_on_the_First_Item_in_the_list()"
});
formatter.result({
  "duration": 3136264449,
  "status": "passed"
});
formatter.match({
  "location": "GetPriceFromFlipkart.Print_Price_of_the_Item()"
});
formatter.result({
  "duration": 3174998145,
  "status": "passed"
});
formatter.match({
  "location": "GetPriceFromFlipkart.Add_to_cart_in_guest_mode()"
});
formatter.result({
  "duration": 101367610,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 21
    }
  ],
  "location": "GetPriceFromFlipkart.Increase_Quantity_by(int)"
});
formatter.result({
  "duration": 3129415740,
  "status": "passed"
});
formatter.match({
  "location": "GetPriceFromFlipkart.Print_the_Price_after_addition_of_Quantity()"
});
formatter.result({
  "duration": 3877053626,
  "status": "passed"
});
formatter.uri("Features/PriceCompare.feature");
formatter.feature({
  "line": 2,
  "name": "Getting the Price details from the Flipkart page",
  "description": "",
  "id": "getting-the-price-details-from-the-flipkart-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Price Comparision",
  "description": "",
  "id": "getting-the-price-details-from-the-flipkart-page;price-comparision",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@SecondScenario"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Go to flipkart",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Search for APPLE iPhone 12 (Blue, 64 GB)",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Click on the First Item in the list",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Print Price of the Item",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Add to cart in guest mode.",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Print the Price.",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Go to https://www.amazon.in/",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Search for APPLE iPhone 12 (Blue, 64 GB) in amazon",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Click on the exact Item as in amazon.",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Print the Price  in amazon.",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Add to cart(in guest Mode)  in amazon.",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Go to Cart  in amazon.",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Compare both the Prices.",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Print which site is giving Cheaper rates.",
  "keyword": "Then "
});
formatter.match({
  "location": "ComparePrice.Go_to_flipkart()"
});
formatter.result({
  "duration": 7589657304,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 24
    },
    {
      "val": "64",
      "offset": 34
    }
  ],
  "location": "ComparePrice.Search_for_APPLE_iPhone_Blue_GB(int,int)"
});
formatter.result({
  "duration": 629246397,
  "status": "passed"
});
formatter.match({
  "location": "ComparePrice.Click_on_the_First_Item_in_the_list()"
});
formatter.result({
  "duration": 3133733783,
  "status": "passed"
});
formatter.match({
  "location": "ComparePrice.Print_Price_of_the_Item()"
});
formatter.result({
  "duration": 3057774687,
  "status": "passed"
});
formatter.match({
  "location": "ComparePrice.Add_to_cart_in_guest_mode()"
});
formatter.result({
  "duration": 139916963,
  "status": "passed"
});
formatter.match({
  "location": "ComparePrice.Print_the_Price()"
});
formatter.result({
  "duration": 3076788440,
  "status": "passed"
});
formatter.match({
  "location": "ComparePrice.Go_to_https_www_amazon_in()"
});
formatter.result({
  "duration": 3276107596,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 24
    },
    {
      "val": "64",
      "offset": 34
    }
  ],
  "location": "ComparePrice.Search_for_APPLE_iPhone_Blue_GB_in_amazon(int,int)"
});
formatter.result({
  "duration": 2635866948,
  "status": "passed"
});
formatter.match({
  "location": "ComparePrice.Click_on_the_exact_Item_as_in_amazon()"
});
formatter.result({
  "duration": 2275621673,
  "status": "passed"
});
formatter.match({
  "location": "ComparePrice.Print_the_Price_in_amazon()"
});
formatter.result({
  "duration": 4127698234,
  "status": "passed"
});
formatter.match({
  "location": "ComparePrice.Add_to_cart_in_guest_Mode_in_amazon()"
});
formatter.result({
  "duration": 564520764,
  "status": "passed"
});
formatter.match({
  "location": "ComparePrice.Go_to_Cart_in_amazon()"
});
formatter.result({
  "duration": 3053070985,
  "status": "passed"
});
formatter.match({
  "location": "ComparePrice.Compare_both_the_Prices()"
});
formatter.result({
  "duration": 58027,
  "status": "passed"
});
formatter.match({
  "location": "ComparePrice.Print_which_site_is_giving_Cheaper_rates()"
});
formatter.result({
  "duration": 1038121061,
  "status": "passed"
});
});