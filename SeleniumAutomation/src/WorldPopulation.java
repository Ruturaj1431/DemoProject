import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorldPopulation 
{
  public static void main(String[] args) 
  {
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.worldometers.info/world-population/");
	
	//WebElement populationCount = driver.findElement(By.xpath("//div[@id='maincounter-wrap']//div"));
	while(true) 
	{
		
	List<WebElement> list = driver.findElements(By.xpath("//div[@class='maincounter-number']/span[@class='rts-counter']"));
	
	for(WebElement e: list)
	{
		System.out.println(e.getText());
	}
	}

  }
}
