import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImages 
{
	public static void main(String[] args) throws InterruptedException 
	 {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		List<WebElement> Images = driver.findElements(By.tagName("img"));
		int l = Images.size(); // It Will give the no. of Images Stored In "List"
		System.out.println(l);
		
		for(int i=0;i < l; i++)
		 {
	     String value = Images.get(i).getAttribute("src");// It Will get the Value Of "src" i.e. Actual Source Of Image
	     System.out.println(value);
	      
	     if (value==null)
	      {
	    	 System.out.println("The Image Is Broken");
	      } 
	      else
	      {
	    	 System.out.println("The Image Is Okay");
	      }
	    	 
        }
	 }
}
