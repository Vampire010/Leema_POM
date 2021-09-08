package Test_Pages;

import Browser_Config.Browser_Lanuch;
import SignUP_Login_Page.Login_Page;

public class Login_Page_Test {

	public static void main(String[] args) throws InterruptedException 
	{
		String URL = "http://mykidsbank.org/";
		String Browser = "firefox";
		Browser_Lanuch br = new Browser_Lanuch();
		br.browsers(Browser, URL);
		
		
		Login_Page lp = new Login_Page(br.driver);
		
		lp.Bank_Id();
		lp.UserName();
		lp.Password();
		Thread.sleep(2000);

		lp.Lign_Button();
		Thread.sleep(2000);
		
		Thread.sleep(3000);

		
	}

}
