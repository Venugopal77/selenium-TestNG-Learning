package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "G:\\selenium\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://leafground.com/pages/drop.html");
		
		WebElement from= driver.findElement(By.id("draggable"));
		WebElement to=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		
		//action.clickAndHold(from).moveToElement(to).release(to).build().perform();
		
		action.dragAndDrop(from, to).build().perform();
	}

}
