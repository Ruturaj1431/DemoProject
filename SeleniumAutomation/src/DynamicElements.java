import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElements 
{
  public static void main(String[] args) throws InterruptedException 
  {
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	WebElement searchBox = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
	searchBox.sendKeys("realme mobile");
	Thread.sleep(3000);
	
	WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
	searchButton.click();
	Thread.sleep(5000);
	
	WebElement firstSearchResult = driver.findElement(By.xpath("(//a[@class='_1fQZEK']//div[2]//div[1])[6]"));
	System.out.println(firstSearchResult.getText());
  }
}
