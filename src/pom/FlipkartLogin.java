package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLogin {
		//@FindBy(xpath="//a[text()='Login']")
		//private WebElement loginbtn;
		
		@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
		private WebElement emailaddtb;
		
		@FindBy(xpath="//input[@type='password']")
		private WebElement passwordtb;
		
		@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
		private WebElement submitbt;
		
		public FlipkartLogin(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		//public void loginbtn() {
			//loginbtn.click();
		//}
		
		public void emailaddtb(String email) {
			emailaddtb.sendKeys(email);
		}
		
		public void passwordtb(String pass) {
			passwordtb.sendKeys(pass);
		}
		
		public void submitbt() {
			submitbt.click();
		
		
		}
}
