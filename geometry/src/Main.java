
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.print("Введите размер фигуры: ");
        int n = kb.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print("* ");

            }
            System.out.println();
        }

        System.out.println();

        for (int i = n; i >= 0; i--) {

            for (int j = 0; j <= i; j++) {

                System.out.print("* ");

            }
            System.out.println();
        }

        System.out.println();

        for (int i = n; i > 0; i--) {
            for (int j = n; j > i; j--)
                System.out.print("  ");
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        for (int i = 0; i <= n; ++i) {
            for (int j = n; j > i; --j)
                System.out.print("  ");
            for (int j = 0; j < i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++) System.out.print(" ");
            System.out.print("/");
            for(int j = 0; j < i; j++) System.out.print("  ");
            System.out.print("\\");
            System.out.println();
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++) System.out.print(" ");
            System.out.print("\\");
            for (int j = i; j < n-1; j++) System.out.print("  ");
            System.out.print("/");
            System.out.println();

        }

        System.out.println();

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if ((i + j) % 2 == 0)System.out.print("* ");
                else System.out.print("- ");
            }
            System.out.println();
        }
    }
}
