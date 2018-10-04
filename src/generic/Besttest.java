package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Besttest implements Auto_constant
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openapp()
	{
		System.setProperty(key, value);
		driver=new ChromeDriver();
		String address = Excel.abc(excelpath,"Sheet1",1,0);
		driver.get(address);
	}
	
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}

}
