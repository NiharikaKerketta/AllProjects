package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("fdhhjgfja");
		driver.findElement(By.name("pass")).sendKeys("jhgfdd");
		driver.findElement(By.name("login")).click();
		
		driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		
		driver.findElement(By.partialLinkText("https://www.facebook.com")).click();
		driver.findElement(By.name("email")).sendKeys("1234567898");

	}

}
