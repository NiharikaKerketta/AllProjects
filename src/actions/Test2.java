package actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.name("url"));
		Select s = new Select(ele);
		s.selectByIndex(6);
		Thread.sleep(3000);
		s.selectByValue("search-alias=digital-text");
		Thread.sleep(3000);
		s.selectByVisibleText("Health & Household");
		Thread.sleep(3000);
		
		List<WebElement> alloptions = s.getOptions();
		System.out.println(alloptions.size());
		
		for(WebElement ob:alloptions)
			System.out.println(ob.getText());
		
		
		driver.close();
	}

}
