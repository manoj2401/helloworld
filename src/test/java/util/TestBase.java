package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;

public class TestBase {


	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("src/test/java/config/config.properties");
			
			prop.load(fis);
			
		}catch(IOException e)
		{
			e.getMessage();
		}
	}
	 public void initialization()
	 {
		 String browserName=prop.getProperty("browser");
		 //WebDriver driver=new HtmlUnitDriver();
		 if(browserName.equals("chrome")) {
		 System.setProperty("webdriver.chrome.driver",
		 "/Users/manoj/Downloads/chrome driver/chromedriver.exe"); 
		 driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	 
		 driver.get(prop.getProperty("url"));
		 }
		 else {
			 Assert.fail("Unable to launch browser");
		 }

	 }
}
