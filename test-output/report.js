$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Customers.feature");
formatter.feature({
  "name": "Customers",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Below are the common steps for each Senario",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User Launch Firefox browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Firefox_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on customers menu",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_customers_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a new Customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "click on customers menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_customers_menu_Item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Add new button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Add_new_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Add new customer page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_Add_new_customer_page()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Add a new customer] / nopCommerce admin...\u003e but was:\u003c[Customers] / nopCommerce admin...\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepDefinations.Steps.user_can_view_Add_new_customer_page(Steps.java:117)\r\n\tat ✽.User can view Add new customer page(file:Features/Customers.feature:14)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User enter customer info",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_enter_customer_info()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can view confirmation message \"The new customer has been added successfully.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_confirmation_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "Below are the common steps for each Senario",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User Launch Firefox browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Firefox_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on customers menu",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_customers_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search customers by EmailID",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "click on customers menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_customers_menu_Item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enters customers Email",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enters_customers_Email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on search button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should found Customer details by Email in the Search table",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_should_found_Customer_details_by_Email_in_the_Search_table()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003ctrue\u003e but was:\u003cfalse\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:118)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepDefinations.Steps.user_should_found_Customer_details_by_Email_in_the_Search_table(Steps.java:191)\r\n\tat ✽.User should found Customer details by Email in the Search table(file:Features/Customers.feature:24)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "Below are the common steps for each Senario",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User Launch Firefox browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Firefox_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on customers menu",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_customers_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search customers by Name",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "click on customers menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_customers_menu_Item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enters customers FirstName",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enters_customers_FirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enters customers LastName",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enters_customers_LastName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on search button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should found Customer details by Name in the Search table",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_should_found_Customer_details_by_Name_in_the_Search_table()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003ctrue\u003e but was:\u003cfalse\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:118)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepDefinations.Steps.user_should_found_Customer_details_by_Name_in_the_Search_table(Steps.java:214)\r\n\tat ✽.User should found Customer details by Name in the Search table(file:Features/Customers.feature:32)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});