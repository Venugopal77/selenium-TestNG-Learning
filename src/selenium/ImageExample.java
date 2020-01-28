package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.navigate().to("http://leafground.com/pages/Image.html");
		
		//WebElement image=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		WebElement image=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		
		
		if (image.getAttribute("naturalHeight").equals("0")) {
			System.out.println("The image is broken");
			
		}
		else {
			System.out.println("The image is not broken");
		}
			
		image.click();
		}
	}


