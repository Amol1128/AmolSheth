package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Eg1 {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		
		//1. Identify list box to be handled & store it in reference Variable..
		
		WebElement listBox = driver.findElement(By.name("dropdown-class-example"));
		
		//2. Create an object of select class which will accept WebElement as argument..
		
		Select S = new Select(listBox); 
		
		//3. By using one of the select class method we can select values from list box like..
		
		S.selectByVisibleText("Option2");
		
		Thread.sleep(2000);
		S.selectByValue("option1");
		
		Thread.sleep(2000);
		S.selectByIndex(3);

	}

}
