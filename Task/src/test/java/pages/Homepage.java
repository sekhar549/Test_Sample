package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;
	
	//constructor to initialize the elements
	
	public Homepage(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//Define the web elements
	
	@FindBy(how=How.XPATH,using="//*[@class='primary__nav__trigger  semibold']")
	public WebElement PersonalLink;
	
	@FindBy(how=How.XPATH,using="//*[@class='sprite personal-loans']")
	public WebElement PersonalLoansLink;
	
	
	//Methods for the actions on the page
	public void clickPersonalLink(){
		PersonalLink.click();
	}
	
	public void clickPersonalLoansLink(){
		PersonalLoansLink.click();
	}
	

}
