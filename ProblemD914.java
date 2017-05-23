import java.util.Scanner;

public class ProblemD914 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] F = new int[21];
        F[0] = 1;
        F[1] = 3;
        for (int i = 2; i <= n; i++) {
            F[i] = 2 * (F[i - 1] + F[i - 2]);
        }
        System.out.println(F[n]);
    }
}
