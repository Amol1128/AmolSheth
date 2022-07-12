package SetSizeAndPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		System.out.println(driver.manage().window().getPosition());
		//To set position we need to create object of Point class and pass X and Y coordinate..
		
	    Point p = new Point(250, 150);
	    //Using Set position method we can set the browser position
		
	    driver.manage().window().setPosition(p);
		
	}

}
