package stepdefs;

import helper.Browser;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import pages.Homepage;
import pages.PersonalLoans;
import pages.VariableRatePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Repaymentcalculator 
{
	
	public WebDriver driver;
	
	
	@Given("the customer is on homepage")
	public void the_customer_is_on_homepage() {
	    
		driver = Browser.openWebpage(driver, "Chrome", "https://www.anz.com.au/");
		
		
		
	}


	@When("customer clicks {string}")
	public void customer_clicks(String link) {
	    
		switch(link){
		
		case "Personal":
			new Homepage(driver).clickPersonalLink();
		
		case "Personal Loans":
			new Homepage(driver).clickPersonalLoansLink();
			
		case "ANZ Variable Rate Loan":
			new PersonalLoans(driver).clickVariableRateLink();
			
		case "Repayment calculator":
			new VariableRatePage(driver).clickRepaymentLink();
			
		default:
			break;
			
			
			
		}
		
		
	}
	

	@When("customer fill the following details:")
	public void customer_fill_the_following_details(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    
		List<Map<String,String>> list = dataTable.asMaps(String.class, String.class);
		
		VariableRatePage ratepage = new VariableRatePage(driver);
		
		ratepage.enterLoanAmount(list.get(0).get("Loan amount"));
		ratepage.selectLoanTerm(list.get(0).get("Term"));
		ratepage.enterInterest(list.get(0).get("Interest rate"));
		ratepage.selectInstallment(list.get(0).get("Repayments frequency"));
		
			
		
	}

	@Then("customer can see the repayment amount")
	public void customer_can_see_the_repayment_amount() {
	   
		
		System.out.println("calculating your loan amount");
		System.out.println(new VariableRatePage(driver).getRepaymentAmount());
		
	    
	}
}
