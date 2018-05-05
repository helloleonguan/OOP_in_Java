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

    public ArrayList<Rocket> loadU1(ArrayList<Item> items) {
        ArrayList<Rocket> u1s = new ArrayList<>();

        U1 cur_u1 = new U1();
        for (Item item : items) {
            if (cur_u1.canCarry(item)) {
                cur_u1.carry(item);
            } else {
                u1s.add(cur_u1);
                cur_u1 = new U1();
            }
        }

        u1s.add(cur_u1);

        return u1s;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> items) {
        ArrayList<Rocket> u2s = new ArrayList<>();

        U2 cur_u2 = new U2();
        for (Item item : items) {
            if (cur_u2.canCarry(item)) {
                cur_u2.carry(item);
            } else {
                u2s.add(cur_u2);
                cur_u2 = new U2();
            }
        }

        u2s.add(cur_u2);

        return u2s;
    }

    public int runSimulation(ArrayList<Rocket> rockets) {
        int total_cost = 0;

        for (int i = 0; i < rockets.size(); i ++) {
            if (rockets.get(i).launch() && rockets.get(i).land()) {
                total_cost += rockets.get(i).get_cost();
            } else {
                total_cost += rockets.get(i).get_cost();
                i --;
            }
        }

        return total_cost;
    }

}
