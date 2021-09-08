package Test_Pages;

import Browser_Config.Browser_Lanuch;
import SignUP_Login_Page.SignUp_Page;

public class SignUp_Page_test
{

	public static void main(String[] args) throws InterruptedException 
	{
		String URL = "http://mykidsbank.org/";
		String Browser = "chrome";
		Browser_Lanuch br = new Browser_Lanuch();
		br.browsers(Browser, URL);
		
		SignUp_Page sp = new SignUp_Page(br.driver);
		sp.Frst_name();
		
		sp.Lst_name();
		sp.Your_Email();
		sp.ReEnt_Your_Email();
		sp.User_Password();
		sp.Parent_Gurd();
		sp.Sign_Up_btn();
		Thread.sleep(2000);
		sp.Continue_btn();
		Thread.sleep(2000);
		sp.Home_btn();
		Thread.sleep(2000);

		br.driver.quit();
		
	}

}
