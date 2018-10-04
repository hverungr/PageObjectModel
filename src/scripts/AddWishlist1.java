package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Cartpopup;
import POM.Homepage;
import POM.LoginHome;
import POM.Logout;
import POM.SearchList2;
import POM.Searchlist1;
import generic.Auto_constant;
import generic.Excel;

public class AddWishlist1 implements Auto_constant
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty(key, value);
		
		
		String address = Excel.abc(excelpath,"Sheet1",1,0);
		String un = Excel.abc(excelpath,"Sheet1",1,1);
		String pwd = Excel.abc(excelpath,"Sheet1",1,2);
		String ele = Excel.abc(excelpath, "Sheet1", 1, 4);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(address);
		
		LoginHome l = new LoginHome(driver);
		l.cancelpopup();
		l.login();
		Thread.sleep(3000);
		l.username(un);
		l.password(pwd);
		l.loginbutton();
		
		Homepage h=new Homepage(driver);
		Thread.sleep(3000);
		h.search(ele);
		h.searchbutton();		
		Thread.sleep(3000);
		
		SearchList2 s = new SearchList2(driver);
		s.addwishlist();
		
		Logout lo=new Logout(driver);
		lo.profiledropdown();
		lo.logout();
	}

}

