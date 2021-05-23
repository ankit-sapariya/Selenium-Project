package Lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile implements Constant {
	public String getData(String Key)throws FileNotFoundException, IOException {
		Properties p = new Properties();
		p.load(new FileInputStream(propertyfile));
		return p.getProperty(Key);
	}
}
