/*import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите вычисляемое выражение: ");
        Scanner inc1 = new Scanner(System.in);
        String extract = inc1.next();
        System.out.println(extract);

        String[] parts = extract.split("");
        String part1 = parts[0];
        String part2 = parts[1];
        String part3 = parts[2];

        int forreign1 = Integer.parseInt(part1);
        int forreign2 = Integer.parseInt(part3);

        if (Objects.equals(part2, "+")) {
            System.out.println("Ответ: " + (forreign1 + forreign2));
        } else if (Objects.equals(part2, "-")) {
            System.out.println("Ответ: " + (forreign1 - forreign2));
        } else if (Objects.equals(part2, "*")) {
            System.out.println("Ответ: " + (forreign1 * forreign2));
        } else {
            System.out.println("Ответ: " + (forreign1 / forreign2));
        }

    }
}*/


/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int points = 0;

        System.out.print("\nНеобходимо пройти небольшое тестирование, всего 5 вопрос, 4 варианта ответа и только 1 верный! Вводите цифру, соотвествующую номеру ответа! Поехали )))\n\n");
        System.out.println("\nВопрос: За роль в каком фильме Леонардо Ди Каприо получил свой первый «Оскар»?\n" +
                "1. Титаник\n" +
                "2. Выживший\n" +
                "3. Волк с WallStreet\n" +
                "4. Однажды в Голливуде\n" +
                "5. Банды Нью-Йорка\n");
        System.out.print("\nОтвет: ");

        Scanner inc1 = new Scanner(System.in);
        int answ1 = inc1.nextInt();

        if (answ1==2) {
            points = points +1;
        }


        System.out.println("\nВопрос: Сколько часовых поясов занимает Россия?\n" +
                "1. 6\n" +
                "2. 9\n" +
                "3. 11\n" +
                "4. 14\n" +
                "5. 24\n");
        System.out.print("\nОтвет: ");

        int answ2 = inc1.nextInt();

        if (answ2==3) {
            points = points +1;
        }



        System.out.println("\nВопрос: В какой стране появились первые духи?\n" +
                "1. Великобритания\n" +
                "2. Франция\n" +
                "3. Венгрия\n" +
                "4. Германия\n" +
                "5. Италия\n");
        System.out.print("\nОтвет: ");

        int answ3 = inc1.nextInt();

        if (answ3==3) {
            points = points +1;
        }


        System.out.println("\nВопрос: Кто из этих композиторов был глухим?\n" +
                "1. Пётр Ильич Чайковский\n" +
                "2. Фольфганг Амадей Моцарт\n" +
                "3. Джузеппе Верде\n" +
                "4. Иоганн Себастьян Бах\n" +
                "5. Людвиг ван Бетховен\n");
        System.out.print("\nОтвет: ");

        int answ4 = inc1.nextInt();

        if (answ4==5) {
            points = points +1;
        }

        System.out.println("\nВопрос: Кто изображен на гербе Москвы?\n" +
                "1. Георгий Победоносец\n" +
                "2. Юрий долгорукий\n" +
                "3. Дмитрий Донской\n" +
                "4. Михаил Романов\n" +
                "5. Архангел Михаил\n");
        System.out.print("\nОтвет: ");

        int answ5 = inc1.nextInt();

        if (answ5==1) {
            points = points +1;
        }


        System.out.println("Итоговый балл, соответсвует кол-ву правильных ответов и равен: " + points);

    }
}*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");

        num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        num2 = scanner.nextDouble();

        System.out.print("Введите операцию (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double output;

        switch(operator)
        {
            case '+':
                output = num1 + num2;
                break;

            case '-':
                output = num1 - num2;
                break;

            case '*':
                output = num1 * num2;
                break;

            case '/':
                output = num1 / num2;
                break;


            default:
                System.out.printf("Вы ввели неправильную операцию");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+": "+output);
    }
}