package Browser_Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browser_Lanuch
{

	public static  WebDriver driver;
	

	public String browsers(String browser_Type , String Url)
	{
	
		if(browser_Type.equals("chrome"))
		{				
			System.setProperty("webdriver.chrome.driver", "/Users/girishg/eclipse-workspace/Leema_POM/Browser_Drivers/chromedriver");
			driver = new ChromeDriver();
			driver.get(Url);				
		}
		
		else if(browser_Type.equals("safari"))
		{				

			driver = new SafariDriver();		
			driver.get(Url);		
		}
		
		else if(browser_Type.equals("firefox"))
		{				
			System.setProperty("webdriver.gecko.driver", "/Users/girishg/eclipse-workspace/Leema_POM/Browser_Drivers/geckodriver");
			driver = new FirefoxDriver();
			driver.get(Url);			
		}
			
		else 
		{				
			System.out.println("Specified browser type is not found");			
		}		
		return Url;	
	}

	
}
