package ExcelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//Create excel sheet and pass the path along with name and extension in file object..
		
		File myfile = new File("C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\poi-bin-5.2.2\\myExel.xlsx");
		
		//Using WorkBookFactory class read excel sheet
		
		//how to read String Value
		
		String name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(name);
		
		//How to read numeric value
		
		double number = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
		
		System.out.println(number);  
		
		//How to read char value
		
		String mychar = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
		System.out.println(mychar);
		
		//How to read boolean value
		
		boolean myValue = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(0).getBooleanCellValue();
		System.out.println(myValue);

	}

}
