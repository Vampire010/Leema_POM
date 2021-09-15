package Test_Pages_TestNG_copy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Browser_Config.Browser_Lanuch;
import SignUP_Login_Page.Login_Page;

public class Login_Page_Test 
{
	String URL = "http://mykidsbank.org/";
	String Browser_typ ;
	Browser_Lanuch br = new Browser_Lanuch();

	@Parameters("browser_Type")
	@BeforeTest
	public void open_browser()
	{
		br.browsers(Browser_typ, URL);
	}
	
	@Test(groups = { "Smoke_Test_Case" })
	public void Login_test() throws InterruptedException 
	{
		Login_Page lp = new Login_Page(br.driver);
		lp.Bank_Id();
		lp.UserName();
		lp.Password();
		Thread.sleep(2000);
		lp.Lign_Button();
		Thread.sleep(2000);	
	}
	
	
	@AfterTest
	public void close_browser() throws InterruptedException
	{
		Thread.sleep(3000);
		br.driver.quit();	
	}
	
}
