package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("hgfdfdsfsd");
		driver.findElement(By.name("pass")).sendKeys("12345");
		//driver.findElement(By.name("login")).click();
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("dfjhjjak");
		driver.findElement(By.cssSelector("button[value='1']")).click();
		//driver.findElement(By.partialLinkText("login page")).click();
		
		
		
		

	}

}
