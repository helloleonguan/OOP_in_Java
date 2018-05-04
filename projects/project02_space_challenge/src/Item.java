/**
 * Created by Leon on 03/05/2018.
 */


public class Item {
    private String name;
    private int weight; // in KGs

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return name + ": " + weight;
    }
}
