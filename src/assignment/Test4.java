package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='LOGIN']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("phoneNo")).sendKeys("9874563212");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		
		String title= driver.getTitle();
		System.out.println(title);
		
		if(title.contentEquals("Disney+ Hotstar - Watch TV Shows, Movies, Specials, Live Cricket & Football"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		driver.close();
	}

}
