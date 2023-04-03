package sLearn;

import java.awt.Desktop.Action;
import java.awt.RenderingHints.Key;
import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.netty.handler.codec.AsciiHeadersEncoder.NewlineType;

public class actionClass {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		
		WebElement mobElement=driver.findElement(By.xpath("//input[@id=\"user-number\"]"));
		
		mobElement.sendKeys("7387903640");
		
		WebElement emailidElement=driver.findElement(By.xpath("//input[@id=\"email_id\"]"));
		
		emailidElement.sendKeys("rledange456@gmail.com");
		
		WebElement contButtonElement=driver.findElement(By.xpath("//button[@id=\"irtct-acc-detail\"]"));
		
		contButtonElement.click();
		
		Thread.sleep(5000);
		
		WebElement usernamElement=driver.findElement(By.xpath("//input[@id=\"username-id\"]"));
		
		WebElement passwortElement=driver.findElement(By.xpath("//input[@id=\"usr_pwd\"]"));
		
		WebElement hintElement=driver.findElement(By.xpath("(//input[@class=\"prsnl-info-field\"])[3]"));
		
		WebElement fullnamElement=driver.findElement(By.xpath("//input[@id=\"f_name_field\"]"));
		
		WebElement ocupationElement=driver.findElement(By.xpath("(//button[@class=\"btn dropdown-toggle\"])[1]"));
		
		WebElement genderElement=driver.findElement(By.xpath("//p[text()=\"Male\"]"));
		
		WebElement maritalStatusElement=driver.findElement(By.xpath("//p[text()=\"Married\"]"));
		
		WebElement residancyElement=driver.findElement(By.xpath("(//button[@class=\"btn dropdown-toggle\"])[2]"));
		
		WebElement quetionElement=driver.findElement(By.xpath("(//button[@class=\"btn dropdown-toggle\"])[3]"));
		
		WebElement securityElement=driver.findElement(By.xpath("//input[@id=\"sec_ans_field\"]"));
		
		
		usernamElement.sendKeys("Roshanledange");
		
		Thread.sleep(2000);
		
		passwortElement.sendKeys("Roshan");
		
		Thread.sleep(2000);
		
		hintElement.sendKeys("my first school");
		
		Thread.sleep(2000);
		
		fullnamElement.sendKeys("Roshan ledange");
		
		Thread.sleep(2000);
		
	    Actions s=new Actions(driver);
	    
	    s.moveToElement(ocupationElement).click().build().perform();
	    
	    for(int i=0;i<=5;i++)
	    {
	    	s.sendKeys(Keys.DOWN).build().perform();
	    	Thread.sleep(1000);
	    }
	    
	    for(int i=0;i<=3;i++)
	    {
	    	s.sendKeys(Keys.UP).build().perform();
	    	Thread.sleep(1000);
	    }
	    
	    s.sendKeys(Keys.ENTER).build().perform();
	    
	    genderElement.click();
	    
	    Thread.sleep(2000);
	    
	    maritalStatusElement.click();
	    
	    Thread.sleep(2000);
	    
	    Actions b=new Actions(driver);
	    b.moveToElement(residancyElement).click().build().perform();
	    b.sendKeys(Keys.DOWN).build().perform();
	    b.sendKeys(Keys.ENTER).build().perform();
	    
	    Thread.sleep(2000);
	    
	    Actions c=new Actions(driver);
	    s.moveToElement(quetionElement).click().build().perform();
	    for(int i=0;i<=2;i++)
	    {
	    	s.sendKeys(Keys.DOWN).build().perform();
	    	Thread.sleep(2000);
	    }
	    s.sendKeys(Keys.ENTER).build().perform();
	    
	    Thread.sleep(2000);
	    
	    securityElement.sendKeys("Tomy");
	    
	    driver.close();
	    
	    driver.quit();
	    
	    	

	}

}
