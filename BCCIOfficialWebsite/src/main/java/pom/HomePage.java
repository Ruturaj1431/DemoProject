package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy (xpath = "//button[text()='Accept cookies']")
	private WebElement acceptCookies ;
	
	@FindBy (xpath = "//a[text()='INTERNATIONAL']")
	private WebElement internationalTab ;
	
    public HomePage(WebDriver driver123)
	{
	  PageFactory.initElements(driver123, this);
    }
	   
	public void clickOnAcceptCookiesButton()
	{
	  acceptCookies.click();
	}
	
	public void clickOnInternationalTab()
	{
	  internationalTab.click();	
	}
	   
}
