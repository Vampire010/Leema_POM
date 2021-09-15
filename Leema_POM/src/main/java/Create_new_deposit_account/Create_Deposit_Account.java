package Create_new_deposit_account;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Create_Deposit_Account
{

	@FindBy(xpath="/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[1]/td[3]/img[3]")
	WebElement Click_on_Accounts;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/table/tbody/tr/td[3]/table/tbody/tr[1]/td/span")
	WebElement Click_on_Creat_New_Accounts;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table[1]/tbody/tr[1]/td[2]/input")
	WebElement Displd_Name;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table[1]/tbody/tr[2]/td[2]/input")
	WebElement Lgn_UserName;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table[1]/tbody/tr[3]/td[2]/input")
	WebElement Lgn_password;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table[2]/tbody/tr/td[1]/span")
	WebElement sbmit_Btn;
	
	@FindBy(xpath="//*[contains(text(),'krishna')]")
	WebElement usr_name;
	
	
	String Acnt_name = "krishna";
	public Create_Deposit_Account(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	public void Click_on_Accounts_Title()
	{
		Click_on_Accounts.click();
	}
	
	public void Click_on_Creat_New_Account()
	{
		Click_on_Creat_New_Accounts.click();
	}
	
	public void Display_Name()
	{
		Displd_Name.sendKeys(Acnt_name);
	}
	
	public void Login_UserName()
	{
		Lgn_UserName.sendKeys(Acnt_name);
	}
	
	public void Login_password()
	{
		Lgn_password.sendKeys("joes1234");
	}
	
	public void submit_Btn()
	{
		sbmit_Btn.click();
	}
	
	public void Assert_Test()
	{
		
		
		//If check is true, test will pass.
	    System.out.println("AssertTrue Example");


	    //Condition, Message
	    Assert.assertTrue(Acnt_name.equals("krishna"), "AssertTrue test is failed!");

	    System.out.println("AssertTrue test is Passed!\n");

	}
	
	
}
