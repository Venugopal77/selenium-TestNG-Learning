package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_7Video {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "G:\\selenium\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	
	driver.navigate().to("http://testleaf.herokuapp.com/");
	
	WebElement hyperLink=driver.findElement(By.linkText("HyperLink"));
	hyperLink.click();
	
	WebElement homeLink= driver.findElement(By.partialLinkText("Go to"));
	homeLink.click();
	
	WebElement editPage = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[1]/a/img"));
	editPage.click();
	
	WebElement emailBox= driver.findElement(By.id("email"));
	emailBox.sendKeys("venucse2013@gmail.com");
	
	WebElement appendBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
	appendBox.sendKeys("word appended");
	
	WebElement getValue = driver.findElement(By.name("username"));
	String values= getValue.getAttribute("value");
	System.out.println(values);
	
	WebElement clearText= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
	clearText.clear();
	
	WebElement disCheck= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
	boolean disValue= disCheck.isEnabled();
	System.out.println(disValue);
	
	driver.navigate().to("http://testleaf.herokuapp.com/");
	
	WebElement buttonLink=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img"));
	buttonLink.click();
	
	WebElement buttonPosition=driver.findElement(By.id("position"));
	int xposition= buttonPosition.getLocation().getX();
	int yposition= buttonPosition.getLocation().getY();
	System.out.println("The value of X :" +xposition + "The Value of Y is :"+yposition);
	
	WebElement buttonColor=driver.findElement(By.id("color"));
	String color= buttonColor.getCssValue("background-color");
	System.out.println("The Button color is :"+color);
	
	WebElement buttonSize= driver.findElement(By.id("size"));
	int height= buttonSize.getSize().getHeight();
	int width =buttonSize.getSize().getWidth();
	System.out.println("The height of button :"+height);
	System.out.println("The Width of button is :"+width);
	
driver.navigate().to("http://testleaf.herokuapp.com/");
	
	WebElement dropDownLink=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[5]/a/img"));
	dropDownLink.click();
	
	WebElement dropDown1=driver.findElement(By.id("dropdown1"));
	Select select= new Select(dropDown1);
	select.selectByIndex(2);
	
	WebElement dropDown2= driver.findElement(By.name("dropdown2"));
	Select select2=new Select(dropDown2);
	select2.selectByVisibleText("Appium");
	select.selectByValue("1");
	
	List<WebElement> noOfOptions=select2.getOptions();
	int options= noOfOptions.size();
	System.out.println(options);
	
	WebElement dropDown3= driver.findElement(By.className("dropdown"));
	dropDown3.sendKeys("App");

	WebElement multiSelect=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
	Select multiOption = new Select(multiSelect);
	multiOption.selectByIndex(1);
	multiOption.selectByIndex(2);
	multiOption.selectByIndex(3);
	
	
	
	
	}
	

}
