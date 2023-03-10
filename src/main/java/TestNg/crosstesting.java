package TestNg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;

public class crosstesting {

 public WebDriver driver;
 @Test
  public void FirefoxTest() {	 

	 System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
	  driver = new FirefoxDriver();	  
	  driver.get("https://www.demoqa.com"); 
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
	  driver.quit();

  }
 
 @Test
 public void ChromeTest()
 { 
     
       System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
       driver = new ChromeDriver();
       driver.get("https://www.demoqa.com"); 
       driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
       driver.quit();
 }
}