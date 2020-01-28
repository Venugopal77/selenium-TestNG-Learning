package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.navigate().to("http://leafground.com/pages/download.html");
		
		WebElement downloadLink=driver.findElement(By.linkText("Download Excel"));
		downloadLink.click();
		
		
		Thread.sleep(5000);
		
				
		File fileLocation=new File("C:\\Users\\DE admin\\Downloads");
		File[] allFiles=fileLocation.listFiles();
		
		for (File file : allFiles) {
		if(	file.getName().equals("testleaf.xlsx")) {
			System.out.println("File downloaded");
			break;
		}
		}
	
	}

}
