package Lib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot1 implements Constant {
public String getPhoto(WebDriver driver, String name) throws IOException {//i need to know which TC is going to fail so 
	//write a parameter as String name.
	
    // as we take screenshot on daily basis,so we make object of date that will give me current date everytime.
	//date class will return me current class date and time of my system.
	Date d = new Date();
	
	//converting date to toString and store it in String format, we make use of replace because it will not understand the tags
	//so i am replacing hyfun'-' instead of colon':'
	String date = d.toString().replace("-", ":");
	
	TakesScreenshot t = (TakesScreenshot) driver;
	File src = t.getScreenshotAs(OutputType.FILE);
	File dest = new File(photopaths+date+name+".png");//it should be in this formate concatenate+date+name and extension of photo should be .png
	FileUtils.copyFile(src,dest);// since this is also will return in the form of string so change parameteras String in line 13.
	return date;
}
}
