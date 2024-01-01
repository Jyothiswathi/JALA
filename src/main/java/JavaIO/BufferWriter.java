
package JavaIO;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriter {
    public static void main(String[] args) {

        String s = "hello";

        try {
            FileWriter fw = new FileWriter("a.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(s);
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}