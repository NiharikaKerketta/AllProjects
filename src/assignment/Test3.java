package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("mobile")).sendKeys("9874563212");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='a-ayg']")).click();
		Thread.sleep(3000);
		
		String title= driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Order food online from India's best food delivery service. Order from restaurants near you"))
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
