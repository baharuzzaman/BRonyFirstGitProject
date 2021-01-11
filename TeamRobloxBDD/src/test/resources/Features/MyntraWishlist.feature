Feature: Add product on Wishlist
As a user I want to add my preferable product on Wishlist


Scenario: Verifying customer able to add product on Wishlist successfully
Given I land on Myntra homepage < https://www.myntra.com/>
When I hover over to men
And I click on T-shirt
And I click on my preferable product
And I click on my desirable size
And I click on Wishlist
Then my product appears on Wishlist successfully
