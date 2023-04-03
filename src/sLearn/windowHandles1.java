package sLearn;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windowHandles1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		ChromeOptions op=new ChromeOptions();
		
		op.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(op);
		
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.findElement(By.xpath("(//input[@type=\"button\"])[3]")).click();
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());
		
		Iterator itr=windows.iterator();
		while(itr.hasNext())
		{
			String w1=(String) itr.next();
			System.out.println("Window1="+w1);
			
			String w2=(String) itr.next();
			System.out.println("Window2="+w2);
			
			
			driver.switchTo().window(w1);
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			driver.close();
			
			driver.switchTo().window(w2);
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			driver.close();
		}
//		
//		String win[]=new String[windows.size()];
//		for(int i=0;i<=windows.size();i++)
//		{
//			win[i]=(String) itr.next();
//			System.out.println(win[i]);
//		
//		
//		driver.switchTo().window(win[0]);
//		driver.manage().window().maximize();
//		System.out.println(driver.getTitle());
//		driver.close();
//		
//		driver.switchTo().window(win[1]);
//		driver.manage().window().maximize();
//		System.out.println(driver.getTitle());
//		driver.close();
//		
//		}
		driver.close();
		driver.quit();
		
	}

}
