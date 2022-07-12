package KitePOMNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	//1. Data Members (Variable)
	
	@FindBy (xpath = "//span[@class='user-id']") private WebElement userName;
	@FindBy (xpath = "//a[@target='_self']") private WebElement logOutButton;

	//2. Constructor
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//3. Method
	
	public void validateUserName(String expectedUserID)
	{
		String expectedUserName=expectedUserID;
		String actualUserName = userName.getText();
		
		if(expectedUserName.equals(actualUserName))
		{
			System.out.println("Actual and Expected User Id are matching, TC passed");
		}
		else
		{
			System.out.println("Actual and Expected User Id are not Matching, TC failed");
		}
	}
	
	//To get actual username
	
	public String getActualUserName()
	{
		String actualUserName = userName.getText();
		return actualUserName;
		
	}
	
	public void logOut() throws InterruptedException  
	{
		userName.click();
		Thread.sleep(2000);
		logOutButton.click();
	}
	
	
}
