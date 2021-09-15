package SignUP_Login_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	@FindBy(xpath="/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/span/input")
	WebElement Bnk_Id;
	
	@FindBy(xpath="/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[4]/span/input")
	WebElement Usr_Name;
	
	@FindBy(xpath="/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[6]/span/input")
	WebElement Usr_Pssword;
	
	@FindBy(xpath="//*[@id=\"clicked_when_enter_id\"]")
	WebElement Login_Btn;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table[1]/tbody/tr/td[3]/table/tbody/tr/td[2]")
	WebElement Logout_Btn;
	
	
	public Login_Page(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	public void Bank_Id()
	{
		try
		{
			if(Logout_Btn.isDisplayed())
			{
				System.out.println("You have Suceesfully loged in");
				Logout_Btn.click();
			}
		}
		catch(Exception E)
		{
			
				System.out.println("You have not loged-in");
				Bnk_Id.sendKeys("70320");
			
		}
	}
	
	public void UserName()
	{
		Usr_Name.sendKeys("banker");
	}
	
	public void Password()
	{
		Usr_Pssword.sendKeys("ram12345");
	}
	
	public void Lign_Button()
	{
		Login_Btn.click();
	}
	
	public void LogOut_Button()
	{
		
		if(Logout_Btn.isDisplayed())
		{
			System.out.println("You have Suceesfully loged in");
			Logout_Btn.click();

		}
		else
		{
			System.out.println("You have not loged-in");

		}
		
	}
	
	
}
