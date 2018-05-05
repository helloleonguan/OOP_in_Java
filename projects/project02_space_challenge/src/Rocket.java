/**
 * Created by Leon on 03/05/2018.
 */



public class Rocket implements SpaceShip{

    private int cost; // in Millions
    private int weight; // in Tonnes
    private double max_load; // in Tonnes
    private double cargo_carried;

    public Rocket(int cost, int weight, double max_load) {
        this.cost = cost;
        this.weight = weight;
        this.max_load = max_load;
        this.cargo_carried = 0.0;
    }

    public double get_max_load() {
        return this.max_load;
    }

    public double get_cargo_carried() {
        return this.cargo_carried;
    }

    public int get_cost() {
        return this.cost;
    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        return item.getWeight() / 1000 + this.cargo_carried <= this.max_load;
    }

    @Override
    public void carry(Item item) {
        this.cargo_carried += item.getWeight() / 1000;
    }
}
