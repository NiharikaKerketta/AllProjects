package webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6
{

	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement emailadd = driver.findElement(By.id("email"));
		
		if(emailadd.isDisplayed())
		{
			System.out.println("pass: email id is displayed");
			emailadd.sendKeys("jhdfhj");
		}
		else
		{
			System.out.println("fail: email id is not displayed");
		}
		
		WebElement createnew = driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']"));
		
		if(createnew.isEnabled())
		{
			System.out.println("pass: ");
			createnew.click();
		}
		else
		{
			System.out.println("fail: ");
		}
		
		WebElement newacc = driver.findElement(By.xpath("//input[@class='_8esa']"));
		
		if(newacc.isSelected())
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail: ");
		}
	
		driver.close();
		
		}
	
	}


