public class Main {
    public static void main(String[] args) {
        int[][] mas = new int[24][24];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if((Math.floor(i*0.25)+Math.floor(j*0.25))%2 == 0) mas[i][j] +=1;
                System.out.print(" " + mas[i][j]);
            }
            System.out.println();
        }
    }
}