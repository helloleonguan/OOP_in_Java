import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Leon on 14/04/2018.
 */


public class Game {

    private ArrayList<String> movies = null;
    private String selected_movie = "";
    private String current_progress = "";
    private int num_of_wrong_guesses = 0;
    private ArrayList<Character> correct_guesses = new ArrayList<>();
    private ArrayList<Character> wrong_guesses = new ArrayList<>();

    public Game(ArrayList<String> movies) {
        this.movies = (ArrayList<String>) movies.clone();
    }



    public String pick_a_movie() {
        /**
         * Randomly picks a movie and update the selected_movie & initialize current_progress.
         */

        int num_of_movies = movies.size();

        Random generator = new Random();

        int rand_index = generator.nextInt(num_of_movies);
        this.selected_movie = movies.get(rand_index);

        return this.selected_movie;
    }

    public String output_current_progress() {
        /**
         * Returns the current progress of the game by replacing hidden letter by "_".
         */

        this.current_progress = "";

        for (int i = 0; i < this.selected_movie.length(); i++) {
            if (this.correct_guesses.contains(this.selected_movie.charAt(i))) {
                this.current_progress += this.selected_movie.charAt(i);
            } else {
                this.current_progress += "_";
            }
        }

        return this.current_progress;
    }

    public boolean guess(Character c) {
        /**
         * Determines whether a guess is correct or not.
         */

        if (this.selected_movie.indexOf(c) >= 0) {
            this.correct_guesses.add(c);
            return true;
        } else {
            this.wrong_guesses.add(c);
            this.num_of_wrong_guesses += 1;
            return false;
        }

    }

    public boolean has_end() {
        /**
         * Determines whether the game has terminated.
         */

        if (num_of_wrong_guesses >= 10) {
            return true;
        } else {
            return false;
        }
    }

    public int get_num_of_wrong_guesses() {
        return this.num_of_wrong_guesses;
    }

    public String get_selected_movie() {
        return this.selected_movie;
    }

    public String get_wrong_guesses() {
        String wrong_guesses_str = "";

        for (Character c : this.wrong_guesses) {
            wrong_guesses_str += c + " ";
        }

        return wrong_guesses_str;
    }

    public String get_correct_guesses() {
        String correct_guesses_str = "";

        for (Character c : this.correct_guesses) {
            correct_guesses_str += c + " ";
        }

        return  correct_guesses_str;
    }
}
