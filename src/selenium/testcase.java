package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.internal.MouseAction;

public class testcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "G:\\selenium\\geckodriver.exe");
		
	WebDriver driver =new FirefoxDriver(); 
	
	driver.navigate().to("http://testleaf.herokuapp.com/pages/Link.html");
	
	//WebElement searchBox =driver.findElement(By.name("q"));
	//searchBox.sendKeys("Java tutorial"+Keys.ENTER);
	
	//driver.findElement(By.name("btnK")).click();
			//searchIcon.click();
	
	WebElement link =driver.findElement(By.linkText("Go to Home Page"));
	link.click();
	
	
	
	
	
		
		//driver.navigate().forward();
		//driver.navigate().refresh();
		//driver.navigate().back();
		//driver.quit();
	}

}
