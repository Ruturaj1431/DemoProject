import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup 

{
  public static void main(String[] args) throws InterruptedException 
  {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/js/js_popup.asp");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	WebElement alertbox = driver.findElement(By.xpath("( //a[text()='Try it Yourself »'])[1]"));
	WebElement confirmbox = driver.findElement(By.xpath("( //a[text()='Try it Yourself »'])[2]"));
	WebElement promptbox = driver.findElement(By.xpath("( //a[text()='Try it Yourself »'])[3]"));
	WebElement linebreaks = driver.findElement(By.xpath("( //a[text()='Try it Yourself »'])[4]"));
    alertbox.click();
	confirmbox.click();
	promptbox.click();
	linebreaks.click();
	
	ArrayList<String> address = new ArrayList<String>(driver.getWindowHandles());
	
	driver.switchTo().window(address.get(1));// It will Switch to linebreaks tab
	String url1 = driver.getCurrentUrl();
	boolean result1 = url1.equals("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert2");
	System.out.println(result1);
	
	driver.switchTo().window(address.get(2));// It will Switch to promptbox tab
	String url2 = driver.getCurrentUrl();
	boolean result2 = url2.equals("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	System.out.println(result2);
	
	driver.switchTo().window(address.get(3));// It will Switch to confirm tab
	String url3 = driver.getCurrentUrl();
	boolean result3 = url3.equals("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	System.out.println(result3);
	
	driver.switchTo().window(address.get(4));// It will Switch to alertbox tab
	String url4 = driver.getCurrentUrl();
	boolean result4 = url4.equals("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	System.out.println(result4);
  }
}
