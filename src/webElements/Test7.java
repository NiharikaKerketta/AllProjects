package webElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		search.sendKeys("dres");
		
		List<WebElement> search1 = driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
		System.out.println(search1.size());
	
		for(WebElement b:search1)
		{
			System.out.println(b.getText());
		
		}
			
		driver.close();
	}

}
