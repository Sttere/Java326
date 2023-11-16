import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 /*       Random rand = new Random(0);
        Scanner kb = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int n = kb.nextInt();


         ForwardList list = new ForwardList();
        for (int i = 0; i < n; i++) {
            list.push_front(rand.nextInt(100));
        }
        list.print();
        System.out.println("Добавляем значение в конец списка");
        list.push_back(123);
        list.print();

        System.out.println("Удаляем первый элемент списка");
        list.pop_front();
        list.print();

        System.out.println("Удаляем последний элемент списка");
        list.pop_back();
        list.print();

        System.out.print("Введите значение добавляемого элемента: ");
        int value = kb.nextInt();
        System.out.print("Введите индекс добавляемого элемента: ");
        int index = kb.nextInt();
        list.insert(value, index);
        list.print();*/

  /*      ForwardList list = new ForwardList(); //удаляет значение по заданному индексу
        list.push_back(1);
        list.push_back(2);
        list.push_back(3);
        list.print();

        list.erase(1);
        list.print();*/

        CConst list = new CConst();
        list.push_front(1);
        list.push_front(2);
        list.push_front(3);
        list.print();
        list.reverse();  //меняет порядок следования элементов на противоположный
        list.print();
        list.clear(); //очищает список
        list.print();

    }
}