package sLearn;


import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;



public class multipleSelectable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
        ChromeOptions op=new ChromeOptions();
		
		op.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(op);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement carDropDown=driver.findElement(By.xpath("id=\"cars\""));
		
		Select s=new Select(carDropDown);
		System.out.println(s.isMultiple());
		
		s.selectByVisibleText("Volvo");
		s.selectByVisibleText("Saab");
		s.selectByVisibleText("Opel");
		s.selectByVisibleText("Audi");
		
		java.util.List<WebElement> listOption = s.getAllSelectedOptions();
		for(WebElement value:listOption)
	    System.out.println(value.getText());
		
		WebElement firstOption=s.getFirstSelectedOption();
		System.out.println(firstOption.getText());
		
		driver.close();
		driver.quit();
				
		
		
		

	}

}
