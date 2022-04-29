package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultInformation 
{
	@FindBy (xpath = "//span[text()='About Wikipedia']")
	private WebElement aboutWikipediaLink ;
	
	public SearchResultInformation(WebDriver driver123)
	{
	  PageFactory.initElements(driver123, this);
    }
	   
	public void clickOnAboutWikipediaLink()
	{
		aboutWikipediaLink.click();
	}
	
}
