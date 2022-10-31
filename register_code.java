package test_data;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import library.utility;
import read_excel.Exceldata_config;
import read_excel.register;

public class register_code {
	WebDriver driver;
	
	@Test(dataProvider = "passdata")
	public void wordpress(  String email,String username,String password) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		driver.get("https://wordpress.com/start/user?ref=logged-out-homepage-lp&aff=27964");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);//create account
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[normalize-space()='Create your account']")).click();
		utility.takeScreenShort(driver, "registration successfull");
	
	Thread.sleep(3000);
	
		
	
	
	}
	
	
	
@DataProvider(name="passdata")
	public Object[][] passdata() {

register reg=new register("D:\\a\\trainning season\\datadriven_excle\\Read data\\register.xlsx");
int row=reg.getRowCount(0);
Object[][] data= new Object[row][3];
for(int i=0;i<row;i++) { 
data[i][0]=reg.getdata(0, i, 0);
data[i][1]=reg.getdata(0, i, 1);
data[i][2]=reg.getdata(0, i, 2);}
return data;}



@AfterMethod
public void close() {
	driver.close();
}
}
