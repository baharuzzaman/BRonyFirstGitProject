Feature: verify Update account information
This feature is for updating customer information


Scenario: Verifying customer able to Update account information successfully
Given Customer land on Myntra homepage < https://www.myntra.com/>
When Customer mousehover to profile
And customer click on Edit profile from dropdown
And customer click on Email box
And customer write Email
And Customer click on save details
Then Customer information should be updated successfully