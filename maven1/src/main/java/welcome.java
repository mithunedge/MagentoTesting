

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class welcome 
{
	
	WebDriver driver;
	By myacct=By.linkText("My Account");
	
	public welcome(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickonmyacct()
	{
		driver.findElement(myacct).click();
	}
	
}
