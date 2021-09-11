Feature: Login

  Scenario: Successfull Login with valid Credentials
    Given User Launch Firefox browser
    When User opens URL "http://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then page Title should be "Dashboard / nopCommerce administrartion"
    When User click on Log out link
    Then page Title shpould be "Your store. Login"
    And close browser

  Scenario Outline: Login with Data Driven Concept
    Given User Launch Firefox browser
    When User opens URL "http://admin-demo.nopcommerce.com/login"
    And User enters Email as "<email>" and Password as "<Password>"
    And Click on Login
    Then page Title should be "Dashboard / nopCommerce administrartion"
    When User click on Log out link
    Then page Title shpould be "Your store. Login"
    And close browser

    Examples: 
      | email               | Password |
      | admin@yourstore.com | admin    |
      | admin@yourstore.com | master   |
