package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//Child Browser popup
		String parent = driver.getWindowHandle();  //closing parent browser
		System.out.println(parent);
		
	
		//driver.quit();

	}

}
