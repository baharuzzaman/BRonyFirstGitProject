Feature: Verify add product on Wishlist
customer wants to add preferable product on Wishlist

Scenario: Verifying customer able to add product on Wishlist successfully
Given Customer land on Myntra homepage < https://www.myntra.com/>
When Customer mousehover to men
And Customer click on T-shirt
And Customer click on my preferable product
And Customer click on my desirable size
And Customer click on Wishlist
Then Product appears on Wishlist successfully
