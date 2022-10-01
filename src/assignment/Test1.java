package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("dshjsdgjsgj");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("hjhfhz");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		//Thread.sleep(3000);
		
		String title=driver.getTitle();
		System.out.println(title);
		 
		if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
		{
			System.out.println("pass-home page is displayed");
		}
		else
		{
			System.out.println("fail-home page is not displayed");
		}
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		driver.close();

	}

}
