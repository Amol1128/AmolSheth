 package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod_Use {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			// WebDriver Method Study..  
			//1. get--->To enter URL in browser or to open an application..
			
			driver.get("https://www.google.co.in/");
			
			//2. close--->To close the current tab of the browser opened by Selenium tool..
			
			//driver.close();
			
			//3. quit--->To close all the tabs present in browser opened by Selenium tool..
			
			//driver.quit();
			
			//4. maximize--->Used to maximize the browser..
			//   minimize--->Used to minimize the browser..
			
			driver.manage().window().maximize();
			
			driver.manage().window().minimize();
			
			//5. navigate--->This method is use to open an application, move forward, move backward & refresh the webpage..
			
//			driver.navigate().to("https://www.google.co.in");
//			
//			driver.navigate().back();
//			
//			driver.navigate().forward();
//			
//			driver.navigate().refresh();
			
			//6. getTitle--->This method is use to get title of a webpage.,return type of getTitle method is String..
			
			  System.out.println(driver.getTitle());
			
			String title = driver.getTitle();
			System.out.println(title);
			
			//7. getCurrentURL--->This method is use to get URL of a webpage., return type of getCurrentURL method is String..
			
			System.out.println(driver.getCurrentUrl());
			
			String url = driver.getCurrentUrl();
			System.out.println(url);

		

	


	}

}
