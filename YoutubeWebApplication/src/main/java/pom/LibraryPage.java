package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryPage 
{
	@FindBy (xpath = "//yt-formatted-string[text()='Explore']")
	   private WebElement exploreTab ;
	   
	   public LibraryPage(WebDriver driver123)
	   {
		   PageFactory.initElements(driver123, this);
	   }
	   
	   public void clickOnExploreTab()
	   {
		   exploreTab.click();
	   }
}
