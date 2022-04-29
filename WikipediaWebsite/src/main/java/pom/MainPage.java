package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage 
{
	@FindBy (xpath = " //input[@class='vector-search-box-input']")
	private WebElement wikipediaSearchTextbox ;
	
	@FindBy (xpath = "//input[@id='searchButton']")
	private WebElement searchButton ;
	
    public MainPage(WebDriver driver123)
	{
	  PageFactory.initElements(driver123, this);
    }
	   
	public void enterTextInSearchBox()
	{
		wikipediaSearchTextbox.sendKeys("Virat Kohli");
	}
	
	public void clickOnSearchButton()
	{
		searchButton.click();	
	}
}
