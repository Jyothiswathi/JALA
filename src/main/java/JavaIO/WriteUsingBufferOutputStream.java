/**
 * @author JALA Academy
 *
 * 4.Write text to a .txt file using BufferedOutputStream
 */
package JavaIO;

import java.io.*;

public class WriteUsingBufferOutputStream {

    public static void main(String[] args) {
        String s = "This text is written using BufferedOutputStream.";

        try {
               FileOutputStream fos = new FileOutputStream("C:\\JALA\\src\\main\\java\\JavaIO\\bufferWriter.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            byte[] arr = s.getBytes();
            bos.write(arr);
            bos.close();
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}