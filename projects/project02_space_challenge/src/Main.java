import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Created by Leon on 03/05/2018.
 */

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Simulation simulation = new Simulation();

        File phase1 = new File("./src/phase-1.txt");
        File phase2 = new File("./src/phase-2.txt");

        ArrayList<Item> phase1_items = simulation.loadItems(phase1);
        ArrayList<Item> phase2_items = simulation.loadItems(phase2);

        System.out.println(phase1_items);
        System.out.println(phase2_items);
    }

}
