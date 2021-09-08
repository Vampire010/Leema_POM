package SignUP_Login_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp_Page 
{

	@FindBy(xpath="/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[1]/td[2]/span/input")
	WebElement First_name;
	
	
	@FindBy(xpath="/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[2]/td[2]/span/input")
	WebElement Last_Name;
	
	@FindBy(xpath="/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[3]/td[2]/span/input")
	WebElement Yur_Email;
	
	@FindBy(xpath="/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[4]/td[2]/span/input")
	WebElement ReEnter_Email;
	
	@FindBy(xpath="/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[5]/td[2]/span/input")
	WebElement Password;
	
	
	@FindBy(xpath="/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[6]/td[2]/input")
	WebElement guardian;
	
	@FindBy(xpath="/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[2]/tbody/tr/td[1]/span")
	WebElement Signup_btn;
	

	@FindBy(xpath="/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/div/div/button[3]")
	WebElement Cntnue_btn;
	
	@FindBy(xpath="/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/span/div/button")
	WebElement Hme_btn;

	
	public SignUp_Page(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	public void Frst_name()
	{
		First_name.sendKeys("Girish");
	}
	
	public void Lst_name()
	{
		Last_Name.sendKeys("Ram");
	}
	
	public void Your_Email()
	{
		Yur_Email.sendKeys("girishrathode.rathode@gmail.com");
	}
	
	public void ReEnt_Your_Email()
	{
		ReEnter_Email.sendKeys("girishrathode.rathode@gmail.com");
	}
	
	public void User_Password()
	{
		Password.sendKeys("ram12345");
	}
	
	public void Parent_Gurd()
	{
		guardian.click();
	}
	public void Sign_Up_btn()
	{
		Signup_btn.click();
	}
	
	public void Continue_btn()
	{
		Cntnue_btn.click();
	}
	
	public void Home_btn()
	{
		Hme_btn.click();
	}
	
	
}
