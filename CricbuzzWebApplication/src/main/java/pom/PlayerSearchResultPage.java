package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlayerSearchResultPage 
{

	   @FindBy (xpath = "//a[text()='My Account']")
	   private WebElement myAccount ;
	   
	  public PlayerSearchResultPage(WebDriver driver123)
	   {
		   PageFactory.initElements(driver123, this);
	   }
	   
	   public void clickOnMyAccount()
	   {
		   myAccount.click();
	   }
	   
	  
}
