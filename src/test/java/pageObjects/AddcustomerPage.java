package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddcustomerPage {

	public WebDriver Idriver;
	public AddcustomerPage(WebDriver rdriver) {
		Idriver=rdriver;
		PageFactory.initElements(Idriver, this);
	}

	By lnkCustomers_menu=By.linkText("Customers");
	By lnkCustomers_menuitem=By.xpath("//a[@href='/Admin/Customer/List' and @class='nav-link']");
	By btnAddnew=By .xpath("//a[@class='btn btn-primary' and @href='/Admin/Customer/Create']");
	By txtEmail=By.xpath("//input[@id='Email']");
	By txtPassword=By.xpath("//input[@id='Password']");
	By txtFirstName=By.xpath("//input[@id='FirstName']");
	By txtLastName=By.xpath("//input[@id='LastName']");

	By rdMaleGender=By.xpath("//input[@id='Gender_Male']");
	By rdFemaleGender=By.xpath("//input[@id='Gender_Female']");

	By txtDob=By.xpath("//input[@id='DateOfBirth']");
	By txtCompanyName=By.xpath("//input[@id='Company']");
	By checkbxIstaxExcempt=By.xpath("//input[@id='IsTaxExempt']");

	By txtCostomerRoles=By.xpath("//ul[@id='SelectedCustomerRoleIds_taglist']/parent::div");
	By lstitemAdministors=By.xpath("//li[text()='Administrators']");
	By lstitemFormModerators=By.xpath("//li[text()='Forum Moderators']");
	By lstitemGuests=By.xpath("//li[text()='Guests']");
	By lstitemVendors=By.xpath("//li[text()='Vendors']");
	By listitemRegistered=By.xpath("//li[text()='Registered']");

	By drpmgrOfVendor=By.xpath("//select[@id='VendorId']");
	By txtAdminComment=By.xpath("//textarea[@id='AdminComment']");
	By btnSave=By.xpath("//button[@name='save']");

	public String getTitle() {
		return Idriver.getTitle();
	}

	public void clickOnCustomersMenu() {
		Idriver.findElement(lnkCustomers_menu).click();

	}
	public void clickOnCustomersMenuItem() {
		Idriver.findElement(lnkCustomers_menuitem).click();

	}
	public void clickAddnew() {
		Idriver.findElement(btnAddnew).click();
	}
	public void setEmail(String email) {
		Idriver.findElement(txtEmail).sendKeys(email);
	}
	public void setPassword(String pwd) {
		Idriver.findElement(txtPassword).sendKeys(pwd);
	}
	public void firstName(String Fname) {
		Idriver.findElement(txtFirstName).sendKeys(Fname);
	}

	public void lastName(String Lname) {
		Idriver.findElement(txtLastName).sendKeys(Lname);
	}
	/*public void setCustomersRoles(String role) throws InterruptedException {
		
		
	     WebElement  cusrole= Idriver.findElement(txtCostomerRoles);
	        cusrole.click();
	       Thread.sleep(1000);
		cusrole.clear();
		  cusrole.click();
		WebElement listitem;
	
		if(role.equals("Admimistrator"))
		{
			listitem=Idriver.findElement(lstitemAdministors);
		}

		else if(role.equals("Forum Moderators"))
		{
			listitem=Idriver.findElement(lstitemFormModerators);
		}
		else if(role.equals("Guests"))
		{
			listitem=Idriver.findElement(lstitemGuests);
		}
		else if(role.equals("Vendors"))
		{
			listitem=Idriver.findElement(lstitemVendors);
		}
		else  
		{
			listitem=Idriver.findElement(listitemRegistered);
		}
		//listitem.click();
		JavascriptExecutor js=(JavascriptExecutor)Idriver;
		js.executeScript("arguments[0].click();", listitem);
	}*/
	public void setManagerOfVendor(String value)
	{
		Select drp=new Select(Idriver.findElement(drpmgrOfVendor));
		drp.selectByVisibleText(value);
	}
	public void setGender(String gender) {
		if(gender.equals("Male")) {
			Idriver.findElement(rdMaleGender).click();
		}
		else if(gender.equals("Female")) {
			Idriver.findElement(rdFemaleGender).click();
		}
		else
		{
			Idriver.findElement(rdMaleGender).click();
		}
	}
	public void setDob(String dob) {
		Idriver.findElement(txtDob).sendKeys(dob);
	}
	public void setcompanyName(String cmpname) {
		Idriver.findElement(txtCompanyName).sendKeys(cmpname);
	}
	public void setadminComment(String comment) {
		Idriver.findElement(txtAdminComment).sendKeys(comment);
	}

	public void clickSave() {
		Idriver.findElement(btnSave).click();
	}

}