package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplorePage 
{
	   @FindBy (xpath = "(//a[@id='destination-content-root'])[2]")
	   private WebElement musicTab ;
	   
	   public ExplorePage(WebDriver driver123)
	   {
		   PageFactory.initElements(driver123, this);
	   }
	   
	   public void clickOnMusicTab()
	   {
		   musicTab.click();
	   }
}
