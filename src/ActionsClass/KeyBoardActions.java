package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		
		//find element
		
		WebElement textbox = driver.findElement(By.id("autocomplete"));
		
		//textbox.sendKeys("Good Morning");  //By using webElement method
		
		//How to send keys using Actions class
		
		//Create object of Actions class and pass driver object
		
		Actions act = new Actions(driver);
		
		//using sendkeys method of Actions class perform Sendkeys task
		
		act.sendKeys(textbox, "Good Evening").perform();   
		
		//How to handle drop down using Actions Class
		
		WebElement dropDown = driver.findElement(By.name("dropdown-class-example"));
		
		//Using Actions class method Handle drop down
		
		act.click(dropDown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		//act.click(dropDown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
		
		
		
		
		
		

	}

}
