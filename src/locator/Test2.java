package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		
		driver.findElement(By.id("email")).sendKeys("jhdghjgddhj");
		driver.findElement(By.name("password")).sendKeys("dhjghdgg");
		driver.findElement(By.name("login")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
	}

}
