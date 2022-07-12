package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void   main(String[] args) throws InterruptedException 
	{
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458755421&hvpos=&hvnetw=g&hvrand=1922374150044143855&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301173&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=CjwKCAjwp7eUBhBeEiwAZbHwkbWOwFCbnOSJpsjg4dKXvC_V3fUNJp7mKSyZ_S0QYy60TrsyNEFT-BoClxAQAvD_BwE");
             
			Thread.sleep(10000);
			WebElement text = driver.findElement(By.id("twotabsearchtextbox"));
			text.click();
			text.sendKeys("Mobile");
			
			Thread.sleep(10000);
			WebElement search = driver.findElement(By.id("nav-search-submit-button"));
			search.click();
			
			
	}

}
