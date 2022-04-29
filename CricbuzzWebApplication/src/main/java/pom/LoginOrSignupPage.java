package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignupPage 
{

	   @FindBy (xpath = "//input[@class='cb-email-input']")
	   private WebElement enterEmailid ;
	   
	   public LoginOrSignupPage(WebDriver driver123)
	   {
		   PageFactory.initElements(driver123, this);
	   }
	   
	   public void enterEmailid()
	   {
		   enterEmailid.sendKeys("ruturajpatilvk18@gmail.com");
	   }
	  
}
