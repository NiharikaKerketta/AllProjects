package navigateAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(" https://skillrary.com/ ");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		//back
		driver.navigate().back();
		Thread.sleep(3000);
		//forward
		driver.navigate().forward();
		Thread.sleep(3000);
		//refresh
		driver.navigate().refresh();
		Thread.sleep(3000);
		//close
		driver.close();
	}
}
