package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Study {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		driver. manage().window().maximize();
		Thread.sleep(2000);
		WebElement bDate = driver.findElement(By.name("birthday_day"));
		Select S1 = new Select(bDate);
		S1.selectByVisibleText("13");
		
		Thread.sleep(2000);
        WebElement bMonth = driver.findElement(By.name("birthday_month"));
		Select S2 = new Select(bMonth);
		S2.selectByVisibleText("Dec");
		
		Thread.sleep(2000);
        WebElement bYear = driver.findElement(By.name("birthday_year"));
		Select S3 = new Select(bYear);
		S3.selectByValue("1996");
		


	}

}
