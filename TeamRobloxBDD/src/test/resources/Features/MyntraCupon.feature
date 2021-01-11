Feature: Applying coupon
As a user I want to apply coupon that available for me

Scenario: Verifying customer able to apply cupon successfully
Given I land on Myntra homepage < https://www.myntra.com/>
When I hover over to Bag
And I click on Apply
And Another window popup
And I click on apply
Then my coupon discount added successfully
