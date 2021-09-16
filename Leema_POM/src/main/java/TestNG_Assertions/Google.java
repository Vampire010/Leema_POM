package TestNG_Assertions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Browser_Config.Browser_Lanuch;
import Create_new_deposit_account.Create_Deposit_Account;
import SignUP_Login_Page.Login_Page;

public class Google 
{
	String URL = "http://mykidsbank.org/";
	String Browser_typ = "chrome";
	Browser_Lanuch br = new Browser_Lanuch();

	@BeforeMethod
	public void open_browser() throws InterruptedException
	{
		br.browsers(Browser_typ, URL);
	
		
	}
	
	@Test(groups = { "Smoke_Test_Case" })
	public void test() throws InterruptedException 
	{
		br.driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/div/div[2]/a")).click();
		Thread.sleep(3000);

	}
	
	/*//Assert.assertFalse(Condition, Message)
	@AfterMethod
	public void close_browser() throws InterruptedException
	{
		String page_url = br.driver.getCurrentUrl();
		System.out.println(page_url);
		
	    //Condition, Message
	    Assert.assertFalse(URL.equals("IM Wrong"), "AssertFalse test is failed!");

	    System.out.println("AssertFalse Test is Passed!\n");
		
	    Thread.sleep(3000);
		br.driver.quit();	
	}*/
	
	
	@AfterMethod
	public void close_browser() throws InterruptedException
	{
		String page_url = br.driver.getCurrentUrl();
		System.out.println(page_url);
		
	    //Condition, Message
	    Assert.assertEquals(page_url, URL, "AssertEquals test is failed!");

	    System.out.println("AssertFalse Test is Passed!\n");
		
	    Thread.sleep(3000);
		br.driver.quit();	
	}
	
	
	

}
