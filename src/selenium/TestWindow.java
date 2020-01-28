package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.gecko.driver", "G:\\selenium\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://testleaf.herokuapp.com/pages/Window.html");
		
		String oldWindow=driver.getWindowHandle();
		WebElement button1=driver.findElement(By.id("home"));
		button1.click();
		
		Set<String> handles =driver.getWindowHandles();
		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
			}
	WebElement editPage=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a"));
	editPage.click();
	
	driver.close();
	driver.switchTo().window(oldWindow);
	
	WebElement multiWindow=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
	multiWindow.click();
	
	int noOfWindow=driver.getWindowHandles().size();
	System.out.println(noOfWindow);
	
	WebElement dontButton = driver.findElement(By.id("color"));
	dontButton.click();
	
	Set<String> newHandles=driver.getWindowHandles();
	for (String  dontCloseWin : newHandles) {
	if (!dontCloseWin.equals (oldWindow) ) {
		driver.switchTo().window(dontCloseWin);
		driver.close();
	}	
	}
	
	}

}


