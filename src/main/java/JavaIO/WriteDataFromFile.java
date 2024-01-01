package JavaIO;

import java.io.FileWriter;
import java.io.IOException;
 
public class WriteDataFromFile {
 
    public static void main(String[] args)
    {
 
       
        String text
            = "this is jyothi";
 
        try {
            FileWriter fWriter = new FileWriter(
                "C:\\JALA\\a.txt");
 
            
            fWriter.write(text);
 
            System.out.println(text);
 
            fWriter.close();

            System.out.println(
                "File is created successfully with the content.");
        }
 
        catch (IOException e) {
 
            System.out.print(e.getMessage());
        }
    }
}
