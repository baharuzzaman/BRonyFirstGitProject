
@Regression3
Feature: Myntra Home & Living Feature
This feature will verify all the steps to lands on Home & Living page


Scenario: Verify that Bedsheet page launched successfully
Given Customer lands on Myntra homepage < "https://www.myntra.com/">
When Customer mouse over the Home&Living
And Customer click on Bedsheet
And Customer click on women
Then Customer should able to land on women bedsheet page successfully