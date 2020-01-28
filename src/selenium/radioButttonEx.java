package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radioButttonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "G:\\selenium\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/radio.html");
		
		WebElement unChecked=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[1]"));
		
		WebElement checked=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[2]"));
		
		boolean status1= unChecked.isSelected();
		boolean status2= checked.isSelected();
		
		System.out.println(status1);
		System.out.println(status2);
		
		WebElement selectRadio=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[3]"));
		selectRadio.click();
		
		WebElement selectYes= driver.findElement(By.xpath("//*[@id=\"yes\"]"));
		selectYes.click();
		
				
				
		
		
	}

}
