Feature:Front site - Create a order function
 Background: User is Logged In
	 Given User is loged in
   Scenario: Create a order successfully 
     Given User click on create order from front site
     When User enters information customer
     And User enters valid date
     And User Select a dish at order
     And User clicks on Search kitchen button 
     And User clicks on Create order button 
     Then User Create a order successfully into list

    
    
    