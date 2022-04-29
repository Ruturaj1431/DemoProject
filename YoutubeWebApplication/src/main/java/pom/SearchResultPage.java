package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage 
{
	   @FindBy (xpath = "//yt-formatted-string[text()='Library']")
	   private WebElement libraryTab ;
	   
	   public SearchResultPage(WebDriver driver123)
	   {
		   PageFactory.initElements(driver123, this);
	   }
	   
	   public void clickOnLibraryTab()
	   {
		   libraryTab.click();
	   }
	
}
