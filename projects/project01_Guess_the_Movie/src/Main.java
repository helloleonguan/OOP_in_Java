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
        Scanner letter_reader = new Scanner(System.in);

        while (! game.has_end()) {
            // main interaction

            System.out.println("You are guessing: " + game.output_current_progress());
            System.out.println("You have guessed (" + game.get_num_of_wrong_guesses() +
                    ") wrong letters: " + game.get_wrong_guesses());

            System.out.println("You are guessing: ");

            String cur_c = "" + letter_reader.next();

            if (cur_c.length() == 1 && Character.isLetter(cur_c.charAt(0))) {
                cur_c = cur_c.toLowerCase();
                game.guess(cur_c.charAt(0));
            } else {
                System.out.println("Invalid letter! Game ended.");
                return;
            }
        }

        if (game.get_num_of_wrong_guesses() == 10) {
            System.out.println("You Lose!");
            System.out.println("The movie is \"" + selected_movie + "\" .");
        } else {
            System.out.println("You Win!");
            System.out.println("You correctly guessed \"" + selected_movie + "\".");
        }

    }
}
