package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.navigate().to("http://leafground.com/pages/sortable.html");

		List<WebElement> sort=driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));

		WebElement fromElement=sort.get(6);
		WebElement toElement=sort.get(0);
		Actions action=new Actions(driver);
		action.clickAndHold(fromElement);
		action.moveToElement(toElement);
		action.release(toElement);
		action.build().perform();

	}

}
