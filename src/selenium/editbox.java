package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class editbox {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "G:\\selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Link.html");
		
		WebElement link=driver.findElement(By.linkText("Go to Home Page"));
		link.click();
		
		//Thread.sleep("3000");
		
		WebElement xpath=driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[1]/a/img"));
		xpath.click();
		
		WebElement editEmail=driver.findElement(By.id("email"));
		editEmail.sendKeys("venucse2013@gmail.com");
		
		WebElement append=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		append.sendKeys("the word");
		
		WebElement getValue=driver.findElement(By.name("username"));
		String values= getValue.getAttribute("value");
		System.out.println(values);
		
		WebElement clearText= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/input"));
		clearText.clear();
		
		WebElement Enable= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/div/div/input"));
		boolean checkEnabl=Enable.isEnabled();
		System.out.println(checkEnabl);
		
		
	}

}
