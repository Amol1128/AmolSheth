package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_Use {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/");
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(3000);
		
		
		WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		System.out.println(getOTPButton.isEnabled());
		
		driver.findElement(By.id("mobileNumber")).sendKeys("8888888887");
		Thread.sleep(3000);
		System.out.println(getOTPButton.isEnabled());
		getOTPButton.click();	

	}

}
