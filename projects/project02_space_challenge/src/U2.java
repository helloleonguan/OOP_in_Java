import java.util.Random;

/**
 * Created by Leon on 03/05/2018.
 */


public class U2 extends Rocket{

    public U2() {
        super(120, 18, 29);
    }

    @Override
    public boolean launch() {
        Random rand_gen = new Random();

        return rand_gen.nextDouble() < 0.04 * (super.get_cargo_carried() / super.get_max_load());
    }

    @Override
    public boolean land() {
        Random rand_gen = new Random();

        return rand_gen.nextDouble() < 0.08 * (super.get_cargo_carried() / super.get_max_load());
    }
}
