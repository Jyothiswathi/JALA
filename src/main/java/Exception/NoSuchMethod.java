/**
 * @author JALA Academy
 *
 * 14.Write a program to generate NoSuchMethodException
 */
package Exception;

import java.lang.reflect.Method;
class E_14 {
    public void addition(int a, int b) {
        int c;
        c = a + b;
        System.out.println(c);
    }
}

public class NoSuchMethod {
    public static void main(String[] args) {

        try {
            Class c = Class.forName("com.jala.exceptions.E_14");
            Method m = c.getDeclaredMethod("subtraction", int.class, int.class);
        }
        catch (NoSuchMethodException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}