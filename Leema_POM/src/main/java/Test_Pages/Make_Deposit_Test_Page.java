package Test_Pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Browser_Config.Browser_Lanuch;
import Create_new_deposit_account.Create_Deposit_Account;
import Money_Deposit.Make_Deposit_One_Accoount;

public class Make_Deposit_Test_Page 
{
	
	String URL = "http://mykidsbank.org/";
	String Browser_typ = "chrome";
	Browser_Lanuch br = new Browser_Lanuch();

	@BeforeMethod
	public void open_browser() throws InterruptedException
	{
		br.browsers(Browser_typ, URL);
		Login_Page_Test lg = new Login_Page_Test();
		lg.Login_test();
		
	}
	
	@Test(groups = { "Regression_Test_Case" })
	public void test() throws InterruptedException 
	{
		Make_Deposit_One_Accoount MKDSP_Acnt = new Make_Deposit_One_Accoount(br.driver);
		MKDSP_Acnt.Accounts();
		MKDSP_Acnt.Make_Deposit();
		MKDSP_Acnt.Date();
		MKDSP_Acnt.Description();
		MKDSP_Acnt.Deposit_Amount();
		MKDSP_Acnt.Account_holder();
		MKDSP_Acnt.Submit_button();
		MKDSP_Acnt.Deposit_Confirm();
		
	}
	
	
	@AfterMethod
	public void close_browser() throws InterruptedException
	{
		Thread.sleep(3000);
		br.driver.quit();	
	}

}
