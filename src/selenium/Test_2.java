package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "G:\\selenium\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://testleaf.herokuapp.com/home.html");
		
		WebElement editPage=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
		editPage.click();
		
		WebElement getValue=driver.findElement(By.name("username"));
		String Value= getValue.getAttribute("value");
		System.out.println(Value);
		
		WebElement clickLogo= driver.findElement(By.xpath("//*[@id=\"text-2\"]/a/img"));
		clickLogo.click();
		
		WebElement buttonPage= driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img"));
		buttonPage.click();
		
		WebElement buttonPosition=driver.findElement(By.id("position"));
		int xValue= buttonPosition.getLocation().getX();
		int yValue= buttonPosition.getLocation().getY();
		System.out.println("Xvalue :"+xValue);
		System.out.println("Yvalue :"+yValue);
		
		WebElement buttonColor=driver.findElement(By.id("color"));
		String colorValue= buttonColor.getCssValue("background-color");
		System.out.println("Color of button is:"+colorValue);
		int height =buttonColor.getSize().getHeight();
		int width= buttonColor.getSize().getWidth();
		System.out.println("Button Height :" +height);
		System.out.println("Button Width: "+width);
		
		WebElement home=driver.findElement(By.xpath("//*[@id=\'home\']"));
		home.click();
		
		WebElement dropdownPage=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[5]/a/img"));
		dropdownPage.click();
		
		WebElement dropDown1=driver.findElement(By.id("dropdown1"));
		Select select=new Select(dropDown1);
		select.selectByIndex(1);
		Thread.sleep(3000);
		select.selectByValue("3");
		Thread.sleep(3000);
		select.selectByVisibleText("Loadrunner");
		
		WebElement dropDown3=driver.findElement(By.id("dropdown3"));
		dropDown3.sendKeys("Selenium");
		
		//WebElement dropSelect=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[6]/select/option[1]"));
		//Select multiBox= new Select(dropSelect);
		//multiBox.selectByIndex(1);
		//multiBox.selectByIndex(2);
		//multiBox.selectByIndex(3);
		
		WebElement nextHome=driver.findElement(By.xpath("//*[@id=\"text-2\"]/a/img"));
		nextHome.click();
		
		WebElement alertPage= driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[9]/a/img"));
		alertPage.click();
		
		WebElement alertOk= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		alertOk.click();
		Thread.sleep(3000);
		Alert alert= driver.switchTo().alert();
		alert.accept();
		
		WebElement alertCancel= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		alertCancel.click();
		Thread.sleep(3000);
		Alert cancelAlert=driver.switchTo().alert();
		cancelAlert.dismiss();
		
		WebElement promptBox= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		promptBox.click();
		Alert promptAlert= driver.switchTo().alert();
		promptAlert.sendKeys("Holla");
		Thread.sleep(3000);
		promptAlert.accept();
		
		
		
		WebElement nextToHome=driver.findElement(By.xpath("/html/body/div/div/div[1]/div/section/section/div/ul/li/a/img"));
		nextToHome.click();
		
		
		
	}

}
