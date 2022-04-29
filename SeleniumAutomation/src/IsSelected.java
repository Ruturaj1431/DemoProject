

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected 
{
	public static void main(String[] args) throws InterruptedException 
	  
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://paytm.com/recharge");
		  driver.manage().window().maximize();
		  Thread.sleep(5000);
		 
		  WebElement checkbox = driver.findElement(By.xpath("//i[@class='_1nFl']"));
		  boolean result = checkbox.isSelected();// it will check whether the checkbox is selected or not
		  System.out.println(result);
		  if(result==true)
		  {
			System.out.println("Checkbox is selected");
		  }
		  else
		  { 
			System.out.println("Checkbox is not selected");
			 
		  }
		   System.out.println("-------------------------------------");
		  
		  checkbox.click();//it will select the textbox
		  Thread.sleep(12000);
		  
		  boolean result1 = checkbox.isSelected();//it will check the result after clicking the checkbox
		  System.out.println(result1);
		 // if(result1==true)
		//  {
		//	  System.out.println("Checkbox is selected");
		//  }
	  }
}
