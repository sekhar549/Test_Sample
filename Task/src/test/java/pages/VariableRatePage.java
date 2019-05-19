package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class VariableRatePage {
	
	
	WebDriver driver;
	
	public VariableRatePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//div[h3='What could my repayments be?']")
	public WebElement RepaymentLink;
	
	@FindBy(how=How.CLASS_NAME,using="loan")
	public WebElement LoanAmountTextbox;
	
	@FindBy(how=How.CLASS_NAME,using="term")
	public WebElement TermDropdown;
	
	@FindBy(how=How.CLASS_NAME,using="interest")
	public WebElement InterestTextbox;
	
	@FindBy(how=How.CLASS_NAME,using="installments")
	public WebElement InstallmentsDropdown;
	
	@FindBy(how=How.CLASS_NAME, using="repay__result__text__amount")
	public WebElement RepaymentAmount;
	
	
	//Methods for the actions on the page
	public void clickRepaymentLink(){
		RepaymentLink.click();
	}
	
	public void enterLoanAmount(String amount){
		LoanAmountTextbox.sendKeys(amount);
	}
	
	public void selectLoanTerm(String type){
		
		Select term = new Select(TermDropdown);
		
		term.selectByVisibleText(type);
	}
	
	public void enterInterest(String interest){
		InterestTextbox.sendKeys(interest);
	}
	
	public void selectInstallment(String installment){
		
		Select instadropdown = new Select(InstallmentsDropdown);
		
		instadropdown.selectByVisibleText(installment);
	}
	
	public String getRepaymentAmount(){
		
		return RepaymentAmount.getText();		
		
		
	}

}
