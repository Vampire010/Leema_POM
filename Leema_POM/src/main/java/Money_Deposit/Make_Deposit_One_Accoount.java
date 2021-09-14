package Money_Deposit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Create_new_deposit_account.Create_Deposit_Account;

public class Make_Deposit_One_Accoount 
{
	
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[1]/td[3]/img[3]")
	WebElement Clk_on_Accounts;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/table/tbody/tr/td[3]/table/tbody/tr[3]/td/span")
	WebElement Clk_Make_Deposit_Accounts;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table/tbody/tr[3]/td/input")
	WebElement Pst_Date;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table/tbody/tr[5]/td/input")
	WebElement Description_text;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table/tbody/tr[7]/td/input")
	WebElement entr_amount;
	
	@FindBy(id="a0")
	WebElement Select_account_holder;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table/tbody/tr[10]/td/table/tbody/tr/td[1]/span")
	WebElement sbmit_Btn;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/table/tbody/tr/td/table/tbody/tr[6]/td/div[2]/span[1]")
	WebElement Deposit_sbmit_Btn;
	
	
	
	public Make_Deposit_One_Accoount(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	public void Accounts()
	{
		Clk_on_Accounts.click();	
	}
	
	public void Make_Deposit()
	{
		Clk_Make_Deposit_Accounts.click();	
	}
	
	public void Date()
	{
		Pst_Date.clear();
		Pst_Date.sendKeys("9/14/2021");
	}
	
	public void Description()
	{
		Description_text.sendKeys("Course Fee");
	}
	
	public void Deposit_Amount()
	{
		entr_amount.sendKeys("15000");
	}
	
	public void Account_holder()
	{
		Select_account_holder.click();
	}
	public void Submit_button()
	{
		sbmit_Btn.click();
	}
	public void Deposit_Confirm()
	{
		Deposit_sbmit_Btn.click();
	}
}
