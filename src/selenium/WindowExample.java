package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "G:\\selenium\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://leafground.com/pages/Window.html");
		
		String oldWindow=driver.getWindowHandle();
		
		WebElement butt1=driver.findElement(By.id("home"));
		butt1.click();
		
		Set<String> winHandles=driver.getWindowHandles();
		for (String newWindow : winHandles) {
			driver.switchTo().window(newWindow);
		}
		
		WebElement editPage=driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[2]/div/ul/li[1]/a"));
		editPage.click();
		driver.close();
		driver.switchTo().window(oldWindow);
		
	
		WebElement butt2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		butt2.click();
		
		int totalWind =driver.getWindowHandles().size();
		System.out.println(totalWind);
		driver.switchTo().window(oldWindow);
		
		WebElement butt3=driver.findElement(By.id("color"));
		butt3.click();
		
		Set<String> multiWinHan=driver.getWindowHandles();
		
		for (String newWindos : multiWinHan) {
			if (!newWindos.equals(oldWindow)) {
				driver.switchTo().window(newWindos);
				driver.close();
			}
		}
		
	
	}

}
