package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PlaylistTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","G:\\selenium\\geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement fbFname=driver.findElement(By.xpath("//*[@id=\"u_0_m\"]"));
		fbFname.sendKeys("Venu");
		
		WebElement fbLname=driver.findElement(By.xpath("//*[@id='u_0_o']"));
		fbLname.sendKeys("Gopal");
		
		WebElement fbMail=driver.findElement(By.xpath("//*[@id=\"u_0_r\"]"));
		fbMail.sendKeys("9791472659");
		
		WebElement fbPass=driver.findElement(By.xpath("//*[@id=\"u_0_w\"]"));
		fbPass.sendKeys("Venu2657");
		
		WebElement day=driver.findElement(By.id("day"));
		Select drop1=new Select(day);
		drop1.selectByValue("23");
		
		WebElement mon=driver.findElement(By.id("month"));
		Select drop2=new Select(mon);
		drop2.selectByVisibleText("Aug");
		
		WebElement year=driver.findElement(By.id("year"));
		Select drop3=new Select(year);
		drop3.selectByValue("1992");
		
		WebElement gender=driver.findElement(By.xpath("//*[@id=\'u_0_7\']"));
		gender.click();
		
		//WebElement signUp=driver.findElement(By.name("websubmit"));
		//signUp.click();
		//Alert denyNotification=driver.switchTo().alert();
		//denyNotification.dismiss();
		
		//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		//driver.navigate().forward();
		
		
			
		
		
	}

}
