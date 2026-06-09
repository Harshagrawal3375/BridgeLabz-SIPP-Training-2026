import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int i = 100;

        while (i >= 1) {
            if (i % num == 0)
                System.out.print(i + " ");
            i--;
        }
    }
}