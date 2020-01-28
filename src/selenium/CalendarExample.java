package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.navigate().to("http://leafground.com/pages/Calendar.html");
		
		
		
		WebElement editBox=driver.findElement(By.xpath("//*[@id=\'datepicker\']"));
		//editBox.sendKeys("12/24/1998"+Keys.ENTER);
	editBox.click();
	Thread.sleep(3000);
	//*[@id="ui-datepicker-div"]/div/a[2]/span
	
	//a[@title='Next']
	WebElement nextMonth=driver.findElement(By.xpath("//a[@title='Next']"));
	nextMonth.click();
	//a[contains(text(),20)]
	
	Thread.sleep(3000);
	
	WebElement date=driver.findElement(By.xpath("//a[contains(text(),15)]"));
	date.click();
	
	
	}

}
