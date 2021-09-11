package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import io.cucumber.core.backend.ObjectFactory;
public class LoginPage {
	public WebDriver Idriver;
	public LoginPage(WebDriver rdriver) {
		Idriver=rdriver;
		PageFactory.initElements(rdriver,this);

     }
	@FindBy(id="Email")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(id="Password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath="//button[@type=\"submit\"]")
	@CacheLookup
	WebElement btnLogin;

	@FindBy(xpath="//a[text()='Logout']")
	@CacheLookup
	WebElement lnkLogout;

	public void setUserName(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}
	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	public void clicklLogin() {
		btnLogin.click();
	}
	public void clicklLogout() {
		lnkLogout.click();
	}
}
