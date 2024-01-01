
package JavaIO;

import java.io.FileInputStream;
import java.io.InputStream;
public class ReadFileUsingInputStream {

    public static void main(String[] args) {

        try {
     
            InputStream fis = new FileInputStream("C:\\JALA\\src\\main\\java\\JavaIO\\bufferWriter.txt");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            fis.close();
        } catch (Exception e) {
            
            e.getStackTrace();
        }
    }
}