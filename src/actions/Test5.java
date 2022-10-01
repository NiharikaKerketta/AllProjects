package actions;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		WebElement ele = driver.findElement(By.id("month"));
		
		Select s = new Select(ele);
		
		List<WebElement> alloptions = s.getOptions();
		{
		for(WebElement ob: alloptions)
			System.out.println(ob.getText());
		}
		
		//for(WebElement ob:alloptions)
			//System.out.println(alloptions.sort(ob);
		
		
			
		
		
		
		driver.close();
			
		

	}

}
