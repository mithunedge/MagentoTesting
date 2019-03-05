

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class home 
{

	WebDriver driver;
	By logout=By.linkText("Log Out");
	
	public home(WebDriver driver)
	{
		this.driver=driver;
	}	
	
	public void clickonlogout()
	{
		driver.findElement(logout).click();
	}
	
}
