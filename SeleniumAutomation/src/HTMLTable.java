import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLTable
{
 public static void main(String[] args) throws InterruptedException 
 {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://m.cricbuzz.com/cricket-stats/iccrankings/men/batting");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	//List<WebElement> Cells = driver.findElements(By.xpath("(//table[@class='table table-condensed '])[2]//td"));
	List<WebElement> Cells = driver.findElements(By.xpath("(//table[@class='table table-condensed '])[3]//tr[5]//td[3]"));
	
	System.out.println(Cells.get(0).getText());
	
	
	/*int w = Cells.size(); // It Will give the no. of WebElements Stored In "List"
	System.out.println(w);
	
	for(int i=0;i < w; i++)
	{
    String value = Cells.get(i).getText();// To get the text Written In Each Cell-
    System.out.println(value);*/
	}
  }

