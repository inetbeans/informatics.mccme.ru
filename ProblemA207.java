
import java.util.Scanner;

public class ProblemA207 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        n = n + 1;
        int[] F = new int[1000];
        F[0] = 1;
        F[1] = 2;
        for (int i = 2; i <= n; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }
        System.out.println(F[n]);
    }
}
