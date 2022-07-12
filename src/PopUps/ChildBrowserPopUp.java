package PopUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(2000);
		
		String mainPageID = driver.getWindowHandle();  //Id of main page
		System.out.println(mainPageID);
		
		System.out.println("===============================");
		//To open child window
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		
		//To handle multiple windows/ To get multiple Ids..
		
		Set<String> AllPageIDS = driver.getWindowHandles();
		
		Iterator<String> it = AllPageIDS.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		String mainpageId = it.next();  //will return main page ID
		String childPageID = it.next();   //will return child page ID
		
		//To Switch focus to child window
		
		driver.switchTo().window(childPageID); //Changing focus from main page to child page
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Selenium");
//		driver.close(); // will close only current focused tab
//		driver.quit();  //will close all tabs/pages opened by selenium
		
		Thread.sleep(2000);
		driver.switchTo().window(mainpageId );
		
		WebElement myElement = driver.findElement(By.xpath("//p[text()='Click below to open link in new tab']"));
		
		System.out.println(myElement.getText());
		
		

	}

}
