package pratcise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlemap {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/maps/@22.5411072,88.358912,12z");//invoke browser
		driver.findElement(By.xpath("//input[@id='searchboxinput']")).sendKeys("udaynarayanpur");//sreach for udaynarayanpur
		driver.findElement(By.xpath("//button[@id='searchbox-searchbutton']")).click();//sreach click
		driver.findElement(By.xpath("//*[@id=\"QA0Szd\"]/div/div/div[1]/div[2]/div/div[1]/div/div/div[4]/div[1]/button")).click();
		Thread.sleep(8000);
		driver.close();
		
	}

}
