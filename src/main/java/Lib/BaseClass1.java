package Lib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import genericlibrary.WebDriverUtilities;


public class BaseClass1 {
	public WebDriverUtilities utilities= new WebDriverUtilities();
	public WebDriver driver;
	public Propertyfile p =new Propertyfile();    //To use it globally by creating object so i can use it through my class
	@BeforeMethod
	public void openApp() throws FileNotFoundException, IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getData("url"));            //using p.getdata we will calling the key (key= url.)
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeApp(ITestResult r) throws IOException {  //so open and close was repeatetive process for my program so i will write generically.
		int status = r.getStatus();    //return type of status is integer & it is going to give u status of TC.
		//means by making a method 
		String name = r.getName();   //it will give the name of TC which gets failed
		if (status==2){
			Screenshot1 s =new Screenshot1();	
			s.getPhoto(driver, name);
		}
		driver.close();	
	}
}
//if status=1, it takes the screenshot of passed TC.
//if status=2, it takes the screenshot of failed TC.
//if status=3, it takes the screenshot of skiped TC.