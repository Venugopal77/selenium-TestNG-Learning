import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.navigate().to("https://mail.google.com/mail/");
		
		//identifierId
		
		WebElement uname=driver.findElement(By.id("identifierId"));
		uname.sendKeys("venucse2013"+Keys.ENTER);
		
		//*[@id="password"]/div[1]/div/div[1]/input
		
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys("Venushya1623"+Keys.ENTER);
		
		
		
		
	}

}
