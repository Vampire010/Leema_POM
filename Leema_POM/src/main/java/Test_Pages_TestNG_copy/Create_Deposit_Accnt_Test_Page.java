package Test_Pages_TestNG_copy;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Browser_Config.Browser_Lanuch;
import Create_new_deposit_account.Create_Deposit_Account;
import SignUP_Login_Page.Login_Page;

public class Create_Deposit_Accnt_Test_Page 
{

	String URL = "http://mykidsbank.org/";
	String Browser_typ = "chrome";
	Browser_Lanuch br = new Browser_Lanuch();

	@BeforeMethod
	public void open_browser() throws InterruptedException
	{
		br.browsers(Browser_typ, URL);
		Login_Page lp = new Login_Page(br.driver);
		lp.Bank_Id();
		lp.UserName();
		lp.Password();
		Thread.sleep(2000);
		lp.Lign_Button();
		Thread.sleep(2000);	
		
	}
	
	@Test(groups = { "Smoke_Test_Case" })
	public void test() throws InterruptedException 
	{
		Create_Deposit_Account CDA = new Create_Deposit_Account(br.driver);
		CDA.Click_on_Accounts_Title();
		CDA.Click_on_Creat_New_Account();
		CDA.Display_Name();
		CDA.Login_UserName();
		CDA.Login_password();
		CDA.submit_Btn();
		CDA.Assert_Test();
	}
	
	
	@AfterMethod
	public void close_browser() throws InterruptedException
	{
		Thread.sleep(3000);
		br.driver.quit();	
	}
	
	
}
