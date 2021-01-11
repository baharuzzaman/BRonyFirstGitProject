Feature: Myntra Homepage Search box Verification
This Feature will verify Myntra Homepage Search box

@Sprint1
Scenario: Verifying customer able to search product on search box successfully
Given Customer lands on Myntra homepage < https://www.myntra.com/>
When Customer search "T-Shirt" items in the search box
And Customer press enter or click search icon
Then Customer should able to see searched items successfully


