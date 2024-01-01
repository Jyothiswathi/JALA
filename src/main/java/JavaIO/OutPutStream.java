package JavaIO;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutStream {
    public static void main(String[] args) throws IOException {

        FileOutputStream out = null;
        String data = "Hi this is Jyothi";

        try {
            out = new FileOutputStream("C:\\JALA\\src\\main\\java\\JavaIO\\bufferWriter.txt");

            // Using write() method
            out.write(data.getBytes());

            // Using the flush() method
            out.flush();
            out.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}