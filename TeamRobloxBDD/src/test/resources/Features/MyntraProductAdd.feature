Feature: Verifying add items to the Bag
This feature will verify all the steps to Add items to the bag

Background: 

Scenario: Verifying that customer able to add product to the bag successfully
Given Customer lands on Myntra homepage < https://www.myntra.com/>
When Customer mouse over the men
And Customer click on T-shirt
And Customer click on men
And customer click on Printed Round Neck T-shirt
And Customer select the M size
And customer click on add to bag
Then Customer should able to add the item to the Bag successfully
