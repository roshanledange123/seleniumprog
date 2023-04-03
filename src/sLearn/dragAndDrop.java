package sLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		ChromeOptions op=new ChromeOptions();
		
		op.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(op);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement iFramElement=driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
		
		driver.switchTo().frame(iFramElement);
		
		WebElement taras1=driver.findElement(By.xpath("(//li[@class=\"ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle\"])[1]"));
		
		WebElement taras2=driver.findElement(By.xpath("(//li[@class=\"ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle\"])[4]"));
		
		WebElement taras3=driver.findElement(By.xpath("(//li[@class=\"ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle\"])[2]"));
		
		WebElement taras4=driver.findElement(By.xpath("(//li[@class=\"ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle\"])[3]"));
		
		WebElement tarash=driver.findElement(By.xpath("//div[@id=\"trash\"]"));
		
		Actions a=new Actions(driver);
		
		a.dragAndDrop(taras1, tarash).build().perform();
		
		Thread.sleep(2000);
		
		a.dragAndDrop(taras2, tarash).build().perform();
		
		Thread.sleep(2000);
		
		a.dragAndDrop(taras3, tarash).build().perform();
		
		Thread.sleep(2000);
		
		a.dragAndDrop(taras4, tarash).build().perform();
		
		Thread.sleep(2000);
		
		driver.close();
		
		driver.quit();
		
		

	}

}
