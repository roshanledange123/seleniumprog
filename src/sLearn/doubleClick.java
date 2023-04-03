package sLearn;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement doubleclickElement=driver.findElement(By.xpath("//button[text()=\"Double-Click Me To See Alert\"]"));
		
		Actions a =new Actions(driver);
		
		a.doubleClick(doubleclickElement).build().perform();
		
		Alert alt =driver.switchTo().alert();
		
		String text =alt.getText();
		
		System.out.println(text);
		
		alt.accept();
		
		driver.close();
		
		driver.quit();
		

	}

}
