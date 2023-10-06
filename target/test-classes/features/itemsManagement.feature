Feature: Items Management

Background:
Given As an entity user, I am logged in
    And I navigate to Items tab
   #in background we out the first one or few steps that are used by each scenarios so that we dont have to 
   #redeclare that given steps in each scenarios. 
   
  @createItem
  Scenario: As a user, I am able to create an item or a service
   
    When I click on the Add Item button
    Then I should be on item input page
    When I provide item information name "table lamp", price "250", unit "pc", and description "very nice table lamp"
    And I click Save Item button
    Then The Item is added to the Item list table
    And I delete the item

  @editItem
  Scenario: As a user, I am able to update an item or a service
    
    When I click on the Add Item button
    And I should be on item input page
    When I provide item information  name "coffe beans", price "1800",unit "pc", and description " very nice coffee mug"
    And I click save Item button
    Then The item is added to the item list table
    When I click on Edit button
    Then I should be on Edit items page
    When I update the items price to "2200"
    And click on update item button
    Then Items price shoulb be update to "2200"
    And I delete the item

    @ScenarioOutlineDemo
    Scenario Outline: As a user, I am able to create items with data table
    When I click on the Add Item button
    Then I should be on item input page
    When I provide item information name "<itemName>", price "<itemPrice>", unit "<unitType>", and description "<itemDes>"
    And I click Save Item button
    Then The Item is added to the Item list table
    And Item "<itemName>" should be on the table 
    And I delete the item
    
    Examples: Items Data
    |  itemName           | itemPrice  | unitType   | itemDes                |
    |  water bottle       |  3800      |     pc     | very good bottle water |
    |  chair			        |  5800      |     pc     | nice chair             |
    |  ugly coffee mug    |  4500      |     pc     | very ugly coffee  mug  | 
    |  Air conditioner    |  28800     |     pc     |   Reliable Ac          |