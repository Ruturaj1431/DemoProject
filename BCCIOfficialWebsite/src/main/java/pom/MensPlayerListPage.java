package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MensPlayerListPage 
{
	@FindBy (xpath = "//h3[text()='Virat ']")
	private WebElement viratKohli ;
	
	@FindBy (xpath = "//a[@id='women-tab']")
	private WebElement womenTab ;
	
    public MensPlayerListPage(WebDriver driver123)
	{
	  PageFactory.initElements(driver123, this);
    }
	   
	public void clickOnPlayersName()
	{
		viratKohli.click();
	}
	
	public void clickOnWomenTab()
	{
		womenTab.click();
	}
}
