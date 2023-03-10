package Testing.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class testcase3 {
public static void main(String[] args) {
	
WebDriver driver=new ChromeDriver();
	
	driver.get("http://www.google.com");
	driver.get("https://demo.opencart.com/");
	
	String text= driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/h4[1]/a[1]")).getText();
  // String text= driver.findElement(By.xpath("//a[normalize-space()='MacBook']")).getText();
  // String title =driver.getTitle();
	if(text.equals("MacBook")) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
	
}
}
