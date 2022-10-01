package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//Child Browser popup
		//String parent = driver.getWindowHandle();
		//System.out.println(parent);
		
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		
		for(String allTitle:child)
		{
			driver.switchTo().window(allTitle);
			System.out.println(driver.getTitle());
		}
		driver.quit();
	}

}
