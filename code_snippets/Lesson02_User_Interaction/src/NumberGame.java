/**
 * Created by Leon on 12/04/2018.
 */

import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;

        System.out.println("I have randomly chosen a number from 1 to 100.");
        System.out.println("Try to guess it!");

        Scanner scanner = new Scanner(System.in);

        for (int i = 10; i > 0; i--) {
            System.out.println("You have " + i + " guess(es) left! Enter a guess:");
            int guess = scanner.nextInt();

            if (guess > randomNumber) {
                System.out.println("It's smaller than " + guess + ".");
            } else if (guess < randomNumber) {
                System.out.println("It's larger than " + guess + ".");
            } else {
                hasWon = true;
                break;
            }
        }

        if (hasWon) {
            System.out.println("Correct.. You win!");
        } else {
            System.out.println("You lose. The number was " + randomNumber);
        }
    }
}
