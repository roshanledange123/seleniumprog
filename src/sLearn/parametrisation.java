package sLearn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class parametrisation {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		Thread.sleep(2000);
		
		WebElement firstnElement=driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		WebElement lastnElement=driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
		WebElement mobNoElement=driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
		WebElement passwordElement=driver.findElement(By.xpath("//input[@autocomplete=\"new-password\"]"));
		WebElement dayElement=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		WebElement mothElement=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		WebElement yearElement=driver.findElement(By.xpath("//select[@id=\"year\"]"));
		WebElement sexElement=driver.findElement(By.xpath("//input[@value=\"2\"]"));
		
		FileInputStream file=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\seleniumLearn\\Excelsheet\\Book1.xlsx");
        Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");

        String value = excel.getRow(0).getCell(0).getStringCellValue();
        String value1 = excel.getRow(0).getCell(1).getStringCellValue();
        String value2 = excel.getRow(0).getCell(2).getStringCellValue();
        String value3 = excel.getRow(0).getCell(3).getStringCellValue();
        String value4 = excel.getRow(0).getCell(4).getStringCellValue();
        String value5 = excel.getRow(0).getCell(5).getStringCellValue();
        String value6 = excel.getRow(0).getCell(6).getStringCellValue();
        
        
        firstnElement.sendKeys(value);
        Thread.sleep(1000);
        
        lastnElement.sendKeys(value1);
        Thread.sleep(1000);
        
        mobNoElement.sendKeys(value2);
        Thread.sleep(1000);
        
        passwordElement.sendKeys(value3);
        Thread.sleep(1000);
        
        Select a=new Select(dayElement);
        a.selectByVisibleText(value4);
        Thread.sleep(1000);
        
        Select b=new Select(mothElement);
        b.selectByVisibleText(value5);
        Thread.sleep(1000);
        
        Select c=new Select(yearElement);
        c.selectByVisibleText(value6);
        Thread.sleep(1000);
        
        sexElement.click();
        
        driver.close();
        driver.quit();
        
	}

}
