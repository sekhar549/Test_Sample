Feature: calucate the repayment amount for personal loan

Scenario: Provide the details and calculate repayment amount for personal loan 
	Given the customer is on homepage 
	When customer clicks "Personal" 
	And customer clicks "Personal Loans" 
	And customer clicks "ANZ Variable Rate Loan" 
	And customer clicks "Repayment calculator" 
	And customer fill the following details: 
		|Loan amount|Type|Term|Interest rate|Repayments frequency|
		|30000|Variable rate|5 years|15.99|Monthly|
	Then customer can see the repayment amount