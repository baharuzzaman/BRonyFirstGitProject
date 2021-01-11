Feature: Update account information
As a user I want to Update my account information

Scenario: Verifying customer able to Update account information successfully
Given I land on Myntra homepage < https://www.myntra.com/>
When I hover over to profile
And I click on Edit profile from dropdown
And I click on Email box
And I write my Email
And I click on save details
Then my information will update successfully
