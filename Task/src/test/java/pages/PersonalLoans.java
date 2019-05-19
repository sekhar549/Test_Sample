package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PersonalLoans {

	WebDriver driver;
	
	public PersonalLoans(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="ANZ Variable Rate Loan")
	public WebElement VariableRateLink;
	
	
	//Methods for the actions on the page
	public void clickVariableRateLink(){
		VariableRateLink.click();
	}
	

}
