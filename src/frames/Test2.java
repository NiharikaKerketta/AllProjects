package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@value='go']")).click();
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.findElement(By.id("gdpr-cookie-message")).click();
		
		driver.findElement(By.xpath("(//a[contains(text(),'2')])[2]")).click();
		driver.findElement(By.xpath("//a[contains(text(),' Core Java For Selenium Trainin')]")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//div[@class='play-icon']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='pause-icon']")).click();
		
		driver.switchTo().defaultContent();
	
		driver.findElement(By.xpath("//span[@class='entypo-twitter']")).click();
		Thread.sleep(5000);
		
		driver.close();
	}

}
