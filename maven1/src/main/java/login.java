

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login 
{

	WebDriver driver;
	By email=By.id("email");
	By pwd=By.id("pass");
	By login=By.id("send2");
	
	public login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void typeemail(String username)
	{
		driver.findElement(email).sendKeys(username);
	}
	
	public void typepassword(String password)
	{
		driver.findElement(pwd).sendKeys(password);
	}
	
	public void clickonlogin()
	{
		driver.findElement(login).click();
	}
	
}
