Feature: Myntra Login Feature
  This feature is for Myntra login functionality

    @Sprint2
  Scenario: Verify customer login using correct Phonenumber and correct password successfully
    Given Customer launch in Myntra home page < https://www.myntra.com/>
    When Customer mousehover to profile
    And Customer clicks on loginorSignup
    And Customer put correct phonenumber '8076159467'
    And Customer clicks on continue Btn
    And Customer clicks on password Btn
    And Customer put correct password "Meeta@1010"
  	And Customer clicks on LogIn button
  	Then Customer should be able to land on login page
 
  @Sprint3
  Scenario Outline: Verify customer login using correct Phonenumber and wrong password
    Given Customer launch in Myntra home page < https://www.myntra.com/>
    When Customer mousehover to profile
    And Customer clicks on loginorSignup
  	When Customer put correct Phonenumber "<phonenumber>"
  	And Customer clicks on continue Btn
    And Customer clicks on password Btn
    And Customer put wrong password "<password>"
  	Then Customer clicks on LogIn button
  	

    Examples: 
      |Phone number|password  |
      |8076159467  |Masud@123 |
      |8076159467  |Shahi@123 |
      |8076159467  |Dikesh@123| 
    
 

