package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class DashboardPage {
	
	public DashboardPage() { //this is a constructor
		
		PageFactory.initElements(Driver.getDriver(), this);
		
	}
	@FindBy (linkText = " Dashboard")
	public WebElement dashboard_Tab;
	
	@FindBy (xpath= "//a[text()=' Items']")
	public WebElement items_tab;
	
	@FindBy (xpath= "//a[text()= ' Customers']")
	public WebElement customers_tab;
	
	@FindBy (xpath= "//a[text()= ' Estimates']")
	public WebElement estimates_tab;
	
	@FindBy (xpath= "//a[text()= ' Invoices']")
	public WebElement invoices_tab;
	

	@FindBy (xpath= "//a[text()= ' Recurring Invoices']")
	public WebElement recurring_invoices_tab;
	

	@FindBy (xpath= "//a[text() = ' Payments']")
	public WebElement payments_tab;
	
	
	@FindBy (xpath= "//a[text() = ' Expenses']")
	public WebElement expenses_tab;
	
	@FindBy (xpath= "//a[text() = ' Reports']")
	public WebElement reports_tab;
	
	@FindBy (xpath= "//a[text() = ' Settings']")
	public WebElement settings_tab;
	
	@FindBy (xpath ="//p[text()='Logged in successfully.']")
	public WebElement loggedInSuccess_message;
	
	

}
