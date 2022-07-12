package webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg1 {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		
		//how to find no. of rows in table
		
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		
		int totalNumOfRows = rows.size();
		
		System.out.println("Total number of rows in table "+totalNumOfRows);

		//how to find no. of column in table
		
		List<WebElement> Columns = driver.findElements(By.xpath("//table//tr[1]//th"))	;	
		
		int totalNumOfColumns = Columns.size();
		
		System.out.println("Total number of Columns are "+totalNumOfColumns);
		
		//how to read header
		
		for(WebElement header:Columns)
		{
			System.out.print(header.getText()+" ");
		}
		
		//how to read all rows from table
		
		List<WebElement> allRowsData = driver.findElements(By.xpath("//table//tr"));
		
		Iterator<WebElement> it = allRowsData.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next().getText()+" ");
			System.out.println();
		}
		
		
		
		
	}

}
