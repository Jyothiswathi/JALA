package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import net.bytebuddy.description.annotation.AnnotationDescription.Loadable;

public class ReadFileUsingProperties {
	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		File f=new File("C:\\JALA\\src\\main\\java\\JavaIO\\a.properties");
		FileInputStream fis=new FileInputStream(f);
		prop.load(fis);
	}
	
	
	

}
