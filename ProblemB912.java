
import java.util.Scanner;

public class ProblemB912 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] F = new int[100000 + 1];
        F[0] = 1;
        F[1] = 2;
        F[2] = 4;
        F[3] = 7;
        for (int i = 4; i <= n; i++) {
            F[i] = F[i - 1] + F[i - 2] + F[i - 3];
        }
        System.out.println(F[n]);
    }
}
