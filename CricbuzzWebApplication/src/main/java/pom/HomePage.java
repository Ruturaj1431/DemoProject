package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

   @FindBy (xpath = "//span[text()='m.cricbuzz.com']")
   private WebElement mobileSite ;
   
   public HomePage(WebDriver driver123)
   {
	   PageFactory.initElements(driver123, this);
   }
   
   public void clickOnMobileSite()
   {
	   mobileSite.click();
   }
}
