package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadExample {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.navigate().to("http://leafground.com/pages/upload.html");
		
		Actions action= new Actions(driver);
		WebElement uploadBut=driver.findElement(By.xpath("//*[@id=\'mydiv\']/input"));
		action.moveToElement(uploadBut).click().build().perform();
		
		
		String file= "C:\\Users\\DE admin\\Downloads\\design.png";
		StringSelection fileLocation=new StringSelection(file);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileLocation, null);
		
		Thread.sleep(3000);
		
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
