package scrollbar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		 WebElement ele = driver.findElement(By.xpath("//img[@class='image-image undefined image-hand']"));
		 Point loc = ele.getLocation();
		 int x = loc.getX();
		int y = loc.getY();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window, scrollBy("+x+","+y+")");
		
		ele.click();
		
		driver.close();
	}

}
