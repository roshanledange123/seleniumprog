package sLearn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Autosuggestion {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Seleni");
		Thread.sleep(5000);
		List<WebElement> Elements = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li"));
		Thread.sleep(3000);
		for(int i=0;i<Elements.size();i++)
		{
			System.out.println(	Elements.get(i).getText());
		}
		
		for(int i=0;i<Elements.size();i++)
		{
			String actSug = Elements.get(i).getText();
			String expSug = "selenium download";
			
			if(actSug.equals(expSug))
			{
				Elements.get(i).click();
				break;
			}
		}
		System.out.println("Title="+driver.getTitle());
		
		driver.close();
		driver.quit();
		

	}

}
