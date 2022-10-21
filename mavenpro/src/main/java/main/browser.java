package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser {
	public   WebDriver driver;
@BeforeTest
	public void invoke() {
		WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		 
		}
@Test
public void login() throws InterruptedException {
driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
driver.getWindowHandle();
driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("cdipanwita04@gmail.com");
driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");
driver.findElement(By.xpath("//body/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[5]/input[1]")).click();
Thread.sleep(20000);}










@AfterTest
public void close() {
	driver.close();
	
}
}
