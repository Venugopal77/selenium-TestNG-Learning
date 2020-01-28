package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkAdvancedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "G:\\selenium\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.navigate().to("http://leafground.com/pages/Link.html");
		
		WebElement homePage=driver.findElement(By.partialLinkText("Go to Home"));
		homePage.click();
		
		driver.navigate().back();
		
		WebElement whereToGo=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/a"));
		String hrnef=whereToGo.getAttribute("href");
		System.out.println(hrnef);
		
		WebElement linkBroken=driver.findElement(By.partialLinkText("am I"));
		linkBroken.click();
		
		String pageTitle=driver.getTitle();
		
		if (pageTitle.contains("404")) {
			System.out.println("The link is broken");
		}
		else {
			System.out.println("link not broken");
		}
		
		driver.navigate().back();
		
		WebElement homePage1=driver.findElement(By.partialLinkText("Go to Home"));
		homePage1.click();
		
		driver.navigate().back();
		
		List<WebElement> totalLinks=driver.findElements(By.tagName("a"));
	int count=totalLinks.size();
	System.out.println("total links=" +count);
	
	}

}
