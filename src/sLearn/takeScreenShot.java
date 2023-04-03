package sLearn;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class takeScreenShot {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		
		ChromeOptions op=new ChromeOptions();
		
		op.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(op);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\admin\\eclipse-workspace\\seleniumLearn\\ScreenShotPhoto\\photo1.jpeg");
		
		org.openqa.selenium.io.FileHandler.copy(source, dest);
		
		driver.close();
		
		driver.quit();
	
		

	}

}
