package sLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class hiddenDivision {

	public static void main(String[] args) throws Exception {
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	  
	  ChromeOptions op= new ChromeOptions();
			  
	  op.addArguments("--remote-allow-origins=*");
	  
	  WebDriver driver=new ChromeDriver(op);
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.flipkart.com/");
	  
	  driver.findElement(By.xpath("//button[text()=\"✕\"]")).click();
	  
	  Thread.sleep(1000);
	  
	  driver.close();
	  
	  driver.quit();

	}

}
