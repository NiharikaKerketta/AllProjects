package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement ee = driver.findElement(By.id("cars"));
	
		Select s = new Select(ee);
		s.selectByIndex(2);
		s.selectByValue("99");
		//s.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");
		
		System.out.println(s.isMultiple());
		
		if(s.isMultiple())
		{
		s.deselectAll();
		}
		
		driver.close();
	}

}
