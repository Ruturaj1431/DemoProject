package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage 
{
	   @FindBy (xpath = "//input[@id='search']")
	   private WebElement searchBox ;
	 
	   @FindBy (xpath = "(//yt-icon[@class='style-scope ytd-searchbox'])[2]")
	   private WebElement searchButton ;
	   
	   public MainPage(WebDriver driver123)
	   {
		   PageFactory.initElements(driver123, this);
	   }
	   
	   public void enterTextInSearchBox()
	   {
		   searchBox.sendKeys("Virat Kohli Hall Of Fame");
	   }
	   
	   public void clickOnSearchButton()
	   {
		   searchButton.click();
	   }
	   
	  
}
