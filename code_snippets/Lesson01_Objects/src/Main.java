/**
 * Created by Leon on 12/04/2018.
 */

public class Main {
    private String name = "";
    private String [] colors;

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Main m = new Main("Leon");
        System.out.println(m.resetNum(56));
        System.out.println(m.colors[2]);
        m.colors[2] = "white";
        System.out.println(m.colors[2]);

    }

    private Main(String name) {
        this.name = name;
        this.colors = new String[]{"yellow", "red", "blue"};
    }

    public int resetNum(int new_num) {
        int num = new_num;
        return num;
    }
}
