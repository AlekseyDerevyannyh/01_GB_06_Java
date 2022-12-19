import java.io.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        try (InputStream inputStream = new FileInputStream("sdafgdsaf")) {
            String[] strings = {"asdf", "asdf"};
            String strings1 = strings[1];
            main.test();
            int a = 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: division by zero");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("I'm alive!");
    }

    public void test() {
        File file = new File("1.txt");
        try (FileReader reader = new FileReader(file)) {
            if(file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("Reuse existing file");
            }
            if (reader.read() == -1) {
                throw new IOException("File cannot be read");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
