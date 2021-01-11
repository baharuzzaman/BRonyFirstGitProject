Feature: Myntra Homepage
As a user I want to land on Myntra homepage

@Sprint2
Scenario: Verifying customer able to launch Myntra homepage successfully
Given I have a web browser open
When I enter <  https://www.myntra.com/ > URL in the web address bar
And I press enter key on the keyboard
Then I land on Myntra homepage
