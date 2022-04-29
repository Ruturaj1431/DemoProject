package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaHistoryPage 
{
	@FindBy (xpath = "//span[text()='Create account']")
	private WebElement createNewAccountTab ;
	
	public WikipediaHistoryPage(WebDriver driver123)
	{
	  PageFactory.initElements(driver123, this);
    }
	   
	public void clickOnCreateNewAccountTab()
	{
		createNewAccountTab.click();
	}
}
