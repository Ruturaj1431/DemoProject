package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;




import base.Browser;
import pom.HomePage;
import pom.MobileSitePage;
import pom.PlayerProfileSearchPage;
import utils.Utility;

public class VerifyPlayersSearchButton extends Browser
{     
	  private WebDriver driver;
	  private HomePage homePage;
	  private MobileSitePage mobileSitePage;
	  private PlayerProfileSearchPage playerProfileSearchPage;
	  private int TestID;
	
	 
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
		  playerProfileSearchPage = new PlayerProfileSearchPage(driver);
	  }

	 @BeforeMethod
	  public void toGoOnMobileSite()
	  {  
		 driver.get("https://www.cricbuzz.com/");
		 homePage.clickOnMobileSite();
	  }
	  
	  @Test
	  public void toVerifyPlayerSearchButton() throws EncryptedDocumentException, IOException, InterruptedException 
	  {   TestID=101;
	  
		  SoftAssert softAssert = new SoftAssert();
	  
		 
		  mobileSitePage.clickOnPlayers();
		  
		  String playerName = Utility.getDataFromExcelSheet("Players", 1 , 0);
		  
		  playerProfileSearchPage.sendPlayerName(playerName);
		  
	
		  playerProfileSearchPage.clickOnPlayerSearchButton();
		  
		  Thread.sleep(3000);
		  
		  String url = driver.getCurrentUrl();
		  System.out.println(url);
		  
		  softAssert.assertEquals(url, "https://m.cricbuzz.com/cricket-stats/player/1413/virat-kohli");
	      
		  String title = driver.getTitle();
		  System.out.println(title);
		  
		  softAssert.assertEquals(title, "Virat Kohli Profile - ICC Ranking, Age, Career Info & Stats - Cricbuzz");
		  
		  softAssert.assertAll();
	  }
	  
	  
	  @AfterMethod
	  public void goBackOnMobileSitePage(ITestResult result) throws IOException
	  {   
		  if(ITestResult.FAILURE==result.getStatus())
		  {
			  Utility.captureScreenshot(driver, TestID);
		  }
		 
	  }
	  
	  @AfterClass
	  public void clearPOMObject()
	  {
		  homePage = null;
		  mobileSitePage = null;
		  playerProfileSearchPage = null;
		  
	  }
	  @AfterTest
	  public void closeTheBrowser()
	  {
		  driver.quit();
		  driver = null;
		  
		  System.gc();
	  }
}