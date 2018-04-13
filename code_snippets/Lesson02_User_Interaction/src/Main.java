/**
 * Created by Leon on 12/04/2018.
 */

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your address: ");
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        System.out.println("You live at: " + address);

        System.out.println("Enter your grade: ");
        int grade = scanner.nextInt();
        if(grade > 90){
            System.out.println("Wow! you did well!");
        }else{
            System.out.println("Not bad, but you can do better next time!");
        }
    }
}
