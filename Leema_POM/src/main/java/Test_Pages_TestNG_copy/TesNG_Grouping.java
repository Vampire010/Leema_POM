package Test_Pages_TestNG_copy;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Browser_Config.Browser_Lanuch;
import Create_new_deposit_account.Create_Deposit_Account;
import Money_Deposit.Make_Deposit_One_Accoount;
import SignUP_Login_Page.Login_Page;
import Test_Pages.Login_Page_Test;
import Test_Pages.Make_Deposit_Test_Page;

public class TesNG_Grouping 
{
	Login_Page_Test lp = new Login_Page_Test();
	Make_Deposit_Test_Page MDT = new Make_Deposit_Test_Page();
	
	@Test ( groups = {"Regresssion_Test_Case"}  )
	public void test1() throws InterruptedException
	{
		lp.open_browser();
		lp.Login_test();
		lp.close_browser();
		
	}
	
	@Test ( groups = {"Smoke_Test_Case"}  )
	public void test2() throws InterruptedException
	{
		MDT.open_browser();
		MDT.test();
		MDT.close_browser();
		
	}

}
