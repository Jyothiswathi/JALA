package JavaIO;

import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromtxtFile {
	public static void main(String[] args) throws IOException {
		 FileReader fi = new FileReader(
			        "C:\\JALA\\a.txt");

			    // Declaring loop variable
			    int i;
			    // Holds true till there is nothing to read
			    while ((i = fi.read()) != -1)

			        // Print all the content of a file
			        System.out.print((char)i);
	}

   

}
