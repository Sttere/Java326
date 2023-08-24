import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //треугольник Паскаля
 /*       System.out.print("Введите глубину треугольника: ");
        int rows = s.nextInt();
        int coef = 1;

        for (int i = 0; i < rows; i++) {
            for (int sp = 1; sp < rows - i; ++sp) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    coef = 1;
                else
                    coef = coef * (i - j + 1) / j;

                System.out.printf("%4d", coef);
            }

            System.out.println();
        }*/

        System.out.print("Введите размер доски: ");
        int n = s.nextInt();
        for (int i =0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                for (int k = 0; k < n; k++)
                {
                    for (int l = 0; l < n; l++)
                    {
                        System.out.print((i%2 == k%2) ? "* " : "  ");
                    }
                }
                System.out.println();
            }
        }

    }
}