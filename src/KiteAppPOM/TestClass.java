  package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(2000);
		
		KiteLoginPage login = new KiteLoginPage(driver);
		login.sendUserName();
		login.sendPassword();
		login.clickOnLoginButton();
		
		Thread.sleep(2000);
		KitePinPage pin = new KitePinPage(driver);
		pin.sendPin();
		pin.clickOnContinueButton();
		
		Thread.sleep(2000);
		KiteHomePage home = new KiteHomePage(driver);
		home.validateUserName();
		home.logOut();
		
		driver.close();

	}

}
