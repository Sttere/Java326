import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random(0);
        Scanner kb = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int n = kb.nextInt();

        ForwardList list = new ForwardList();
        for (int i = 0; i < n; i++) {
            list.push_front(rand.nextInt(100));
        }
        list.print();

        System.out.println("Добавляем значение в конец списка:");
        list.push_back(rand.nextInt(100));
        list.print();

        System.out.println("Удаляем первый элемент списка:");
        list.pop_front();
        list.print();

        System.out.println("Удаляем последний элемент списка:");
        list.pop_back();
        list.print();
    }
}