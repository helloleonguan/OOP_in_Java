import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Leon on 14/04/2018.
 */

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("movies.txt");
        Scanner input = new Scanner(file);

        ArrayList<String> movies = new ArrayList<>();

        while (input.hasNextLine()) {
            movies.add(input.nextLine());
        }

        Game game = new Game(movies);

        String selected_movie = game.pick_a_movie();

        while (! game.has_end()) {
            // main interaction

        }

    }
}
