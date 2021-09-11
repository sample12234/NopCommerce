package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilites.WaitHelper;

public class SearchCustomerPage {
	public WebDriver Idriver;
	WaitHelper waithelper;
	public SearchCustomerPage(WebDriver rdriver) {
		Idriver=rdriver;
		PageFactory.initElements(Idriver, this);
		waithelper=new WaitHelper(Idriver);

	}
	@FindBy(how = How.ID, using ="SearchEmail")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(how = How.ID, using ="SearchFirstName")
	@CacheLookup
	WebElement txtFirstName;

	@FindBy(how = How.ID, using ="SearchLastName")
	@CacheLookup
	WebElement txtLastName;

	@FindBy(how = How.ID, using ="SearchMonthOfBirth")
	@CacheLookup
	WebElement drpdobMonth;

	@FindBy(how = How.ID, using ="SearchDayOfBirth")
	@CacheLookup
	WebElement drpdobDay;

	@FindBy(how = How.ID, using ="SearchCompany")
	@CacheLookup
	WebElement txtCmpName;

	@FindBy(how = How.XPATH , using ="//div[@class='k-multiselect-wrap k-floatwrap']")
	@CacheLookup
	WebElement txtcustomerRoles;

	@FindBy(how = How.XPATH , using ="//li[contains(text(),'Adminstrators']")
	@CacheLookup
	WebElement lstitemAdminstrators;

	@FindBy(how = How.XPATH , using ="//li[contains(text(),'Registered']")
	@CacheLookup
	WebElement lstitemRegistered;

	@FindBy(how = How.XPATH , using ="//li[contains(text(),'Guests']")
	@CacheLookup
	WebElement lstitemGuests;

	@FindBy(how = How.XPATH , using ="//li[contains(text(),'Vendors']")
	@CacheLookup
	WebElement lstitemVendors;

	@FindBy(how = How.ID , using ="search-customers")
	@CacheLookup
	WebElement btnSearch;

	@FindBy(how = How.XPATH, using = "//table[@role='grid']")
	@CacheLookup
	WebElement tblSearchResults;

	@FindBy(how = How.XPATH, using = "//table[@id='customer-grid']")
	@CacheLookup
	WebElement table;

	@FindBy(how = How.XPATH, using = "//table[@role='customer-grid']//tbody/tr")
	@CacheLookup
	List<WebElement> tableRows;

	@FindBy(how = How.XPATH, using = "//table[@role='customer-grid']//tbody/tr/td")
	@CacheLookup
	List<WebElement> tableColumns;

	public void setEmail(String email) 
	{
		waithelper.WaitForElement(txtEmail, 20);
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}

	public void setFirstName(String fname) {
		waithelper.WaitForElement(txtFirstName, 30);
		txtFirstName.clear();
		txtFirstName.sendKeys(fname);

	}

	public void setLastName(String lname) {
		waithelper.WaitForElement(txtLastName, 30);
		txtLastName.clear();
		txtFirstName.sendKeys(lname);

	}

	public void clickSearch() {
		btnSearch.click();
		waithelper.WaitForElement(txtLastName, 30);
	}

	public  int getNoOfColumns() {
		return(tableColumns.size());

	}

	public int getNoOfRows() {
		return(tableRows.size());

	}
	public boolean searchCustomerByEmail(String email) {
		boolean flag=false;
		for(int i=1;i<=getNoOfRows();i++) {
			String emailid=table.findElement(By.xpath("//table[@id='customesr-grid']/tbody/tr["+i+"]/td[1]")).getText(); 
			System.out.println(emailid);
			if(emailid.equals(email))
			{
				flag=true;
			}

		}
		return flag;
	}
	
	public boolean searchCustomerByName(String Name) {
		boolean flag=false;
		for(int i=1;i<=getNoOfRows();i++) {
			String name=table.findElement(By.xpath("//table[@id='customer-grid']/tbody/tr["+i+"]/td[2]")).getText();
			String names[]=name.split("  ");//it will seperate 1st name ang last name
			if(names[0].equals("krithik")&&names[1].equals("Reddy")) {
				flag=true;
				
			}
			
		}
		return flag;
	}
}
