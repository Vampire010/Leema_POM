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
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table[2]/tbody/tr/td[1]/span")
	WebElement sbmit_Btn;
	
	public Make_Deposit_One_Accoount(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	
	
}
