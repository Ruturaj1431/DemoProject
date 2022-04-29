package bcci;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project3 
{
  public static void main(String[] args) throws InterruptedException
  {
	System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.bcci.tv/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	if(url.equals("https://www.bcci.tv/"))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
	Thread.sleep(2000);
	
	String title = driver.getTitle();
	System.out.println(title);
	
	if(title.equals("The Board of Control for Cricket in India"))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
	Thread.sleep(2000);
	
	WebElement cookies = driver.findElement(By.xpath("//button[text()='Accept cookies']"));
	cookies.click();
	
	WebElement international = driver.findElement(By.xpath("//a[text()='INTERNATIONAL']"));
	international.click();
	Thread.sleep(2000);
	
	String url1 = driver.getCurrentUrl();
	System.out.println(url1);
	
	if(url1.equals("https://www.bcci.tv/international/fixtures"))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
	Thread.sleep(2000);
	
	String title1 = driver.getTitle();
	System.out.println(title1);
	
	if(title1.equals("The Board of Control for Cricket in India"))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
	Thread.sleep(5000);
	
	WebElement players = driver.findElement(By.xpath("//a[text()='PLAYERS']"));
	players.click();
	
	String url2 = driver.getCurrentUrl();
	System.out.println(url2);
	
	if(url2.equals("https://www.bcci.tv/players/men"))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
	Thread.sleep(2000);
	
	String title2 = driver.getTitle();
	System.out.println(title2);
	
	if(title2.equals("The Board of Control for Cricket in India"))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
	Thread.sleep(2000);
	
	WebElement viratkohli = driver.findElement(By.xpath("//h3[text()='Virat ']"));
	viratkohli.click();
	Thread.sleep(2000);
	
	String url3 = driver.getCurrentUrl();
	System.out.println(url3);
	
	if(url3.equals("https://www.bcci.tv/players/164/virat-kohli"))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
	Thread.sleep(2000);
	
	String title3 = driver.getTitle();
	System.out.println(title3);
	
	if(title3.equals("The Board of Control for Cricket in India"))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
	Thread.sleep(2000);
	
    driver.navigate().back();
	Thread.sleep(3000);
	
	WebElement women = driver.findElement(By.xpath("//a[@id='women-tab']"));
	women.click();
	Thread.sleep(2000);
	
	String url4 = driver.getCurrentUrl();
	System.out.println(url4);
	if(url4.equals("https://www.bcci.tv/players/women"))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
	Thread.sleep(2000);
	
	String title4 = driver.getTitle();
	System.out.println(title4);
	
	if(title4.equals("The Board of Control for Cricket in India"))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
  }
}
