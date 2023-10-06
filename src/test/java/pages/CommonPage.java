package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class CommonPage {
	
	public CommonPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy (xpath = "//div[text()='Email ']")
	public WebElement login_page_email_label;
}
