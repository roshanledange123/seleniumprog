package sLearn;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class completePageScreenShot {
     static WebDriver driver;
	public static void captureCompletPage() throws Exception 
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Dest=new File("C:\\Users\\admin\\eclipse-workspace\\seleniumLearn\\ScreenShotPhoto\\photo2.jpeg");
		org.openqa.selenium.io.FileHandler.copy(source, Dest);
	}
	
	public static void logoCapture() throws Exception
	{
		WebElement amazonlogo=driver.findElement(By.xpath("//a[@id=\"nav-logo-sprites\"]"));
		File source=amazonlogo.getScreenshotAs(OutputType.FILE);
		File Dest=new File("C:\\Users\\admin\\eclipse-workspace\\seleniumLearn\\ScreenShotPhoto\\photo3.jpeg");
		org.openqa.selenium.io.FileHandler.copy(source, Dest);
	}
	
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		captureCompletPage();
		logoCapture();
		
		driver.close();
		driver.quit();
	}
}
