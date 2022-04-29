package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlayersListPage 
{
	   @FindBy (xpath = "//input[@id='playerSearchByName']")
	   private WebElement searchByNameTextbox ;
	   
	   @FindBy (xpath = "//i[@id='sub-search-icon']")
	   private WebElement searchIcon ;
	
	   public PlayersListPage(WebDriver driver123)
	   {
		   PageFactory.initElements(driver123, this);
	   }
	   
	   public void enterPlayerName()
	   {
		   searchByNameTextbox.sendKeys("Virat Kohli");
	   }
	   
	   public void clickOnNoSearchIcon()
	   {
		   searchIcon.click();
	   }
}
