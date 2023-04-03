package sLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class findingElm {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		
		op.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(op);
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("roshan.roshanl.ledange491@gmail.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("Roshan@91");
		
		Thread.sleep(1000);
		
	    WebElement create=driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]"));
		create.click();
		System.out.println("Create button is Enabled="+create.isEnabled());
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Roshan");
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Ledange");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("7387903640");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("Roshan@91");
		
		Thread.sleep(1000);
		
		WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select a=new Select(day);
		a.selectByVisibleText("3");
		System.out.println("Day is selected="+day.isSelected());
		
		Thread.sleep(1000);
		
		WebElement month= driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select b=new Select(month);
		b.selectByVisibleText("Dec");
		System.out.println("Month is selected="+month.isSelected());
		
		Thread.sleep(1000);
		
		WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select c=new Select(year);
		c.selectByVisibleText("1991");
		System.out.println("Year is selected="+year.isSelected());
		
		Thread.sleep(1000);
		
		WebElement sex=driver.findElement(By.xpath("//input[@value=\"2\"]"));
		sex.click();
		System.out.println("Male is selected="+sex.isSelected());
		
		
		Thread.sleep(3000);
		
		WebElement signup=driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));
		signup.click();
		System.out.println("Signup is Enabled="+signup.isEnabled());
		
		Thread.sleep(3000);
		
		
		driver.close();
		
		driver.quit();

	}

}
