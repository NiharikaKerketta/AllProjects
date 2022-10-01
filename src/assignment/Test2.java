package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("sdhjgdh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(3000);
		
		String title= driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Amazon Sign-In"))
		{
			System.out.println("pass-home page is displayed");
		}
		else
		{
			System.out.println("fail-home page is not displayed");
		}
		
		driver.close();
	}

}
