Feature: Customers

  Background: Below are the common steps for each Senario
    Given User Launch Firefox browser
    When User opens URL "http://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then User can view Dashboard
    When User click on customers menu

  Scenario: Add a new Customer
    And click on customers menu Item
    And click on Add new button
    Then User can view Add new customer page
    When User enter customer info
    And click on save button
    Then User can view confirmation message "The new customer has been added successfully."
    And close browser

  Scenario: Search customers by EmailID
    And click on customers menu Item
    And Enters customers Email
    When Click on search button
    Then User should found Customer details by Email in the Search table
    And close browser

  Scenario: Search customers by Name
    And click on customers menu Item
    And Enters customers FirstName
    And Enters customers LastName
    When Click on search button
    Then User should found Customer details by Name in the Search table
    And close browser
