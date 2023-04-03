package sLearn;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windowhandles {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		ChromeOptions e=new ChromeOptions();
		
		e.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(e);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.aspsnippets.com/demos/1102/");
		
		driver.findElement(By.xpath("(//input[@type=\"button\"])[1]")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		System.out.println(windows.size());
		
		Iterator itr=windows.iterator();
		
		while(itr.hasNext())
		{
			String w1 = (String) itr.next();
			System.out.println("W1="+w1);
			
			String w2 = (String) itr.next();
			System.out.println("W2="+w2);
			
			driver.switchTo().window(w1);
			System.out.println(driver.getTitle());
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();
			
			driver.switchTo().window(w2);
			System.out.println(driver.getTitle());
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();
		}
		
//		String win[]=new String[windows.size()];
//		for(int i=0;i<=windows.size();i++)
//		{
//			win[i]=(String) itr.next();
//			System.out.println(win[i]);
//		
//	  
//		driver.switchTo().window(win[0]);
//		System.out.println(driver.getTitle());
//		driver.manage().window().maximize();
//		driver.close();
//		
//		driver.switchTo().window(win[1]);
//		System.out.println(driver.getTitle());
//		driver.manage().window().maximize();
//		driver.close();
//		}
		driver.close();
		
		driver.quit();

	}

}
