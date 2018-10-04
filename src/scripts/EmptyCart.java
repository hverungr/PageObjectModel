package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Auto_constant;
import generic.Excel;
import POM.Cartpopup;
import POM.Homepage;
import POM.LoginHome;
import POM.Logout;

public class EmptyCart implements Auto_constant
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty(key, value);
		
		
		String address = Excel.abc(excelpath,"Sheet1",1,0);
		String un = Excel.abc(excelpath,"Sheet1",1,1);
		String pwd = Excel.abc(excelpath,"Sheet1",1,2);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(address);
		
		LoginHome l=new LoginHome(driver);
		l.cancelpopup();
		l.login();
		Thread.sleep(3000);
		l.username(un);
		l.password(pwd);
		l.loginbutton();
		
		Thread.sleep(3000);
		
		Homepage h=new Homepage(driver);
		h.cartlogo();
		
		Thread.sleep(3000);
		Cartpopup c=new Cartpopup(driver);
		c.removeitem();
		c.closecartpopup();
		
		Logout lo=new Logout(driver);
		lo.profiledropdown();
		lo.logout();
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
