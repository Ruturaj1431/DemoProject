
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp
{
  public static void main(String[] args) throws InterruptedException 
  {
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement clickme = driver.findElement(By.xpath("(//button[text()='Click me'])[4]"));
	clickme.click();
	
	Alert alt = driver.switchTo().alert();
	
	//1) To get text Written On Alert Pop UP And Verify It
	String text = alt.getText();
	System.out.println(text);
	
	if (text.equals("Please enter your name"))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}

	
	//2) To Enter data Into Textbox Of Pop Up
	
	alt.sendKeys("Ruturaj Nanda Rajaram Patil");
	
	Thread.sleep(5000);
	
	//3) To click on Ok button
	
	alt.accept();
	
	//4) To Click on Cancel Button
	
	//alt.dismiss();
	
	
	
  }
}
