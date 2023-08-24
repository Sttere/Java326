public class Main {
    public static void main(String[] args) {

        int i = 3;
        i = i++ + 1 + ++i*=2;
        System.out.println(i);
    }
}

