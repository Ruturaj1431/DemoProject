
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IRCTCDropdown 

{ public static void main(String[] args) throws InterruptedException 
{
	

	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");
	
	Thread.sleep(5000);
	
	WebElement alert = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
	
	alert.click();
	
	WebElement dropDown = driver.findElement(By.xpath("//div[@class='ng-tns-c66-11 ui-dropdown ui-widget ui-state-default ui-corner-all']"));
	
	dropDown.click();
	
	WebElement firstClass = driver.findElement(By.xpath("//span[text()='First Class (FC)']"));
	
	Actions mouse = new Actions(driver);
	
	mouse.moveToElement(firstClass).click().build().perform();

   
}
}
