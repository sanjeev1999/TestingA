package Testing.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sakumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
 //driver.get("http:/www.saucedemo.com");
	//driver.findElement(By.xpath("//*[@id=\"user-name\"]//*[@id=\"user-name\"]")).sendKeys("standard_user");
   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	//driver.findElement(By.name("password")).sendKeys("admin123");
	//driver.findElement(By.className("orangehrm-login-button")).click();
 }
}