#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Open BlazedDemo Application



  Scenario Outline: Booking Flight
    Given Open Application
    And Choose Departure and Destination City
    When Click Find Flight
    Then Flights from Boston to London 
  	And Enter "<inputName>" and "<address>" and "<city>" and "<state>" and "<zipCode>" 
 		And Select card
    And Enter "<creditCardNumber>","<creditCardMonth>","<creditCardYear>","<nameOnCard>" 
    And Purchase Flight
    And Close the Browser 
    

Examples:
   	  | inputName |address        | city            |state        | zipCode |creditCardNumber |creditCardMonth |creditCardYear| nameOnCard|
  		| Aisha Rehman    |500 ridgeview Dr  |Bridgeport       |west Virgina | 26230   |12345678910      |12              |2020          |  Aisha   |
   	 