package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import base.Browser;
import pom.HomePage;
import pom.MobileSitePage;

public class VerifyPlayersTab extends Browser
{     
	
	  private WebDriver driver;
	  private HomePage homePage;
	  private MobileSitePage mobileSitePage;
	
	  
	  
	  @BeforeTest
	  @Parameters("browser")
	  public void launchTheBrowser(String browser)
	  {   		  
		  
	 	
           if(browser.equalsIgnoreCase("Chrome"))
          {
	          driver = launchChromeBrowser();
          }
	   	 
		  if(browser.equalsIgnoreCase("Opera"))
		  {
			  driver = launchOperaBrowser();
		  }
		  
		  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		 
		  driver.manage().window().maximize();
	  }
	  
	  @BeforeClass
	  public void createPOMObject()
	  {
		  homePage = new HomePage(driver); 
		  mobileSitePage = new MobileSitePage(driver);
		 
	  }
	  
	  @BeforeMethod
	  public void toGoOnMobileSite()
	  {   
		  driver.get("https://www.cricbuzz.com/");
		  homePage.clickOnMobileSite();
	  }
	  
	  @Test
	  public void toVerifyPlayersTab()
	  {
		  
		  mobileSitePage.clickOnPlayers();
		  
		  String url = driver.getCurrentUrl();
		  System.out.println(url);
		  
	      Assert.assertEquals(url, "https://m.cricbuzz.com/profiles");
	      
		  String title = driver.getTitle();
		  System.out.println(title);
		  
		  Assert.assertEquals(title, "Cricket Players and player search | Cricbuzz.com");
		  
	  }
	  
	 
	  @AfterMethod
	  public void goBackOnMobileSitePage()
	  {
		  driver.navigate().back();
	  }
	  
	  @AfterClass
	  public void clearPOMObject()
	  {
		  homePage = null;
		  mobileSitePage = null;
		 
	  }
	  
	  @AfterTest
	  public void closeTheBrowser()
	  {
		  driver.quit();
		  driver = null;
		  
		  System.gc();
	  }
}