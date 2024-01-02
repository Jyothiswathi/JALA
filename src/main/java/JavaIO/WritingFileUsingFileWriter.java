
package JavaIO;

import java.io.FileWriter;

public class WritingFileUsingFileWriter {
    public static void main(String[] args) {

        String s = "Hi this is jyothi";

        try {
            FileWriter fw = new FileWriter("C:\\JALA\\src\\main\\java\\JavaIO\\bufferWriter.txt");

            fw.write(s);
            fw.close();
            System.out.println("Data is written to the file.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
