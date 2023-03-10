package test01;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class Wait {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.get("http://www.ebay.in/");
		Stopwatch watch =null;
		try {
			watch=Stopwatch.createStarted();
			//driver.findElement(By.linkText("wrong element")).click();
			WebElement el=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("hjk")));
			el.click();
			System.out.println("found");
			watch.stop();
			System.out.println("time "+ watch.elapsed(TimeUnit.SECONDS)+" second");
		}
		catch(Exception e) {
			watch.stop();
			System.out.println("not found");
			System.out.println("time "+ watch.elapsed(TimeUnit.SECONDS)+" second");
		}
	}
}