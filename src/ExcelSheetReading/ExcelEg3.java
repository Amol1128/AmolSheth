package ExcelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile = new File("D:\\My Excel File\\MyExel.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		int totalNumberOfRows = mySheet.getLastRowNum();  //Will give me total rows count
		int rowCount=totalNumberOfRows;
		System.out.println("total number of rows are "+rowCount);
		
		short totalNumberOfCells = mySheet.getRow(totalNumberOfRows).getLastCellNum();
		int cellCount = totalNumberOfCells-1;
		System.out.println("Total number of cells are "+ cellCount);
		
		for(int i=0;i<=rowCount;i++)   //Outer for loop for rows
		{
			for(int j=0;j<=cellCount;j++)  //Inner for loop for cell
			{
				Cell cellValue = mySheet.getRow(i).getCell(j);
				CellType datatype = cellValue.getCellType();
				
				if(datatype==CellType.STRING)
				{
					String value = cellValue.getStringCellValue();
					System.out.print(value+"  ");
				}
				else if(datatype==CellType.NUMERIC)
				{
					double value = cellValue.getNumericCellValue();
					System.out.print(value+"  ");
				}
				
				else if(datatype==CellType.BOOLEAN)
				{
					boolean value = cellValue.getBooleanCellValue();
					System.out.print(value+"  ");
				}
				else if(datatype==CellType.BLANK)
				{
					System.out.print("  ");
				}
				
		}
			System.out.println();
		}		
	}

}
