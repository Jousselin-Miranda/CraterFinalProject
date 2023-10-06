package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class CraterHomepage {

		
		public CraterHomepage() {
			PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy (id = "twotabsearchtextbox")
	public WebElement CraterSearchBox;

	@FindBy (xpath = "//input[@id='nav-search-submit-button']")
	public WebElement CraterSearchButton;

	}