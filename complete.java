package loginmodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class complete{
 @Test
 void selection() {
  WebDriverManager.chromedriver().setup();
  ChromeOptions options=new ChromeOptions();
	 	options.addArguments("disable-notifications");
  WebDriver driver=new ChromeDriver(options);
  String URL="https://www.bewakoof.com/login/email";
  Actions action=new Actions(driver);
  driver.get(URL);
  driver.manage().window().maximize();
  driver.findElement(By.cssSelector("#web_email_login")).click();
  driver.findElement(By.xpath("//input[@id='email_input']")).sendKeys("yogiram7211@gmail.com");
  driver.findElement(By.xpath("//input[@id='mob_password']")).sendKeys("Yogiramu@98");
  WebElement element = driver.findElement(By.cssSelector("#mob_login_password_submit"));
	 action.doubleClick(element).perform();
	 WebElement element2 = driver.findElement(By.cssSelector("#testMenuSelect-mobile\\ covers > .menuSelect > span"));
     Actions builder = new Actions(driver);
     builder.moveToElement(element2).perform();

     driver.findElement(By.cssSelector("#testMenuSelect-shop-men > .menuSelect > span")).click();
     driver.findElement(By.cssSelector(".accordionBox:nth-child(1) .filterHeader")).click();
     driver.findElement(By.cssSelector(".accordionBox:nth-child(1) li:nth-child(2) a")).click();
       WebElement element3 = driver.findElement(By.cssSelector(".accordionBox:nth-child(1) li:nth-child(2) a"));
       Actions builder1 = new Actions(driver);
       builder1.moveToElement(element3).perform();
       WebElement element4 = driver.findElement(By.cssSelector(".selectedEntry"));
       Actions builder2 = new Actions(driver);
       builder2.moveToElement(element4).perform();
       driver.findElement(By.cssSelector("#testProductcard_2 .productImgTag")).click();
     WebElement size=driver.findElement(By.cssSelector("#testSizes_L > span"));
     WebElement cart=driver.findElement(By.cssSelector("#addToCart > span"));
     action.moveToElement(size).moveToElement(cart).click().perform();
     driver.findElement(By.cssSelector(".atc_to_gtc")).click();
   }
 

   
   
   
 }
 
