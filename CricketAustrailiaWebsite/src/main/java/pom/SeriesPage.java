package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeriesPage 
{
	   @FindBy (xpath = "//a[text()='Players']")
	   private WebElement players ;
	   
	   @FindBy (xpath = "//button[text()='No thanks']")
	   private WebElement noThanksTab ;
	
	   public SeriesPage(WebDriver driver123)
	   {
		   PageFactory.initElements(driver123, this);
	   }
	   
	   public void clickOnplayerstTab()
	   {
		   players.click();
	   }
	   
	   public void clickOnNoThankstTab()
	   {
		   noThanksTab.click();
	   }
}
