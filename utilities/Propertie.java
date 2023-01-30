package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertie {
	
	public static final String filePath = "C:\\Users\\ahmed\\eclipse-workspace\\TestNGDEmo\\src\\test\\resources\\config.properties";
	
	public static Properties prop = new Properties();
	public static Properties propertiesFile(String filePath) throws IOException {
		//prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(filePath);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
		}
	}
	
