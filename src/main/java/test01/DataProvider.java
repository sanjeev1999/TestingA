package test01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




public class DataProvider {
WebDriver driver;

@BeforeClass
void setup()
{

String exp_title = "nopCommerce demo store";
String act_title = driver.getTitle();

Assert.assertEquals(exp_title, act_title);
}

@AfterClass
void tearDown()
{
driver.close();
}

@DataProvider(name="dp" ,indices= {0,1,4})
String [][] loginData()
{
String data[][]= {
{ "abc11@gmail.com", "test123" },
{ "pavanol@gmail.com", "test@123" },
{ "pavanoltraining@gmail.com", "test3" },
{ "pavanoltraining@gmail.com", "test@123" },
{ "pavanoltraining@gmail.com", "test@123" }
};

return data;
}



}