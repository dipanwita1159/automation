package pratcise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://commons.apache.org/proper/commons-io/download_io.cgi");
		TakesScreenshot ts=(TakesScreenshot)driver;
		 //File src=ts.getScreenshotAs(OutputType.FILE);
		 //File trg=new File("D:\\a\\trainning season\\m10first\\screenshort\\homepage.png");
		 //FileUtils.copyFile(src,trg);
//second way
		WebElement sections=driver.findElement(By.xpath("//*[@id=\"SelectMirror\"]/p/input"));
		sections.click();
		File src=ts.getScreenshotAs(OutputType.FILE);
		 File trg=new File("D:\\a\\trainning season\\m10first\\screenshort\\pertial.png");
		 FileUtils.copyFile(src,trg);
		
		 System.out.println("the screenshot taken");
		 driver.close();
		 

	}

}
