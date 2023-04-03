package sLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class actionTab {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
		WebElement firstnamElement=driver.findElement(By.xpath("//input[@id=\"userName\"]"));
	    firstnamElement.sendKeys("Roshan Ledange");
	    Thread.sleep(3000);
	    
	    Actions a =new Actions(driver);
	    
	    a.sendKeys(Keys.TAB).perform();
	    a.sendKeys("rledange123@gmail.com");
	    Thread.sleep(3000);
	    
	    a.sendKeys(Keys.TAB).perform();
	    a.sendKeys("Sadhankarwadi,wani");
	    
	    a.keyDown(Keys.CONTROL);
	    a.sendKeys("a");
	    a.sendKeys("c");
	    a.keyUp(Keys.CONTROL);
	    
	    a.sendKeys(Keys.TAB);
	    Thread.sleep(3000);
	    
	    a.keyDown(Keys.CONTROL);
	    a.sendKeys("v");
	    a.keyUp(Keys.CONTROL);
	    Thread.sleep(3000);
	    
	    a.sendKeys(Keys.TAB);
	    Thread.sleep(3000);
	    
	    a.sendKeys(Keys.ENTER);
	    
	    a.build().perform();
	    
	    Thread.sleep(3000);
	    
	    driver.close();
	    driver.quit();

	}

}
