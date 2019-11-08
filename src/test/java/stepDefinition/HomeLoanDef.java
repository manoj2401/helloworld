package stepDefinition;


import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import junit.framework.AssertionFailedError;
import homeloanpage.CustomerInformation;
import homeloanpage.HomePage;
import homeloanpage.LoginPage;
import util.TestBase;

public class HomeLoanDef extends TestBase{

	//Instantiating Login page to implement POM for login page
	LoginPage loginPage=new LoginPage();
	HomePage homePage=new HomePage();
	CustomerInformation customerInformation=new CustomerInformation();
	
	
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
		new TestBase().initialization();
	}

	@When("^user is on bank Login Page$")
	public void user_is_on_bank_Login_Page() throws Throwable {
		String title=loginPage.validateLoginPageTitle();
		try {
			Assert.assertEquals("DBS Bank Home Loan", title);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username,String password) throws Throwable {
		try {
		loginPage.login(username, password); 
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Given("^user is on bank home Page$")
	public void user_is_on_bank_home_Page() throws Throwable {
			boolean isBankLogoDisplyed=homePage.validateHomePageLogo();
			try {
			Assert.assertEquals(true, isBankLogoDisplyed);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}

	
	@Then("^user enters bank details$")
	public void user_enters_bank_details() throws Throwable {
		try {
			customerInformation.validateCustomerDetails();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

	@Then("^user validate account holder details$")
	public void user_validate_account_holder_details() throws Throwable {
		try {
		customerInformation.validateAccountHolderDetails();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	@Then("^notify customer eligible for pre approved loan$")
	public void notify_customer_eligible_for_pre_approved_loan() throws Throwable {
		customerInformation.customerEligibleForPreApprovedLoan();
	}

	@Given("^user is on bank customer info Page$")
	public void user_is_on_bank_customer_info_Page() throws Throwable {
		customerInformation.userOnCustomerInfoPage();
	}

	@When("^user fetch customer details$")
	public void user_fetch_customer_details() throws Throwable {
		customerInformation.userFetchCustomerData();
	}

	@Then("^validate customer eligible for how much emi$")
	public void validate_customer_eligible_for_how_much_emi() throws Throwable {
		customerInformation.userCalculateEMI();
	}

	@Then("^bank process emi$")
	public void bank_process_emi() throws Throwable {
		customerInformation.userProcessEMI();
	}

	@Given("^user is on bank loan page$")
	public void user_is_on_bank_loan_page() throws Throwable {
		customerInformation.userOnBankLoanPage();
	}

	@When("^user fetches property price$")
	public void user_fetches_property_price() throws Throwable {
		customerInformation.fetchPropertyPrice();
	}

	@Then("^validate home loan percentage$")
	public void validate_home_loan_percentage() throws Throwable {
			
	}

	@Then("^validate home loan tenure$")
	public void validate_home_loan_tenure() throws Throwable {

	}
	
	
	

}
