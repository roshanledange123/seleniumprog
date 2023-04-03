package sLearn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class getAllOption {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		ChromeOptions op=new ChromeOptions();
		
		op.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(op);
		
		driver.manage().window().maximize();
		
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement Text=driver.findElement(By.xpath("//td[text()=\"@rediffmail.com\"]"));
		
		String expText="@rediffmail.com";
		
		String acttext=Text.getText();
		
		System.out.println(acttext);
		
		if(expText.equals(acttext))
		{
			System.out.println("Test case pass");
	
		}
		else
		{
			System.out.println("Test case fail");
		}
		
		WebElement day=driver.findElement(By.xpath("//select[contains(@name,\"DOB_Day\")]"));
		Select s=new Select(day);
		s.selectByVisibleText("05");
		
		List<WebElement> allDays = s.getOptions();
		for(int i=0;i<allDays.size();i++)
		{
			System.out.println(allDays.get(i).getText());
		}
		
		WebElement checkBox=driver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
		checkBox.click();
		System.out.println("Checkbox is selected="+checkBox.isSelected());
		
		WebElement city=driver.findElement(By.xpath("//select[contains(@name,\"city\")]"));
		Select a=new Select(city);
		a.selectByVisibleText("Aizwal");
		
		List<WebElement> allCity = a.getOptions();
		for(int i=0;i<allCity.size();i++)
		{
			System.out.println(allCity.get(i).getText());
		}
		
		WebElement text1=driver.findElement(By.xpath("(//td[@class=\"grey1 f10\"])[2]"));
		System.out.println(text1.getText());
		
		String exptext1="If you forget your password,";
					
		String acttext1=text1.getText();
		
		if(exptext1.equals(acttext1))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
		
			
		driver.close();
		
		driver.quit();
			
			
			
		
		

	}

}
