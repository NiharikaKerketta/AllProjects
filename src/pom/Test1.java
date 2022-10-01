package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		FlipkartLogin s = new FlipkartLogin(driver);
		//s.loginbtn();
		s.emailaddtb("dhjhhagdhg");
		s.passwordtb("hdhsgh");
		s.submitbt();

	}

}
