package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccountPage 
{
	@FindBy (xpath = "//input[@placeholder='Enter your username']")
	private WebElement userName ;
	
	@FindBy (xpath = "//input[@id='wpPassword2']")
	private WebElement password ;
	
	@FindBy (xpath = "//input[@id='wpRetype']")
	private WebElement confirmPassword ;
	
	@FindBy (xpath = "//input[@autocomplete='email']")
	private WebElement enterEmailid ;
	
    public CreateNewAccountPage(WebDriver driver123)
	{
	  PageFactory.initElements(driver123, this);
    }
	   
	public void enaterUserName()
	{
		userName.sendKeys("ruturaj1431");
	}
	
	public void enterPassword()
	{
		password.sendKeys("ruturaj@1431");	
	}
	
	public void enterPasswordAgain()
	{
		confirmPassword.sendKeys("ruturaj@1431");	
	}
	
	public void enterEmailid()
	{
		enterEmailid.sendKeys("ruturaj1431@gmail.com");		
	}
}
