package cricbuzz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project1 
{
    public static void main(String[] args) throws InterruptedException 
  {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.cricbuzz.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	if (url.equals("https://www.cricbuzz.com/"))
	{
		System.out.println("PASS");
	}
	else 
	{
		System.out.println("FAIL");
	}
	
	String title = driver.getTitle();
	System.out.println(title);
	
	if(title.equals("T20 World Cup Cricket Score, Schedule, Latest News, Stats & Videos | Cricbuzz.com"))
	{
		System.out.println("PASS");
	}
	else 
	{
		System.out.println("FAIL");
	}
	Thread.sleep(2000);
	
		
	WebElement mobilesite = driver.findElement(By.xpath("//span[text()='m.cricbuzz.com']"));
	mobilesite.click();
	
	Thread.sleep(2000);
	
	String url1 = driver.getCurrentUrl();
	System.out.println(url1);
	
	if (url1.equals("https://m.cricbuzz.com/"))
	{
		System.out.println("PASS");
	}
	else 
	{
		System.out.println("FAIL");
	}
	
	String title1 = driver.getTitle();
	System.out.println(title1);
	
	if(title1.equals("T20 WC Cricket Score, Schedule, Latest News, Stats &amp; Videos - Cricbuzz"))
	{
		System.out.println("PASS");
	}
	else 
	{
		System.out.println("FAIL");
	}
	Thread.sleep(3000);
	
	WebElement players = driver.findElement(By.xpath("//a[@title='Player Profile Search']"));
	players.click();
	Thread.sleep(2000);
	
	String url2 = driver.getCurrentUrl();
	System.out.println(url2);
	
	if (url2.equals("https://m.cricbuzz.com/profiles"))
	{
		System.out.println("PASS");
	}
	else 
	{
		System.out.println("FAIL");
	}
	
	String title2 = driver.getTitle();
	System.out.println(title2);
	
	if(title2.equals("Cricket Players and player search | Cricbuzz.com"))
	{
		System.out.println("PASS");
	}
	else 
	{
		System.out.println("FAIL");
	}
	Thread.sleep(2000);
	
	WebElement searchbox = driver.findElement(By.xpath("//input[@name='searchtag']"));
	searchbox.sendKeys("Virat Kohli");
	
	Thread.sleep(3000);
	
	WebElement playersearch = driver.findElement(By.xpath("//input[@value='Player Search']"));
	playersearch.click();
	
	Thread.sleep(3000);
	
	String url3 = driver.getCurrentUrl();
	System.out.println(url3);
	
	if (url3.equals("https://m.cricbuzz.com/cricket-stats/player/1413/virat-kohli"))
	{
		System.out.println("PASS");
	}
	else 
	{
		System.out.println("FAIL");
	}
	
	String title3 = driver.getTitle();
	System.out.println(title3);
	
	if(title3.equals("Virat Kohli Profile - ICC Ranking, Age, Career Info & Stats - Cricbuzz"))
	{
		System.out.println("PASS");
	}
	else 
	{
		System.out.println("FAIL");
	}
	Thread.sleep(2000);
	
	WebElement myaccount = driver.findElement(By.xpath("//a[text()='My Account']"));
	myaccount.click();	
	
	Thread.sleep(2000);
	
	String url4 = driver.getCurrentUrl();
	System.out.println(url4);
	
	if (url4.equals("https://m.cricbuzz.com/premium-subscription/user/login"))
	{
		System.out.println("PASS");
	}
	else 
	{
		System.out.println("FAIL");
	}
	
	String title4 = driver.getTitle();
	System.out.println(title4);
	
	if(title4.equals("Cricket Score, Schedule, Latest News, Stats & Videos | Cricbuzz.com - Cricbuzz"))
	{
		System.out.println("PASS");
	}
	else 
	{
		System.out.println("FAIL");
	}
	Thread.sleep(3000);
	
	WebElement enteremailid = driver.findElement(By.xpath("//input[@class='cb-email-input']"));
	enteremailid.sendKeys("ruturajpatilvk18@gmail.com");
	}
}
