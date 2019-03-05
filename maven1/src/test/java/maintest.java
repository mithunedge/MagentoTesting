

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class maintest 
{
	@Test
	public void test() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		welcome w=new welcome(driver);
		w.clickonmyacct();
		login l=new login(driver);
		l.typeemail("vineetanand61@gmail.com");
		l.typepassword("Welcome123");
		l.clickonlogin();
		home h=new home(driver);
		h.clickonlogout();
		//Thread.sleep(4000);
		driver.quit();
		
	}

}
