package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(2000);
		
		//find source and destination
		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement destination = driver.findElement(By.id("amt7"));
		
		// How to drag and drop using actions class
		//Create object of Actions class and pass driver object
		
		Actions act = new Actions(driver);
		
		//By using actions class methods perform desired actions 
		
		//act.moveToElement(source).clickAndHold().moveToElement(destination).release().build().perform();
		
		act.dragAndDrop(source, destination).perform();
		
		
		
		
		

	}

}
