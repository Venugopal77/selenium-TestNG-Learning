package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "G:\\selenium\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://leafground.com/pages/selectable.html");
		
		List<WebElement> selectable=driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		int selectableSize=selectable.size();
		System.out.println(selectableSize);
		
		Actions actions=new Actions(driver);
		//actions.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(2)).build().perform();
		
		actions.clickAndHold(selectable.get(0));
		actions.clickAndHold(selectable.get(1));
		actions.clickAndHold(selectable.get(3));
		actions.build().perform();
	}

}
