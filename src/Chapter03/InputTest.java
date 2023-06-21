package Chapter03;

import java.io.*;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        InputStream in = null;
        try {
            in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("/Users/moon/Developments/DesignPattern/src/Chapter03/test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
        }
        System.out.println();
        try (InputStream in2 =
                     new LowerCaseInputStream(
                             new BufferedInputStream(
                                     new FileInputStream("/Users/moon/Developments/DesignPattern/src/Chapter03/test.txt")))) {
            while ((c = in2.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
