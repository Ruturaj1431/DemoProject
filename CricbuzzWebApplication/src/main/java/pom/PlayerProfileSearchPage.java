package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlayerProfileSearchPage 
{

	   @FindBy (xpath = "//input[@name='searchtag']")
	   private WebElement playerSearchBox ;
	   
	   @FindBy (xpath = "//input[@value='Player Search']")
	   private WebElement playerSearchButton ;
	   
	  
	   public PlayerProfileSearchPage(WebDriver driver123)
	   {
		   PageFactory.initElements(driver123, this);
	   }
	   
	   public void sendPlayerName(String playerName)
	   {
		   playerSearchBox.sendKeys(playerName);
	   }
	   
	   public void clickOnPlayerSearchButton()
	   {
		   playerSearchButton.click();
	   }
}
