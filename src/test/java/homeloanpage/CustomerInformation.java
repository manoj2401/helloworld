package homeloanpage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;
import util.TestBase;

public class CustomerInformation extends TestBase{

	
	
	/***Validate customer details***/
	public void validateCustomerDetails()
	{
			 driver.findElement(By.xpath("/html/body/pm-root/nav/ul/li[3]/a")).click();
			 driver.findElement(By.xpath("/html/body/pm-root/div/ng-component/span")).click();
			 driver.findElement(By.xpath("//*[@id=\"mySidenav\"]/a[2]")).click();
			 driver.findElement(By.id("username")).sendKeys("manoj");
			 driver.findElement(By.id("address")).sendKeys("hyderabad");
			 driver.findElement(By.id("phno")).sendKeys("9844373855");
			 driver.findElement(By.id("acno")).sendKeys("23095834234");
			 driver.findElement(By.xpath("/html/body/pm-root/div/ng-component/div/form/button")).click();
		
	}
	
	/***Account holder details validation****/
	boolean isAccountDetails=false;
	public boolean validateAccountHolderDetails()
	{
		try {
			//Assert.assertEquals(true, isAccountDetails);
			Assert.assertEquals(false, true);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return isAccountDetails;
	}
	
	/***Validate notification to customer for pre approved loan****/
	public void customerEligibleForPreApprovedLoan()
	{
		try {
			//Assert.fail("Notification not provided for pre approved loan");
			Assert.assertEquals(false, true);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	
	/***Validate User on customer info page****/
	public void userOnCustomerInfoPage()
	{
		try {
			 driver.findElement(By.xpath("/html/body/pm-root/nav/ul/li[3]/a")).click();
			 driver.findElement(By.xpath("/html/body/pm-root/div/ng-component/span")).click();
			 driver.findElement(By.xpath("//*[@id=\"mySidenav\"]/a[2]")).click();
			 String customerInfoPage = driver.getTitle();
			 Assert.assertEquals("CustomerInfo", customerInfoPage);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	
	/***User fetches customer data****/
	public void userFetchCustomerData()
	{
		try {
			//Assert.fail("No customer data found");
			Assert.assertEquals(false, true);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	
	/***User calculate emi****/
	public void userCalculateEMI()
	{
		try {
			 driver.findElement(By.xpath("/html/body/pm-root/nav/ul/li[3]/a")).click();
			 driver.findElement(By.xpath("/html/body/pm-root/div/ng-component/span")).click();
			 driver.findElement(By.xpath("//*[@id=\"mySidenav\"]/a[4]")).click();
			 Assert.assertEquals("CustomerInfo", "EMI calculator");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	
	/***User process EMI****/
	public void userProcessEMI()
	{
		try {
			//Assert.fail("No EMI info");
			Assert.assertEquals(false, true);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	
	/***User on bank loan page****/
	public void userOnBankLoanPage()
	{
		try {
			//Assert.fail("User on bank loan page not found");
			Assert.assertEquals(false, true);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	

	/***Fetch property price****/
	public void fetchPropertyPrice()
	{
		try {
			//Assert.fail("Property price not found");
			Assert.assertEquals(false, true);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	
	/***Home loan percentage****/
	public void homeLoanPercentage()
	{
		try {
			//Assert.fail("Home loan percentage not provided");
			Assert.assertEquals(false, true);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	
	/***Home loan tenure****/
	public void homeLoanTenure()
	{
		try {
			//Assert.fail("Home loan tenure not provided");
			Assert.assertEquals(false, true);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}
}
