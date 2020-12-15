Feature:Front site - Login function
 Background:lauching page
  Given User navigates to Login page of front site
 
   Scenario: Login successfully with valid front account
     When User enters valid  account at front site
     And User enters valid password at front site
     And User clicks on Login button at front site
     Then User login successfully into front site
  
  Scenario Outline: Login fail - possible combinations
     When User enters <username> at front site
     And User enters <password> at front site
     And User clicks Login button
     Then Show err messenger
     
  Examples:
     | username |password|
     | admin1   |123     |
     | admin12    |123456  |