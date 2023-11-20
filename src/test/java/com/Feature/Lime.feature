@smoketest
Feature: Limeroad order

Scenario: to click shop men
When user launch the url "https://www.limeroad.com"
And user click on shop men 

Scenario: add to cart
When user clicks kids
Given user select the brands giny & jony
And user click product
And user clicks select colour
And user clicks add to cart