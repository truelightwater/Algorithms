package Chapter_01.exercise;

public class Q12 {
    public static void main(String[] args) {

        int i = 1;

        System.out.print("  ");

        for (i = 1; i <= 9; i++) {
            System.out.printf("%3d", i);
        }

        System.out.println();
        System.out.println("---+-------------------------");

        for (i = 1; i <= 9; i++) {
            System.out.print(i+"|");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i + j);
            }
            System.out.println();
        }
    }
}
