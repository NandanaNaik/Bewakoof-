package loginmodule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class validlogin {
 @Test
	public void login() throws InterruptedException {
	 WebDriver driver;
	 WebDriverManager.chromedriver().setup();
	 ChromeOptions options=new ChromeOptions();
	 	options.addArguments("disable-notifications");
	 	driver=new ChromeDriver(options);
	 	 Actions actions = new Actions(driver);
     driver.get("https://www.bewakoof.com//login");
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 driver.findElement(By.cssSelector("#web_email_login")).click();
	 driver.findElement(By.xpath("//input[@id='email_input']")).sendKeys("yogiram7211@gmail.com");
	 driver.findElement(By.xpath("//input[@id='mob_password']")).sendKeys("Yogiramu@98");
	 WebElement element = driver.findElement(By.cssSelector("#mob_login_password_submit"));
	 actions.doubleClick(element).perform();
	
}
}