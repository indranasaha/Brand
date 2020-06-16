package rsaha.learn.SelTestin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class SamTest {
	

	WebDriver driver;
	
	public void TestMthd() {
		
		System.out.println("New Project");
		
		
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rana\\Desktop\\Softwares\\chromedriver_win32\\chromedriver.exe");
		String path = System.getProperty("user.dir");
//		System.out.println(path);
		System.out.println("Welcome Rana");
		System.setProperty("webdriver.gecko.driver",path+"\\resources\\geckodriver.exe");
//		System.setProperty("webdriver.chrome.driver",path+"\\resources\\chromedriver.exe");
        
        // Instantiate a ChromeDriver class.     
//   driver=new ChromeDriver();  
	 driver = new FirefoxDriver();
     
      // Launch Website  
   driver.navigate().to("https://outlook.live.com/owa/");  
     
//    //Maximize the browser  
//     driver.manage().window().maximize();  
//     
//     //Scroll down the webpage by 5000 pixels  
//   JavascriptExecutor js = (JavascriptExecutor)driver;  
//   js.executeScript("scrollBy(0, 5000)");   
//     
//    // Click on the Search button  
//   driver.findElement(By.linkText("Core Java")).click();
   
   try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	
	e.printStackTrace();
}
   
   driver.quit();
   
	}



}
