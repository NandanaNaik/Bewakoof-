package loginmodule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class passorfail {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	WebDriver driver;
   	 	WebDriverManager.chromedriver().setup();
   	 	ChromeOptions options=new ChromeOptions();
   	 	options.addArguments("disable-notifications");
   	 	driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        Actions action=new Actions(driver);
        driver.get("https://www.bewakoof.com/login/");
        driver.findElement(By.cssSelector("#web_email_login")).click();
        driver.findElement(By.xpath("//input[@id='email_input']")).sendKeys("yogiram7211@gmail.com");
   	 	driver.findElement(By.xpath("//input[@id='mob_password']")).sendKeys("Yogiramu@98");
   	 WebElement element = driver.findElement(By.cssSelector("#mob_login_password_submit"));
	 action.doubleClick(element).perform();String actualUrl="https://www.bewakoof.com/login/email";
   	 	String expectedUrl= driver.getCurrentUrl();
        
        if(actualUrl.equalsIgnoreCase(expectedUrl))
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed");
        }
        
        
        
    }
 
}