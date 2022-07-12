package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Ce%7Cfacebook%20login%7C&placement=&creative=589460569900&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D9301173%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwyryUBhBSEiwAGN5OCIQvaj1c_It7tXG-wgab4galHjlPpPpVIOqWIEHMFlhxK72dWqLBMhoCWPYQAvD_BwE");
		
		Thread.sleep(2000);
		
		File Screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File Destination = new File("D:\\Screenshot\\MyScreenshot1.png");
		
		FileHandler.copy(Screen, Destination);

	}

}
