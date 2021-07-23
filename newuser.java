	package loginmodule;
	import java.awt.Dimension;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class newuser {
	WebDriver driver;
	@BeforeMethod
	 void setup() {
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	 }
	 @Test
		public void login() {
		 driver.get("https://www.bewakoof.com/login/email");
		 driver.manage().window().maximize();
		 driver.switchTo().alert().accept();
		 
		 
			
			
		}

	}

}
