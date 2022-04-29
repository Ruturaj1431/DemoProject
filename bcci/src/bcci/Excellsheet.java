package bcci;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excellsheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	  String path = "C:\\Users\\HP\\Desktop\\Players.xlsx";
	  
	  FileInputStream file = new FileInputStream(path);
	  Sheet s = WorkbookFactory.create(file).getSheet("Players");
	  
	  try
	  {
	 
	  String value1 = s.getRow(0).getCell(0).getStringCellValue();  // it will fetch cell 1-1
	  System.out.println(value1);
	  }
	  
	  catch(IllegalStateException e)
	  {
		  double value1 = s.getRow(0).getCell(0).getNumericCellValue();  // it will fetch cell 1-1
		  System.out.println(value1);
	  }
	  
	  
	 /* String value2 = s.getRow(0).getCell(1).getStringCellValue();  // it will fetch cell 1-2
	  String value3 = s.getRow(1).getCell(0).getStringCellValue();  // it will fetch cell 2-1
	  String value4 = s.getRow(1).getCell(1).getStringCellValue();  // it will fetch cell 2-2
	  String value5 = s.getRow(2).getCell(0).getStringCellValue();  // it will fetch cell 3-1
	  String value6 = s.getRow(2).getCell(1).getStringCellValue();  // it will fetch cell 3-1
	  String value7 = s.getRow(3).getCell(0).getStringCellValue();  // it will fetch cell 4-1
	  String value8 = s.getRow(3).getCell(1).getStringCellValue();  // it will fetch cell 4-2
	  String value9 = s.getRow(4).getCell(0).getStringCellValue();  // it will fetch cell 5-1
	  String value10 = s.getRow(4).getCell(1).getStringCellValue(); // it will fetch cell 5-2
	  String value11 = s.getRow(5).getCell(0).getStringCellValue(); // it will fetch cell 6-1
	  String value12 = s.getRow(5).getCell(1).getStringCellValue(); // it will fetch cell 6-2
	  
	  System.out.print(value1);
	  System.out.print(",");
	  System.out.println(value2);
	  
	  System.out.print(value3);
	  System.out.print(",");
	  System.out.println(value4); 
	  
	  System.out.print(value5);
	  System.out.print(",");
	  System.out.println(value6);
	  
	  System.out.print(value7);
	  System.out.print(",");
	  System.out.println(value8);
	  
	  System.out.print(value9);
	  System.out.print(",");
	  System.out.println(value10);
	  
	  System.out.print(value11);
	  System.out.print(",");
	  System.out.println(value12);*/
	
	  
	}
	
}
