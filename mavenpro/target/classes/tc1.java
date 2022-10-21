import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tc1  {
	WebDriver driver;
	WebElement firstname;
	WebElement lastname;
	WebElement email;
	WebElement password;
	WebElement c_password;
	@BeforeTest (parameter =1)
	public void invoke() {
		WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		 
		}
@Test
	public void enter_det()
	
	{ WebDriverManager.chromedriver().setup();
	    driver.get("https://demowebshop.tricentis.com/");
	    //register
		driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
		//second page
		 System.out.println(driver.getWindowHandle());
		 //radio button
		 driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		 // register
		
	 firstname = driver.findElement(By.xpath("//input[@id='FirstName']"));
	lastname=driver.findElement(By.xpath("//input[@id='LastName']"));
	 email=driver.findElement(By.xpath("//input[@id='Email']"));
	 password= driver.findElement(By.xpath("//input[@id='Password']"));
	c_password =driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		 }
@AfterTest
public void value  {
	 firstname.sendKeys("dipa");
	 lastname.sendKeys("chakraborty");
	 email.sendKeys("chaakrabortymunu77@gmaul.com");
	 password.sendKeys("1234567");
	 c_password.sendKeys("1234567");
	 driver.findElement(By.xpath("//input[@id='register-button']")).click();
	
}

}
