package pratcise;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Load the website
		driver.get("https://demoqa.com/browser-windows");

		// It will return the parent window name as a String
		//String parent=driver.getWindowHandle();
		//System.out.println(parent);
		//multiple-website
		driver.findElement(By.id("windowButton")).click();//open another window
		 Set<String> mutliple=driver.getWindowHandles();// multiple window ids
		 
		 // first way
//		 Iterator<String> it=mutliple.iterator();
//		  String Parentid=it.next();
//		  String childid=it.next();
//		  System.out.println("parent window id"+Parentid);
//		  System.out.println("Child window id"+childid);
//		  
		  
		  //list collection second way
		 List<String> windowid=new ArrayList(mutliple);//converting the list
		  String  parentid=windowid.get(0);//parent id
		 String childid=windowid.get(1);//child id
		 System.out.println("parent window id"+windowid);
		 System.out.println("parent window id"+ windowid);
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
		
		
		

	}


