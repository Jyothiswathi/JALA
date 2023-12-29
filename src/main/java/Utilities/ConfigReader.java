package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
public	Properties prop;
	public Properties init_Properties()
	
	{
		prop = new Properties();

		File f=new File("C:\\JALA\\src\\test\\resources\\Config\\config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(f);
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
		
	}

}
