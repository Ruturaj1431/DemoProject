import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks 
{
	public static void main(String[] args) throws InterruptedException 
	 {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		int l = Links.size(); // It Will give the no. of Links Stored In "List"
		System.out.println(l);
		
		for(int i=0;i < l; i++)
		{
	     String value = Links.get(i).getAttribute("href");// It Will get the Value Of "href" i.e. Actual Link
	     System.out.println(value);
	     if (value==null)
	     {
	    	 System.out.println("The Link Is Broken");
	     }
	     else
	     {
	    	 System.out.println("The Link Is Okay");
	     }
	    	 
        }
}
}
