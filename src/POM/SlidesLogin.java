package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SlidesLogin
{
	WebDriver driver=null;
	
	//Declaration
	@FindBy(linkText="Log in")
	private WebElement login;
	
	@FindBy(id="user_email")
	private WebElement un;
	
	@FindBy(id="user_password")
	private WebElement pwd;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	
	//Initialization
	public SlidesLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public void loginbutton()
	{
		login.click();
	}
	
	public void username(String name)
	{
		un.sendKeys(name);
	}
	
	public void password(String pass)
	{
		pwd.sendKeys(pass);
	}
	
	public void submitbutton()
	{
		submit.click();
	}
	
}