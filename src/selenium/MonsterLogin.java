package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MonsterLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "G:\\selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://testleaf.herokuapp.com/home.html");
		
		driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a")).click();
		
		
	}

}
