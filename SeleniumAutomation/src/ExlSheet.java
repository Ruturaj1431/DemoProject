

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExlSheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	  String path = "C:\\Users\\HP\\Desktop\\Players.xlsx";
	  
	  FileInputStream file = new FileInputStream(path);
	  
	  Sheet sheet = WorkbookFactory.create(file).getSheet("Players");
	  
	 // By Using For Loop
	   
	 int rows = sheet.getLastRowNum(); // It Gives The No. of Rows In Excel Sheet
     int columns = sheet.getRow(1).getLastCellNum();//It Gives The No. of Columns In Excel Sheet
     
     for(int r=0;r<=rows;r++) // OUTER FOR LOOP Controls Count of Row Numbers
     {  Row row = sheet.getRow(r); // It Select The Row From Sheet
     
    	 for(int c=0;c<columns;c++) // INNER FOR LOOP Controls Count of Column Numbers
    	 {
    	 Cell cell = row.getCell(c);  // It Fetches the Value From Cell
    		 System.out.print(cell.getStringCellValue()); //Printing statement
    		 System.out.print(" | ");// For Separation Purpose
    	 }
    	    
    	 System.out.println();//To change the line After Each Row
      }
     

	}
}
