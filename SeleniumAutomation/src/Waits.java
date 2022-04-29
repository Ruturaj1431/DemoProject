import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
	  System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	  //1) Implicit Wait--> It gives Waiting Time only.
	  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);// Implicit Wait Of 10 Seconds applied
      
	  driver.get("https://www.instagram.com/");
	  driver.manage().window().maximize();
	  
	  WebElement user = driver.findElement(By.xpath("gughagkfahkj"));
	  user.click();
	 // Now Bcoz of Wrong Xpath It will throw No such Element Exception After 10 Sceonds 
	  
	//================================================================================================================ 
	   
	  //2)Explicit Wait--> It gives Waiting Time + Condition
	  
	  WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait of 20 Seconds is applied
	  WebElement user1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("bisehifw")));
	  user1.click();
	  // Now Bcoz of Wrong Xpath It will throw No such Element Exception After 20 Sceonds 
	  
	//================================================================================================================ 
	  
	  //3) Fluent Wait--> It gives Waiting Time + Condition + Frequency of Checking Condition
	  
	  Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver) 
			                 .withTimeout(Duration.ofSeconds(20)) //-->Maximum Waiting time = 20 sec
			                 .pollingEvery(Duration.ofSeconds(2)) // Frequency of Checking the Condition = 2 sec
			                 .ignoring(NoSuchElementException.class);//--> Checking Condition
	  
	  WebElement username = wait1.until(new Function<WebDriver,WebElement>()
			  {  public WebElement apply (WebDriver driver)
			     {
		           return driver.findElement(By.xpath("vsjhsdaasuio"));
			     }
			  });
	  username.sendKeys("Ruturaj");
	  // Now Bcoz of Wrong Xpath It will throw No such Element Exception After 20 Sceonds 
	  
	}
}
