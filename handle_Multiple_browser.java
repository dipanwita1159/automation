package secondday;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_Multiple_browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.redbus.in/");
		String parent=driver.getWindowHandle();
		System.out.println("the current page url is"+ parent);
		driver.findElement(By.xpath("//*[@id=\"redRail\"]")).click();
		Set<String> multiple=driver.getWindowHandles();
		Iterator<String> it=multiple.iterator();
		String parentId=it.next();
		String childId=it.next();
		System.out.println("parent Id is"+ parentId);
		System.out.println("child id is"+ childId);

	}

}
