package ExcelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//Create excel sheet and pass the path along with name and extension in file object..
	
		File myfile = new File("C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\poi-bin-5.2.2\\MyExcel1.xlsx");
		
		Workbook book = WorkbookFactory.create(myfile);
		Sheet mySheet = book.getSheet("Sheet1");
		Row myRow = mySheet.getRow(0);
		Cell myCell = myRow.getCell(1);
		System.out.println(myCell.getCellType());
		System.out.println("==================================");
		
		//Code for reading whole data from excel sheet
		//Sheet mySheet = book.getSheet("Sheet1");
		
		for(int i=0;i<=1;i++)   //Outer for loop--->Rows
		{
			for(int j=0;j<=2;j++)   //Inner for loop--->Cells
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+"  ");
			}
			System.out.println();
		}
		System.out.println("==================================");
	
	}

}
