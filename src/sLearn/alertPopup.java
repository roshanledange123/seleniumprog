package sLearn;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alertPopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		ChromeOptions op= new ChromeOptions();
		
		op.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(op);
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
		
		Alert alt = driver.switchTo().alert();
		
        String textString=alt.getText();
		
		System.out.println(textString);
		
		alt.accept();
		
		driver.close();
		
		driver.quit();
	}

}
