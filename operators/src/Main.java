import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int change = 0;

        System.out.println("Меняем числа внутри переменных местами");

        Scanner inс1 = new Scanner(System.in);
        System.out.print("Введите целое число для первой переменной first_input -> ");
        int first_input = inс1.nextInt();
        System.out.println("Первая переменная first_input ровняется = "+first_input);

        System.out.print("Введите целое число для первой переменной second_input -> ");
        int second_input = inс1.nextInt();
        System.out.println("Вторая переменная second_input ровняется = "+second_input);

        change = first_input;
        first_input = second_input;
        second_input = change;

        System.out.println("*** Абра-кадабра и переменные теперь поменялись местами ***");
        System.out.println("Первая переменная first_input стала "+first_input+" и вторая переменная second_input стала "+second_input);


    }
}

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("проверка числа на полиндром");

        Scanner inc = new Scanner(System.in);
        System.out.print("Введите целое число для проверки -> ");
        int sum1 = inc.nextInt();
        int rev=0;
        int i=0;
        int originnumber=sum1;

        while (sum1!=0){
            rev=sum1%10;
            i=i*10+rev;
            sum1=sum1/10;
        }

        if (originnumber==i)
            System.out.println("Введенное число "+originnumber+" является полнидромом");
        else
            System.out.println("Введенное число "+originnumber+" не является полнидромом");

        }


}*/
