import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Leon on 12/04/2018.
 */

public class FileReader {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./src/98-0.txt");
        Scanner scanner = new Scanner(file);

        int count = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            count += line.split(" ").length;

        }

        System.out.println("This book has " + count + " words!");
    }
}
