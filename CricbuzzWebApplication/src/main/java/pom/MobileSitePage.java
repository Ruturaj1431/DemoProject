package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileSitePage 
{

	   @FindBy (xpath = "//a[@title='Player Profile Search']")
	   private WebElement players ;
	   
	   public MobileSitePage(WebDriver driver123)
	   {
		   PageFactory.initElements(driver123, this);
	   }
	   
	   public void clickOnPlayers()
	   {
		   players.click();
	   }
}
