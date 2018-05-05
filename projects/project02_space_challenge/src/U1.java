import java.util.Random;

/**
 * Created by Leon on 03/05/2018.
 */


public class U1 extends Rocket{

    public U1() {
        super(100, 10, 18);
    }

    @Override
    public boolean launch() {
        Random rand_gen = new Random();

        return rand_gen.nextDouble() > 0.05 * (super.get_cargo_carried() / super.get_max_load());
    }

    @Override
    public boolean land() {
        Random rand_gen = new Random();

        return rand_gen.nextDouble() > 0.01 * (super.get_cargo_carried() / super.get_max_load());
    }
}
