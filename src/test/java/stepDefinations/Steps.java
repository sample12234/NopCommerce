package stepDefinations;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.*;
import pageObjects.AddcustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

public class Steps extends BaseClass {

	@Given("User Launch Firefox browser")
	public void user_Launch_Firefox_browser() {
		logger=Logger.getLogger("nopCommerce");//Add logger
		PropertyConfigurator.configure("log4j.properties");//Add logger
		System.setProperty("webdriver.gecko.driver","F:/eclipsework/NopCommerce/Drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		logger.info("*****Launching brwoser*********");
		lp=new LoginPage(driver);


	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url) {
		logger.info("*****Opening URL*********");
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String email, String password) {
		logger.info("*****Providing login details*********");
		lp.setUserName(email);
		lp.setPassword(password);
	}

	@When("Click on Login")
	public void click_on_Login() {
		logger.info("*****started login*********");
		lp.clicklLogin();

	}

	@Then("page Title should be {string}")
	public void page_Title_should_be(String title) {

		if(driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			logger.info("*****Login passed*********");
			Assert.assertTrue(false);

		}else {
			logger.info("*****Login Failed*********");
			System.out.println("sub page title is"+driver.getTitle());
		}
	}

	@When("User click on Log out link")
	public void user_click_on_Log_out_link() throws InterruptedException {
		logger.info("*****Click on Logout link*********");
		lp.clicklLogout();
		Thread.sleep(3000);

	}
	@Then("page Title shpould be {string}")
	public void page_Title_shpould_be(String title1) {
		// Assert.assertEquals(title, driver.getTitle());
		String Maint= driver.getTitle();
		if(title1.equalsIgnoreCase(Maint)) {
			System.out.println(Maint);
		}else
		{
			System.out.println("Main page title is " + Maint);
		}

	}


	@Then("close browser")
	public void close_browser() {
		driver.quit();
	}
	//Cutomers features step definations............

	@Then("User can view Dashboard")
	public void user_can_view_Dashboard() throws InterruptedException {

		addCust=new AddcustomerPage(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration", addCust.getTitle());
		Thread.sleep(2000);


	}

	@When("User click on customers menu")
	public void user_click_on_customers_menu() throws InterruptedException {
		Thread.sleep(3000);
		addCust.clickOnCustomersMenu();

	}

	@When("click on customers menu Item")
	public void click_on_customers_menu_Item() throws InterruptedException {
		Thread.sleep(2000);
		addCust.clickOnCustomersMenuItem();

	}

	@When("click on Add new button")
	public void click_on_Add_new_button() throws InterruptedException {
		Thread.sleep(2000);
		addCust.clickAddnew();
		

	}

	@Then("User can view Add new customer page")
	public void user_can_view_Add_new_customer_page() throws InterruptedException {
		
		Thread.sleep(2000);
		Assert.assertEquals("Add a new customer / nopCommerce administration", addCust.getTitle());
		Thread.sleep(1000);

	}

	@When("User enter customer info")
	public void user_enter_customer_info() throws InterruptedException {
		logger.info("*****LAdding new customer*********");
		logger.info("*****Provoding customer deatils*********");
		String email=randomeString()+"@gmail.com";
		
		addCust.setEmail(email);
		Thread.sleep(1000);
		addCust.setPassword("test123");
		Thread.sleep(1000);
		//Registered -default
		//the customer cannot be in both "guest" and regitered customer roles
		//Add the customers to "Guests" or "Registered" customer roles
		addCust.firstName("krithik");
		Thread.sleep(1000);
		addCust.lastName("Reddy");
		Thread.sleep(1000);
		addCust.setGender("Male");
		Thread.sleep(1000);
		addCust.setDob("3/01/1986");
		Thread.sleep(1000);
		addCust.setcompanyName("Automation");
		Thread.sleep(1000);
		
		addCust.setManagerOfVendor("Vendor 2");
		Thread.sleep(1000);
		addCust.setadminComment("This is for my testing....");


	}

	@When("click on save button")
	public void click_on_save_button() throws InterruptedException {
		
		addCust.clickSave();
		Thread.sleep(2000);

	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {
		
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
				.contains("The new customer has been added successfully"));

	}
	
	//Step for searching Cutomer by using EmailId.............
	
	@When("Enters customers Email")
	public void enters_customers_Email()  {
		logger.info("****searching Customer by Email*********");
		searchCust=new SearchCustomerPage(driver);
		searchCust.setEmail("admin@yourStore.com");
		
		
	    
	}

	@When("Click on search button")
	public void click_on_search_button() throws InterruptedException {
		searchCust.clickSearch();
		Thread.sleep(3000);
	    
	}

	@Then("User should found Customer details by Email in the Search table")
	public void user_should_found_Customer_details_by_Email_in_the_Search_table() {
		
	boolean status=searchCust.searchCustomerByEmail("admin@yourStore.com");
	Assert.assertEquals(true,status);
	    
	}


//Step for searching customer by Firstname and LastName
	
	@When("Enters customers FirstName")
	public void enters_customers_FirstName() {
		searchCust=new SearchCustomerPage(driver);
		searchCust.setFirstName("krithik");
	    
	}

	@When("Enters customers LastName")
	public void enters_customers_LastName() {
		searchCust.setLastName("Reddy");
	    
	}

	@Then("User should found Customer details by Name in the Search table")
	
	public void user_should_found_Customer_details_by_Name_in_the_Search_table() {
	boolean status	=searchCust.searchCustomerByName("krithik  Reddy");
		Assert.assertEquals(true, status);
		
	   
	}

}
