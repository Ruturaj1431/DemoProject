package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutWikipediaPage 
{
	@FindBy (xpath = "//span[text()='View history']")
	private WebElement viewHistoryTab ;
	
	public AboutWikipediaPage(WebDriver driver123)
	{
	  PageFactory.initElements(driver123, this);
    }
	   
	public void clickOnViewHistoryTab()
	{
		viewHistoryTab.click();
	}
}
