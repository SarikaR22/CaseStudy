Feature: Place Order
  I want to use this template for my feature file

@chrome
  Scenario: Search single item
    Given User is on home page
    When User search an item "MacBook Air"
    Then Item must be listed
    
 # Scenario: Add item to cart
 # Given User should be on Search Result page 
  #When User add item to cart 
#  Then Item must be added 
  
  #Scenario: Checkout Order 
 # When User do checkout 
  #Then User should navigate to checkout page 
  #https://tutorialsninja.com/demo/