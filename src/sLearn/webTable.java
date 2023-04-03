package sLearn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class webTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/indices/nse?src=moneyhome_nseIndices_more");
		
		driver.findElement(By.xpath("//a[@id=\"showMoreLess\"]")).click();
		
		List<WebElement> rowTable = driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tr"));
		
		for(int i=0;i<rowTable.size();i++)
		{
			String text = rowTable.get(i).getText();
			System.out.println(text);
		}
		driver.close();
		driver.quit();
	}

}
