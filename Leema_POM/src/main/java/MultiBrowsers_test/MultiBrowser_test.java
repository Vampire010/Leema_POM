package MultiBrowsers_test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser_test 
{
	String URL = "http://mykidsbank.org";
	
	MultiBrowser Lp = new MultiBrowser();
	
	
	@Parameters("browser_Type")
	@BeforeTest
	public  void open_Browser(String browser_Type) throws InterruptedException
	{			 
		Lp.browsers(browser_Type, URL);
	}
	
	@Test
	public  void Login_Page_Tests() 
	{
		Lp.Login_Page();
		
	}
	
	@AfterTest
	public  void close_browser()
	{
		 Lp.driver.quit();		
	}
}
