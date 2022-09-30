package pratcise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class arart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("cdipanwita04@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("munu1159");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Alert alert = driver.switchTo().alert();//alert switch
		String alertMessage= driver.switchTo().alert().getText();	//capture alert message
		 System.out.println(alertMessage);	//print
	        Thread.sleep(5000);
	        		
	        // Accepting alert		
	        alert.accept();	
		
		
	}

}
