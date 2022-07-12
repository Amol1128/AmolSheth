package screenshot;

public class Screenshot_Theory 
{ 
//	Screenshot
//
//	To take screenshot using selenium webdriver, we need to type cast driver object to Takes Screenshot interface.
//	--((TakesScreenshot) driver)
	
//	Then we need call function getscreenshotAs(); there we need to pass the argument 
//	--Outputtype.FILE
	
//	This method will return object of type
//	--FILE.
	
//	i.e. File scr= (TakesScreenshot) driver). getscreenshotAs (Output Type.FILE)
	
//	When this will execute, it will take screenshot, but it will be available inside temporary memory
//
//	- To store screenshot in local drive (desired location ), we need to call a method 
//	i-e. copy file () which is present inside FileHandler class.
//	---FileHandler.copy(src, newfile("destinati path"));

 

}
