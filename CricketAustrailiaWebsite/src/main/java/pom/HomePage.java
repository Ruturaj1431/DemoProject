package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	   @FindBy (xpath = "//a[text()='Series']")
	   private WebElement seriesTab ;
	   
	   public HomePage(WebDriver driver123)
	   {
		   PageFactory.initElements(driver123, this);
	   }
	   
	   public void clickOnSeriesTab()
	   {
		   seriesTab.click();
	   }
}
