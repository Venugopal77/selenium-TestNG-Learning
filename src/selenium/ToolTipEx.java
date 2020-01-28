package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolTipEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "G:\\selenium\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://leafground.com/pages/tooltip.html");
		
		WebElement tooltip=driver.findElement(By.id("age"));
		String tipText=tooltip.getAttribute("title");
		System.out.println(tipText);
		
	}

}
