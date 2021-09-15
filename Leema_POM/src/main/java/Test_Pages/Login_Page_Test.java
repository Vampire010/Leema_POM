package Test_Pages;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Browser_Config.Browser_Lanuch;
import SignUP_Login_Page.Login_Page;

public class Login_Page_Test 
{
	String URL = "http://mykidsbank.org/";
	String Browser_typ = "chrome";
	Browser_Lanuch br = new Browser_Lanuch();

	@BeforeMethod
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
		lp.LogOut_Button();

		
	}
	
	
	
	@AfterMethod
	public void close_browser() throws InterruptedException
	{
		Thread.sleep(3000);
		br.driver.quit();	
	}
	
}
