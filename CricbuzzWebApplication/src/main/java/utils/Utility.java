package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility 
{   
	
    public static String getDataFromExcelSheet(String sheet, int r, int c) throws EncryptedDocumentException, IOException
    { 
	  String data;
  	  String path = "C:\\Users\\HP\\Desktop\\Players.xlsx";
	  FileInputStream file = new FileInputStream(path);
  	  Sheet s = WorkbookFactory.create(file).getSheet("Players");
  	  
  	  try
  	  {
   	     data = s.getRow(r).getCell(c).getStringCellValue();  
  	  }
  	  
  	  catch (IllegalStateException e)
  	  {
  		double d = s.getRow(r).getCell(c).getNumericCellValue();
  		int i = (int)d;
  	    data = String.valueOf(i);
  	    System.out.println(data);
  	  }
  	  
	  return data;
  	 }
    
    public static void captureScreenshot(WebDriver driver, int TestID) throws IOException
    {
 	   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
 	   LocalDateTime now = LocalDateTime.now();
 	   String D = dtf.format(now);
 	  
	   File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   File destination = new File ("D:\\2.Velocity Ruturaj\\Selenium Screenshots\\By DATE\\Test"+TestID+" " + D + ".jpg");
       FileHandler.copy(source, destination);
    }
}
//<class name="test.VerifyPlayersTab"/>
