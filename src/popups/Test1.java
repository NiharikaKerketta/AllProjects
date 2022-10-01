package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//Alert popup
		driver.findElement(By.xpath("//button[@ondblclick='addtocart()']")).click();
		
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		//a.dismiss();
		driver.close();
	}

}
