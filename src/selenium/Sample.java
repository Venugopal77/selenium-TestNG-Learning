package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.navigate().to("http://testleaf.herokuapp.com/pages/table.html");
		
		WebElement checkTask=driver.findElement(By.xpath("//td[normalize-space()='20%']//following::td[1]"));
		checkTask.click();
		
	}

}
