package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InternationalFixturesPage 
{
	@FindBy (xpath = "//a[text()='PLAYERS']")
	private WebElement playersTab ;
	
    public InternationalFixturesPage(WebDriver driver123)
	{
	  PageFactory.initElements(driver123, this);
    }
	   
	public void clickOnPlayersTab()
	{
		playersTab.click();
	}

}
