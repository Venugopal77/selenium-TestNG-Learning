package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "G:\\selenium\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.navigate().to("http://leafground.com/pages/Alert.html");
		
		WebElement butt1=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		butt1.click();
		
		Alert alert1=driver.switchTo().alert();
		
		alert1.accept();
		
		WebElement butt2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		butt2.click();
		
		Alert lert2=driver.switchTo().alert();
		lert2.dismiss();
		
		WebElement butt3=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		butt3.click();
		
		Alert alert3=driver.switchTo().alert();
		alert3.sendKeys("Saranathan");
		Thread.sleep(3000);
		alert3.accept();
		
		
		
	}

}
