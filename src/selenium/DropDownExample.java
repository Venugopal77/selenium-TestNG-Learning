package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.util.concurrent.Uninterruptibles;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "G:\\selenium\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.navigate().to("http://testleaf.herokuapp.com/pages/Dropdown.html");
		
		WebElement dropDown1= driver.findElement(By.id("dropdown1"));
		Select select =new Select(dropDown1);
		select.selectByIndex(1);
		Thread.sleep(3000);
		select.selectByValue("3");
				
		Thread.sleep(3000);
		
		WebElement dropDown2 = driver.findElement(By.name("dropdown2"));
		Select select2 =new Select(dropDown2);
		select2.selectByVisibleText("Selenium");
		
		List<WebElement> listofOptions= select.getOptions();
		int size= listofOptions.size();
		System.out.println(size);
		
		dropDown1.sendKeys("Loadrunner");
		
	}

}
