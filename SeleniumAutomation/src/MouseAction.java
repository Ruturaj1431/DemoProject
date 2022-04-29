import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction 

{
   public static void main(String[] args) throws InterruptedException 
   {
	 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.cricbuzz.com/");
	 driver.manage().window().maximize();
	 Thread.sleep(5000);
	 
	 //To Perform Mouse Action
	 
	 Actions mouse = new Actions(driver);
	 
	 WebElement teams = driver.findElement(By.xpath("//a[text()='Teams']"));
	 WebElement india = driver.findElement(By.xpath("//a[@title='India Cricket Team']"));
	 
	 mouse.moveToElement(teams).moveToElement(india).click().build().perform();

	 
	// WebElement asgharafgan = driver.findElement(By.xpath("//div[1]//div[5]//a[1]"));
	// WebElement searchbox =  driver.findElement(By.xpath("//input[@name='searchtag']"));
	 
	// mouse.dragAndDrop(asgharafgan, searchbox).build().perform();
	 

   }
}
