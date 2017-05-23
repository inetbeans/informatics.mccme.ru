import java.util.Scanner;

public class ProblemE915 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] F = new int[101];
        int[] step = new int[101];
        for (int i = 1; i <= n; i++) {
            step[i] = sc.nextInt();
        }
        F[0] = 0;
        F[1] = step[1];
        for (int i = 2; i <= n; i++) {
            F[i] = min(F[i - 1] + step[i], F[i - 2] + step[i]);
        }
        System.out.println(F[n]);
    }

    private static int min(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }
}
