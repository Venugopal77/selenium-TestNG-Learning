package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "G:\\selenium\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.navigate().to("http://testleaf.herokuapp.com/pages/checkbox.html");
		
		WebElement tickC=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[4]"));
		tickC.click();
		
		WebElement check1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/input"));
		boolean status=check1.isSelected();
		System.out.println("is selected:" +status);
		
		WebElement status1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[1]"));
		
		if(status1.isSelected())
		{
			status1.click();
		}
		
		WebElement status2=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/input[2]"));
		
		if(status2.isSelected())
		{
			status2.click();
		}
		
		WebElement checkB1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[1]"));
		checkB1.click();
	
	}
	
	}
	
	
