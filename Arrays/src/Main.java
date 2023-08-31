import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = kb.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = kb.nextInt();
        }
        System.out.println("Вы ввели: ");

        for (int i = 0; i < n; i++){
            System.out.print(" " + arr[i]);
        }

        System.out.println("\nВы ввели (в обратном порядке: ");

        for (int i = n-1; i >= 0; i--){
            System.out.print(" " + arr[i]);
        }

        for (int i = 0; i < n; i++){
            sum = sum + arr[i];
        }
        System.out.println("\nСумма введеных значений: " + sum);
        System.out.println("\nСреднее-арифметическое введеных значений: " + sum/n);

        OptionalInt max = Arrays.stream(arr).max();
        System.out.println("\nМаксимальное значение массива: " + max.getAsInt());

        OptionalInt min = Arrays.stream(arr).min();
        System.out.println("\nМинимальное значение массива: " + min.getAsInt());


    }
}