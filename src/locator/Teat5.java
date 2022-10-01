package locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teat5 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("bdsvsvcvc");
		//Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("hdhghgdh");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@class,'qF0y9 ')]")).click();
		//Thread.sleep(3000);
		
		String title =driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Instagram"))
		{
			System.out.println("Pass- Home page is displayed");
		}
		else
		{
			System.out.println("Fail- Home page is not displayed");
		}
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
		//Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		
	}

}
