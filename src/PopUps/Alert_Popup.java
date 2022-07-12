package PopUps;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		
		driver.findElement(By.id("confirmButton")).click();
		
	// 1. To handle alert popup we need to switch selenium focus from main page to alert popup by using syntax..
		
		Alert alt = driver.switchTo().alert();
		
	// 2. Alert is an interface which contains abstract methods like:-
	//	     1. accept():- Use to click on ok Button..
	//  	 2. dismiss():- Use to click on cancel button..
	//       3. getText():- Use to get Text present in a alert popup.
		
		System.out.println(alt.getText());
		
		Thread.sleep(2000);
		alt.accept();
	  

	}

}
