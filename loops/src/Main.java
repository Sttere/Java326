import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
       /* int i = 0; // счетчик цикла
        System.out.print("Введите кол-во итераций: ");
        int n = kb.nextInt(); // кол-во итераций
        while (++i<n){
            System.out.println("hello");*/
        int value = 0;
        boolean
        int sum = 0;
        System.out.print("Введите кол-во итераций: ");
/*        do {
            value = kb.nextInt();
            sum += value;
        }while (value != 0);
        System.out.println("Сумма введеных значений " + sum);*/
        int n =kb.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println(i + "\t");
        }
    }
}

