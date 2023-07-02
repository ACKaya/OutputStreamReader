import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        String str="Can Boz";
        try {
            FileOutputStream fileOutputStream=new FileOutputStream("test.txt");
            OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream);
            outputStreamWriter.write(str);
            outputStreamWriter.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
