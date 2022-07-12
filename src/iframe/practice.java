package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
	     Thread.sleep(2000);
	     
	     WebElement name = driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']"));
	     System.out.println(name.getText());
	     
	     driver.switchTo().frame("frame1");
	     driver.findElement(By.tagName("input")).sendKeys("India");
	     
	     driver.switchTo().parentFrame();
	     WebElement text = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
	     System.out.println(text.getText());
	    
	     Thread.sleep(2000);
	     driver.switchTo().frame("frame1");
	     driver.switchTo().frame("frame3");
	     driver.findElement(By.id("a")).click();
	     
	     driver.switchTo().defaultContent();
	     WebElement name1 = driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']"));
	     System.out.println(name1.getText());
	     
	     Thread.sleep(2000);
	     driver.switchTo().frame("frame2");
	     driver.findElement(By.xpath("//option[text()='Baby Cat']")).click();
	     
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//option[text()='Avatar']")).click();
	     
	     driver.switchTo().defaultContent();
	     WebElement text1 = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
	     System.out.println(text1.getText());
	  	

	}

}
