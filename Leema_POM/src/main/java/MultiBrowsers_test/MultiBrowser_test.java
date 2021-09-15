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
	
	MultiBrowser Login_Pages = new MultiBrowser();
	@Parameters("browser_Type")
	@BeforeTest
	public  void open_Browser(String browser_Type) throws InterruptedException
	{			 
		System.out.println("The thread ID for Chrome Test is "+ Thread.currentThread().getId());

		
		Login_Pages.browsers(browser_Type, URL);
	}
	
	@Test
	public  void Login_Page_Tests() 
	{
		Login_Pages.Login_Page();
		
	}
	
	
	
	@AfterTest
	public  void close_browser()
	{
		 System.out.println("After Test Thread Number Is " + Thread.currentThread().getId());
			Login_Pages.driver.quit();

				
	}
}
