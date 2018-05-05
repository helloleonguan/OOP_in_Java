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

        ArrayList<Rocket> u1s_1 = simulation.loadU1(phase1_items);
        ArrayList<Rocket> u1s_2 = simulation.loadU1(phase2_items);

        u1s_1.addAll(u1s_2);

        System.out.print("The total cost for U1 fleet is ");
        System.out.print(simulation.runSimulation(u1s_1));
        System.out.println(" Millions.");

        ArrayList<Rocket> u2s_1 = simulation.loadU2(phase1_items);
        ArrayList<Rocket> u2s_2 = simulation.loadU2(phase2_items);

        u2s_1.addAll(u2s_2);

        System.out.print("The total cost for U2 fleet is ");
        System.out.print(simulation.runSimulation(u2s_1));
        System.out.println(" Millions.");
    }

}
