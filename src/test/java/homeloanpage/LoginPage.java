package homeloanpage;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class LoginPage extends TestBase{
	

	/****Instantiate the driver****/
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	/****Login page title validation****/
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	
	
	/***** Login to home loan application****/
	public void login(String un,String pwd)
	{	
		try {
		 driver.findElement(By.xpath("/html/body/pm-root/nav/ul/li[2]/a")).click();
		 driver.findElement(By.id("username")).sendKeys(un);
		 driver.findElement(By.id("password")).sendKeys(pwd);
		// driver.findElement(By.xpath("/html/body/pm-root/div/ng-component/div/form/button")).click();
		 //Assert.assertEquals("No data", "login successful");
		}catch(NoSuchElementException | TimeoutException e)
		{
			e.printStackTrace();
		}
	}
	
}
