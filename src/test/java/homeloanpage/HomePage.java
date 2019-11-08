package homeloanpage;



import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class HomePage extends TestBase {
	
	
	/****Validate Home page logo****/
	boolean isLogoDisplayed=false;
	public boolean validateHomePageLogo()
	{
		try {
			driver.findElement(By.xpath("/html/body/pm-root/nav/a/img")).isDisplayed();
		  isLogoDisplayed=true;
		}catch(NoSuchElementException e)
		{
			e.printStackTrace();
		}
		return isLogoDisplayed;
	}
	
	

}
