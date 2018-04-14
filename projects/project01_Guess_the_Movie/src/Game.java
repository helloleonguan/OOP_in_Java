import java.util.ArrayList;

/**
 * Created by Leon on 14/04/2018.
 */


public class Game {

    private String[] movies = null;
    private String selected_movie = "";
    private String current_progress = "";
    private int num_of_wrong_guesses = 0;
    private ArrayList<String> correct_guesses = new ArrayList<>();
    private ArrayList<String> wrong_guesses = new ArrayList<>();

    public Game(String[] movies) {
        this.movies = movies;
    }



    public void pick_a_movie() {
        /**
         * Randomly picks a movie and return and update the selected movie.
         */

    }

    public String output_current_progress() {
        /**
         * Returns the current progress of the game by replacing hidden letter by "_".
         */

        return "";
    }

    public void guess(String letter) {
        /**
         * Determines whether a guess is correct or not.
         */

    }

    public boolean has_end() {
        /**
         * Determines whether the game has terminated.
         */

        return false;
    }

    public void terminate() {
        /**
         * Outputs win or lose messages.
         */
        
    }

}
