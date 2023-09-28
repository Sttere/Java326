import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        Point B = new Point();
        System.out.print("Введите координату точки \"B\" на оси \"x\" ");
        B.x2 = kb.nextDouble();
        System.out.print("Введите координату точки \"B\" на оси \"y\" ");
        B.y2 = kb.nextDouble();

        Point A = new Point();
        A.x = 2;
        A.y = 3;
        System.out.println("Координата точка А на оси x = "+A.x);
        System.out.println("Координата точка А на оси y = "+A.y);
        System.out.println("Расстояние до точки А = "+ A.distanceA());
        System.out.println("Расстояние между точками А и B = "+ Point.distance());


    }
}

/*class Point
{
    double x;
    double y;

    double distance() {

        double distform = (x*x) + (y*y);

        return Math.sqrt(distform);
    }

}*/

class Point
{
    static double x;
    static double y;
    static double x2;
    static double y2;

    static double distance() {

        return Math.sqrt((y2 - y) * (y2 - y) + (x2 - x) * (x2 - x));
    }
    double distanceA() {

        double distform = (x*x) + (y*y);

        return Math.sqrt(distform);
    }

}