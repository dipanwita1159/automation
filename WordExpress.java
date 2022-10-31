package test_data;



import read_excel.Exceldata_config;

import org.apache.poi.hslf.usermodel.HSLFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class WordExpress {
	 public WebDriver driver;
	 
	 HSSFWorkbook wb;
	 HSLFSheet sh1;
	 int numrow;
	 String username;
	 String password;

	 
	 
		@Test(dataProvider = "passdata")
		public void wordpress( String username,String password) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.manage().deleteAllCookies();
			 driver.manage().window().maximize();
			driver.get("https://wordpress.com/wp-login.php?redirect_to=https%3A%2F%2Fwordpress.com%2F&aff=27964");
			driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(password);
			driver.findElement(By.id("wp-submit")).click();
			
		
		Thread.sleep(3000);
		
			
		
		
		}
		
		
		
@DataProvider(name="passdata")
		public Object[][] passdata() {
	
Exceldata_config config=new Exceldata_config("D:\\a\\trainning season\\datadriven_excle\\Read data\\data.xlsx");
int row=config.getRowCount(0);
Object[][]data=new Object[row][2];
for(int i=0;i<row;i++) { 
data[i][0]=config.getdata(0, i, 0);
data[i][1]=config.getdata(0, i, 1);}
return data;}

	
			
			/*
			 * Object[][] data=new Object[3][2]; data[0][0]="admin1"; data[0][1]="demo1";
			 * data[1][0]="admin"; data [1][1]="demo2"; data[2][0]="admin3";
			 * data[2][1]="demo3";
			 */
			
	 

			
			
			 



			}
			
		




