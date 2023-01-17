import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        int b = 1;
        int c = 0;
        System.out.print(a + "!= ");
        for (int i = 1; i <= a; i++) {
            c++;
            b = b * i;
            if (b >= 1) {
                System.out.print(c);
            }
            if (a > c) {
                System.out.print(" * ");
            }
        }
        System.out.print(" = " + b);
    }
}