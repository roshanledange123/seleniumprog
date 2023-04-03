package sLearn;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class popup {

	public static void main(String[] args) throws Exception {
	
       System.setProperty("webdriver.chrome.driver","chromedriver.exe");
       
        ChromeOptions options =new ChromeOptions();
        
        options.addArguments("--remote-allow-origins=*");
        
        WebDriver driver=new ChromeDriver(options);
        
        driver.manage().window().maximize();
        
        driver.get("https://demo.automationtesting.in/Alerts.html");;
        
        driver.findElement(By.xpath("(//a[@class=\"analystic\"])[3]")).click();
        
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
        
        Alert alt=driver.switchTo().alert();
        
        String textString=alt.getText();
        
        System.out.println(textString);
        
        Thread.sleep(1000);
        
        alt.sendKeys("I am roshan");
        
        Thread.sleep(3000);
        
        alt.accept();
        
        Thread.sleep(5000);
        
        driver.close();
        
        driver.quit();
        
        		
	}

}
