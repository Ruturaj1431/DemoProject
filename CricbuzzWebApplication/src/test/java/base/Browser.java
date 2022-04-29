package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Browser 
{  
   public static WebDriver launchChromeBrowser()
   {
	    System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
   }
   
   public static WebDriver launchOperaBrowser()
   {
	    System.setProperty("webdriver.opera.driver","D:\\operadriver.exe");
		WebDriver driver = new OperaDriver();
		return driver;
   }
}
