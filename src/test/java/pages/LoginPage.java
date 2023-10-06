package pages;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class LoginPage {

	
	public LoginPage() {//this is a constructor
		PageFactory.initElements(Driver.getDriver(), this);
		
	}
	@FindBy (xpath = "//div[text()='Email ']")
			public WebElement login_page_email_label;
	
	@FindBy (css  = "input[name=email]")
			public WebElement login_page_email_box;
	
	@FindBy (xpath = "//div[text()='password ']")
			public WebElement login_page_password_label;
	
	@FindBy (css = "input[name=password]")
			public WebElement login_page_password_box;
	
	@FindBy (linkText = "Forgot password?")
			public WebElement login_page_forgotPassword_link;
	
	@FindBy (xpath = "//button[text()'Login']")
			public WebElement login_page_login_btn;
	
	@FindBy (xpath = "//p[contains(text(), 'Copyright @')]")
			public WebElement login_page_copyright_text;
	
	@FindBy (xpath = "//h1[contains(text(), 'Simple Invoicing')]")
			public WebElement login_page_simple_invoicing_text;
	
	
	@FindBy (xpath = "//p[contains(text(), 'creater helps you')]")
			public WebElement login_page_createrHelpsYou_text;
	
	// how to have multiple elements as a page object
	@FindBy (xpath = "//span[text()='Field is required']")
			public List<WebElement> login_page_fielRequired_Messages;
	
	@FindBy (xpath = "//p[text()='These credentials do not match our records.']")
	public WebElement login_page_invalidLogin_message;
	
	
}