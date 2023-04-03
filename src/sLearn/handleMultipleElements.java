package sLearn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handleMultipleElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		System.out.println("Title1="+driver.getTitle());
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("Total links="+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			String linktext = links.get(i).getText();
			System.out.println(linktext);
		}
		
		for(int i=0;i<links.size();i++)
		{
			String actlink = links.get(i).getText();
			String explink = "Gmail";
			
			if(actlink.equals(explink))
			{
				links.get(i).click();
				break;
			}
		}
		System.out.println("Title2="+driver.getTitle());
		
		driver.close();
		
		driver.quit();
		
	}

}
