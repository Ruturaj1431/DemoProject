package youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Project4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if(url.equals("https://www.youtube.com/"))
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
		
		if(title.equals("YouTube"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		Thread.sleep(3000);
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='search']")) ;
		searchbox.click();
		searchbox.sendKeys("Virat Kohli Hall Of Fame");
		
		WebElement searchbutton = driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-searchbox'])[2]"));
	    searchbutton.click();
	    
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		
		if(url1.equals("https://www.youtube.com/results?search_query=Virat+Kohli+Hall+Of+Fame"))
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
		
		if(title1.equals("Virat Kohli Hall Of Fame - YouTube"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		Thread.sleep(5000);
		
		WebElement library = driver.findElement(By.xpath("//yt-formatted-string[text()='Library']"));
		library.click();
		
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		
		if(url2.equals("https://www.youtube.com/feed/library"))
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
		
		if(title2.equals("Library - YouTube"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		Thread.sleep(3000);
		
		WebElement explore = driver.findElement(By.xpath("//yt-formatted-string[text()='Explore']"));
	    explore.click();
	    
		String url3 = driver.getCurrentUrl();
		System.out.println(url3);
		
		if(url3.equals("https://www.youtube.com/feed/explore"))
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
		
		if(title3.equals("Explore - YouTube"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		Thread.sleep(3000);
		
		WebElement exploremusic = driver.findElement(By.xpath("(//a[@id='destination-content-root'])[2]"));
		exploremusic.click();
	    
		String url4 = driver.getCurrentUrl();
		System.out.println(url4);
		
		if(url4.equals("https://www.youtube.com/channel/UC-9-kyTW8ZkZNDHQJ6FgpwQ"))
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
		
		if(title4.equals("The Music Channel - YouTube"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		

		

		
		
	}
}
