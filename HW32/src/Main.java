import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        CopyConstructor list = new CopyConstructor();
        list.push_front(1);
        list.push_front(2);
        list.push_front(3);
        list.print();
        list.reverse();
        list.print();
        list.clear();
        list.print();

    }
}