package wikipedia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project2 
{
   public static void main(String[] args) throws InterruptedException 
   {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://en.wikipedia.org/wiki/Main_Page");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
    String url = driver.getCurrentUrl();
    System.out.println(url);
	
    if(url.equals("https://en.wikipedia.org/wiki/Main_Page"))
    {
    	System.out.println("PASS");
    }
    else
    {
    	System.out.println("FAIL");
    }
    
    String title = driver.getTitle();
    System.out.println(title);
    
    if(title.equals("Wikipedia, the free encyclopedia"))
    {
    	System.out.println("PASS");
    }
    else
    {
    	System.out.println("FAIL");
    }
   
   Thread.sleep(3000);
   
   WebElement searchbox = driver.findElement(By.xpath(" //input[@class='vector-search-box-input']"));
   searchbox.sendKeys("Virat Kohli");
   
   Thread.sleep(2000);
   
   WebElement searchbutton = driver.findElement(By.xpath("//input[@id='searchButton']"));
   searchbutton.click();
   
   Thread.sleep(2000);
   
   String url1 = driver.getCurrentUrl();
   System.out.println(url1);
   
   if(url1.equals("https://en.wikipedia.org/wiki/Virat_Kohli"))
   {
   	System.out.println("PASS");
   }
   else
   {
   	System.out.println("FAIL");
   }
   
   String title1 = driver.getTitle();
   System.out.println(title1);
   
   if(title1.equals("Virat Kohli - Wikipedia"))
   {
   	System.out.println("PASS");
   }
   else
   {
   	System.out.println("FAIL");
   }
   Thread.sleep(3000);
   
   WebElement aboutwikipedia = driver.findElement(By.xpath("//span[text()='About Wikipedia']"));
   aboutwikipedia.click();
   
   Thread.sleep(3000);
   
   String url2 = driver.getCurrentUrl();
   System.out.println(url2);
   
   if(url2.equals("https://en.wikipedia.org/wiki/Wikipedia:About"))
   {
   	System.out.println("PASS");
   }
   else
   {
   	System.out.println("FAIL");
   }
   
   String title2 = driver.getTitle();
   System.out.println(title2);
   
   if(title2.equals("Wikipedia:About - Wikipedia"))
   {
   	System.out.println("PASS");
   }
   else
   {
   	System.out.println("FAIL");
   }
   Thread.sleep(3000);
   
   WebElement viewhistory = driver.findElement(By.xpath("//span[text()='View history']"));
   viewhistory.click();
		   
   Thread.sleep(2000);
   
   String url3 = driver.getCurrentUrl();
   System.out.println(url3);
   
   if(url3.equals("https://en.wikipedia.org/w/index.php?title=Wikipedia:About&action=history"))
   {
   	System.out.println("PASS");
   }
   else
   {
   	System.out.println("FAIL");
   }
   
   String title3 = driver.getTitle();
   System.out.println(title3);
   
   if(title3.equals("Wikipedia:About: Revision history - Wikipedia"))
   {
   	System.out.println("PASS");
   }
   else
   {
   	System.out.println("FAIL");
   }
   Thread.sleep(3000);
   
   WebElement createnewaccount = driver.findElement(By.xpath("//span[text()='Create account']"));
   createnewaccount.click();
   
   Thread.sleep(2000);
   
   String url4 = driver.getCurrentUrl();
   System.out.println(url4);
   
   if(url4.equals("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3AAbout&returntoquery=action%3Dhistory"))
   {
   	System.out.println("PASS");
   }
   else
   {
   	System.out.println("FAIL");
   }
   
   String title4 = driver.getTitle();
   System.out.println(title4);
   
   if(title4.equals("Create account - Wikipedia"))
   {
   	System.out.println("PASS");
   }
   else
   {
   	System.out.println("FAIL");
   }
   Thread.sleep(3000);
   
   WebElement username = driver.findElement(By.xpath("//input[@placeholder='Enter your username']"));
   username.sendKeys("ruturaj1431");
   
   Thread.sleep(2000);
   
   WebElement password = driver.findElement(By.xpath("//input[@id='wpPassword2']"));
   password.sendKeys("ruturaj@1431");
   
   Thread.sleep(2000);
   
   WebElement confirmpassword = driver.findElement(By.xpath("//input[@id='wpRetype']"));
   confirmpassword.sendKeys("ruturaj@1431");
   
   Thread.sleep(2000);
   
   WebElement emailid = driver.findElement(By.xpath("//input[@autocomplete='email']"));
   emailid.sendKeys("ruturaj1431@gmail.com");
   
   
   }	

}
