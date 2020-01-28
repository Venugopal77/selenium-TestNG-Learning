package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuite {

	WebDriver driver;
	long startingTime;
	//Open Chrome Browser
	// Go to google.com, bing.com, yahoo.com and close
	
	@BeforeSuite
	public void OpenBrowser() {
		
		startingTime=System.currentTimeMillis();
		
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	
	@Test
	public void OpenGoogle() {
		
		
		driver.get("http://google.com");
				
	}
	
	@Test
	public void OpenBing() {
		
		driver.get("http://bing.com");
		
	}
	
	@Test
	public void OpenYahoo() {
		
				
		driver.get("http://yahoo.com");
		
		
	}
	
	@AfterSuite
	public void CloseBrowser() {
		driver.quit();

		long endTime=System.currentTimeMillis();
		long totalTime= endTime-startingTime;
		
		System.out.println("Total time"+totalTime);
	}
	
}
