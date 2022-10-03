package pratcise;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.handler.codec.http.multipart.FileUpload;

public class pageScroll {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mohs10.io/");//website url
		JavascriptExecutor je=(JavascriptExecutor)driver;//Instance of js executor
		je.executeScript("window.scroll(0,2000)\r\n");
		
				
		

		
		WebElement element=driver.findElement(By.linkText("Performance Engineering"));//finding Webelement
		 element.click();
		System.out.println(element.getText());//extract text and verify
		je.executeScript("window.scroll(0,5000)\r\n"
				);
	WebElement element1=driver.findElement(By.xpath("//input[@id='form-field-name']"));
	element1.sendKeys("dipanwita");
	 TakesScreenshot ts=(TakesScreenshot)driver;
 File src=ts.getScreenshotAs(OutputType.FILE);
 File trg=new File("C:\\Users\\cdipa\\OneDrive\\Pictures\\Screenshots");
 FileUtils.copyFile(src,trg);

 System.out.println("the screenshot taken");
 
	driver.close();
		
	}

}
