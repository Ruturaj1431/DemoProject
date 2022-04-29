package cricketaustrailia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project5 
{
 public static void main(String[] args) throws InterruptedException
  {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.cricket.com.au/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	if(url.equals("https://www.cricket.com.au/"))
	{
	   System.out.println("PASS");
	}
	else
	{
	   System.out.println("FAIL");	
	}
	
	String title = driver.getTitle();
	System.out.println(title);
	if(title.equals("Live Scores, Fixtures, News & Video | cricket.com.au"))
	{
	   System.out.println("PASS");
    }
	else
	{
	   System.out.println("FAIL");	
	}
	Thread.sleep(3000);
	
	WebElement series = driver.findElement(By.xpath("//a[text()='Series']"));
	series.click();
	Thread.sleep(2000);
	
	String url1 = driver.getCurrentUrl();
	System.out.println(url1);
	if(url1.equals("https://www.cricket.com.au/series"))
	{
	   System.out.println("PASS");
	}
	else
	{
	   System.out.println("FAIL");	
	}
	
	String title1 = driver.getTitle();
	System.out.println(title1);
	if(title1.equals("Series & Tournaments | cricket.com.au"))
	{
	   System.out.println("PASS");
    }
	else
	{
	   System.out.println("FAIL");	
	}
	Thread.sleep(3000);
	
	WebElement players = driver.findElement(By.xpath("//a[text()='Players']"));
	players.click();
	Thread.sleep(12000);
	
	WebElement nothanks = driver.findElement(By.xpath("//button[text()='No thanks']"));
	nothanks.click();
	
	String url2 = driver.getCurrentUrl();
	System.out.println(url2);
	if(url2.equals("https://www.cricket.com.au/players"))
	{
	   System.out.println("PASS");
	}
	else
	{
	   System.out.println("FAIL");	
	}
	
	String title2 = driver.getTitle();
	System.out.println(title2);
	if(title2.equals("Players | cricket.com.au"))
	{
	   System.out.println("PASS");
    }
	else
	{
	   System.out.println("FAIL");	
	}
	Thread.sleep(3000);
	
	WebElement textbox = driver.findElement(By.xpath("//input[@id='playerSearchByName']"));
	textbox.sendKeys("Virat Kohli");
	Thread.sleep(3000);
	
	WebElement searchbutton = driver.findElement(By.xpath("//i[@id='sub-search-icon']"));
	searchbutton.click();
	Thread.sleep(3000);
	
	
	String url3 = driver.getCurrentUrl();
	System.out.println(url3);
	if(url3.equals("https://www.cricket.com.au/players#"))
	{
	   System.out.println("PASS");
	}
	else
	{
	   System.out.println("FAIL");	
	}
	
	String title3 = driver.getTitle();
	System.out.println(title3);
	if(title3.equals("Players | cricket.com.au"))
	{
	   System.out.println("PASS");
    }
	else
	{
	   System.out.println("FAIL");	
	}
	Thread.sleep(3000);
	
	WebElement viratkohli = driver.findElement(By.xpath("//span[text()='Virat']"));
	viratkohli.click();
	Thread.sleep(3000);
	
	String url4 = driver.getCurrentUrl();
	System.out.println(url4);
	if(url4.equals("https://www.cricket.com.au/players/virat-kohli/uLebDysdakSh5JymAWzQRQ"))
	{
	   System.out.println("PASS");
	}
	else
	{
	   System.out.println("FAIL");	
	}
	
	String title4 = driver.getTitle();
	System.out.println(title4);
	if(title4.equals("Virat Kohli | Stats, Bio, Facts and Career Info"))
	{
	   System.out.println("PASS");
    }
	else
	{
	   System.out.println("FAIL");	
	}
	
	
  }
}
