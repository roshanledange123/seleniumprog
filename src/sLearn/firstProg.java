package sLearn;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class firstProg {

	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		ChromeOptions op=new ChromeOptions();
		
		op.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(op);
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);  
		
		String expTitle="Facebook – log in or sign up";
		
		String actTitle=driver.getTitle();
		
		if(expTitle.equals(actTitle))
		{
			System.out.println("Testcase pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
		
		System.out.println(actTitle);
		
		driver.navigate().to("https://www.youtube.com/");
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		driver.quit();

	}

}
