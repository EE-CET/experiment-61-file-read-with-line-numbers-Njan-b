import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLineReader {
    public static void main(String[] args) {

        try {
            // Using relative path (file in project root)
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));

            String line;
            int lineNumber = 1;

            while ((line = br.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}