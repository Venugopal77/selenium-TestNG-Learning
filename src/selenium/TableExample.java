package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "G:\\selenium\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.navigate().to("http://testleaf.herokuapp.com/pages/table.html");
		
		List<WebElement> listOfColumns=driver.findElements(By.tagName("th"));
		int totalColumns=listOfColumns.size();
		System.out.println(totalColumns);
		
		List<WebElement> listOfRows=driver.findElements(By.tagName("tr"));
		int totalRows=listOfRows.size();
		System.out.println(totalRows);
		
		WebElement getPercent=driver.findElement(By.xpath("//td[normalize-space()=\'Learn to interact with Elements\']//following::td[1]"));
		String value=getPercent.getText();
		System.out.println("The value of Learn to interact with elements =" + value);
		
		
		List<WebElement> allValues=driver.findElements(By.xpath("//td[2]"));
		
		List<Integer> listValues=new ArrayList<Integer>();
		
		for (WebElement webElement : allValues) {
			String individualValues=webElement.getText().replace("%", "");
			listValues.add(Integer.parseInt(individualValues));
			
		}
		
		System.out.println(listValues);
		
		int minimumValues=Collections.min(listValues);
		
		String finalValue=Integer.toString(minimumValues) +"%";
		
		System.out.println(finalValue);
		
		String finalXpath="//td[normalize-space()="+"\""+ finalValue +"\""+"]"+"//following::td[1]";
		System.out.println(finalXpath);
		
		WebElement checkTask=driver.findElement(By.xpath(finalXpath));
		checkTask.click();
		
				
				
	}

}
