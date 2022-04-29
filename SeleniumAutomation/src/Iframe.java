import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe 
{
   public static void main(String[] args) throws InterruptedException 
   {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	driver.switchTo().frame("frm1");// It Will Switch Focus of selenium To Iframe-1 From Main Page
	
	Actions mouse =  new Actions (driver);
	WebElement dropdown = driver.findElement(By.xpath("//select[@id='selectnav1']"));
	mouse.moveToElement(dropdown).click().build().perform();// To click dropdown button of Iframe-1
	Thread.sleep(5000);
	
	driver.switchTo().defaultContent();//It Will Switch focus Of Selenium from Iframe-1 To Main Page
	
	WebElement textbox = driver.findElement(By.xpath("//input[@class='frmTextBox']"));
	textbox.sendKeys("BACK TO MAIN PAGE");
	Thread.sleep(5000);
	
	driver.switchTo().frame("frm2");//It Will Switch Focus of selenium To Iframe-2 From Main Page
	
	WebElement firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
	WebElement lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
	firstname.sendKeys("Ruturaj");
	lastname.sendKeys("Patil");
	
   }
}
