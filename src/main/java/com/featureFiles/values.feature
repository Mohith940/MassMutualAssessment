Feature: Value scenarios

Background:
  Given lunch values application 
  
  Scenario Outline: 
  Then verify rigth <count> of values are displyed on the screen 
  
  Examples: 
  | count |
  | 5    |
  
   Scenario: 
   Then verify the values on the screen gater than zero 
  
   Scenario: 
   Then verify the total balance is correct based on the values listed on the screen
  
   Scenario: 
  Then verify the values are formatted as currencies
  
   Scenario: 
  Then verify the total balance matches the sum of the values
  