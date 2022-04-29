
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Screenshot 
{   public static void main(String[] args) throws InterruptedException, IOException
	{ 
	   /*System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   driver.manage().window().maximize();
	   Thread.sleep(3000);*/
	   
	   //Screenshot by System Date & Time method
	   
	   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
	   LocalDateTime now = LocalDateTime.now();
	   String D = dtf.format(now);
	   System.out.println(D);
	   
	   //File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  // File destination = new File ("D:\\2.Velocity Ruturaj\\Selenium Screenshots\\By DATE\\SC " + D + ".jpg");
      // FileHandler.copy(source, destination);
       
       //Screenshot By for loop Method
	   
	   //File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   
    //  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  // for(int D=1;D<=5;D++) 
	  // {
	//	  File destination = new File ("D:\\2.Velocity Ruturaj\\Selenium Screenshots\\By FOR LOOP\\SC " + D + ".jpg");
	 //     FileHandler.copy(source, destination);
	  // }

	   
	 
	   
	   //Screenshot By Random Number Method
	   
	   //int random = ThreadLocalRandom.current().nextInt();
	   //System.out.println(random);
	   
	   //File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  // File destination = new File ("D:\\2.Velocity Ruturaj\\Selenium Screenshots\\By Random Number\\SC " + random + ".jpg");
      // FileHandler.copy(source, destination);
    } 
}
