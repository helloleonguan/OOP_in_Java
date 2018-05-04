import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Leon on 03/05/2018.
 */


public class Simulation {

    public ArrayList<Item> loadItems(File data_file) throws FileNotFoundException {
        ArrayList<Item> items = new ArrayList<>();

        Scanner scanner = new Scanner(data_file);
        while (scanner.hasNextLine()) {
            String item_info = scanner.nextLine();
            String[] item_info_pair = item_info.split("=");
            Item item = new Item(item_info_pair[0], Integer.parseInt(item_info_pair[1]));
            items.add(item);
        }

        return items;
    }

    public ArrayList<U1> loadU1(ArrayList<Item> items) {
        return null;
    }

    public ArrayList<U2> loadU2(ArrayList<Item> items) {
        return null;
    }

    public int runSimulation(ArrayList<Rocket> rockets) {
        return 0;
    }

}
