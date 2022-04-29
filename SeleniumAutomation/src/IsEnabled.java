import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled 
{
  public static void main(String[] args) throws InterruptedException 
  
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.instagram.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  
	  WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	  boolean result = login.isEnabled(); //it will check whether the element is Enabled or Not
	  System.out.println(result);
	  if (result==true) 
	  {
		System.out.println("Login Elelment is Enabled");
	  }
	  else
	  {
		System.out.println("Login Element is Disabled");
	  }
	  
	  System.out.println("-----------------------------------------");//just for seperation of Results
		
		WebElement username = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		WebElement password = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		
	    username.sendKeys("Ruturaj");// it will enter username
	    password.sendKeys("Ruturajvk18");// it will wnter password
	  
	    boolean result1 = login.isEnabled();// it will again check login element 
	    System.out.println(result1);
	    if(result1==true)
	    {
	    	System.out.println("Login Elelment is Enabled");
	    }
	  
	  System.out.println("-----------------------------------------");
	  
	  
  }
}