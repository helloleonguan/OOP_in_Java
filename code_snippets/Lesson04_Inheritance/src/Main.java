/**
 * Created by Leon on 01/05/2018.
 */

public class Main {
    public static void main(String[] args) {

        CheckingAccount ca = new CheckingAccount("LEON");
        System.out.println(ca.deposit(500));

        Book book1 = new Book(300);
        Book book2 = new Book(400);

        System.out.println(book1.compareTo(book2) > 0);

        // final method: cannot be overriden.
        // final field: constant.

        // static field: all instances share the same field.
        // static method: call upon class, no access to non-static fields (== standalone function).


    }
}
