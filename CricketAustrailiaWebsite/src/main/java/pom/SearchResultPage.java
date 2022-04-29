package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage 
{
	   @FindBy (xpath = "//span[text()='Virat']")
	   private WebElement searchResult ;
	   
	  
	
	   public SearchResultPage(WebDriver driver123)
	   {
		   PageFactory.initElements(driver123, this);
	   }
	   
	   public void clickOnSearchResult()
	   {
		   searchResult.click();
	   }
}	   
	   
