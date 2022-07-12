package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame_eg {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\selenium-java-4.1.4\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://skpatro.github.io/demo/iframes/");
        
       Thread.sleep(2000);
        
       String text = driver.findElement(By.xpath("//a[text()='Pavilion']")).getText();
       System.out.println(text);
       
       driver.switchTo().frame("Framename1");  // Changing focus from main page to frame1..
    
       
       String text1 = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
       System.out.println(text1);
       
        //xpath by Linked text
       driver.switchTo().parentFrame();  //Switch focus from frame1 to main page..
       
       String text2 = driver.findElement(By.xpath("//a[text()='Blogger']")).getText();
       System.out.println(text2);
       
       driver.switchTo().frame("Frame2");  // Changing focus from main page to frame2..
       
       String text3 = driver.findElement(By.xpath("//a[text()='Category3']")).getText();
       System.out.println(text3);
       
       driver.switchTo().defaultContent();  //Switch focus from frame2 to main page..
       String text4 = driver.findElement(By.xpath("//a[text()='Pavilion']")).getText();
       System.out.println(text4);
       
       
        
		

	}

}
