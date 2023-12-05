import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random rand = new Random(0);
        System.out.print("Введите размер дерева: ");
        int n = kb.nextInt();
        Tree tree = new Tree();
        for (int i = 0; i < n; i++) {
            tree.insert(rand.nextInt(100));
        }
        tree.print();
        System.out.println("\nМинимальное значение в дереве: " + tree.minValue());
        System.out.println("Максимальное значение в дереве: " + tree.maxValue());
        System.out.println("Сумма всех элементов дерева: " + tree.sum());
        System.out.println("Количество элементов в дереве: " + tree.count());
        System.out.println("Среднее-арифметическое элементов дерева: " + tree.avg());
        System.out.println("Глубина дерева: " + tree.depth());
        System.out.println("Удаляем узел со значением 29");
        tree.erase(29);
        tree.print();
        tree.clear();
        System.out.println("\nДерево после очистки");
        tree.print();
    }
}