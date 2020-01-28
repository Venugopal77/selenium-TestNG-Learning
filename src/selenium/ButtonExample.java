package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "G:\\selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		
		WebElement buttonPosition= driver.findElement(By.id("position"));
		int xvalue= buttonPosition.getLocation().getX();
		int yvalue= buttonPosition.getLocation().getY();
		System.out.println("X value is :"+xvalue + "Y value is :" +yvalue);
		
		//Thread.sleep(3000);
		
		
		WebElement buttonColor = driver.findElement(By.id("color"));
		String color= buttonColor.getCssValue("background-color");
		System.out.println("Button Color is:"+ color);
		
		WebElement buttonSize= driver.findElement(By.id("size"));
		int height= buttonSize.getSize().getHeight();
		int width= buttonSize.getSize().getWidth();
		System.out.println("Height :"+ height + "Width :" +width);
		
		WebElement buttonClick= driver.findElement(By.id("home"));
		buttonClick.click();
	}

}
