
import java.util.Arrays;
import java.util.Scanner;

public class ProblemA210 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = new int[n + 1], x = new int[n + 1], step = new int[n + 1];
        int inf = 0;
        for (int i = 1; i <= n; i++) {
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        x[0] = x[1];
        for (int i = 1; i <= n; i++) {
            step[i] = x[i] - x[i - 1];
            inf += step[i];
        }
        f[1] = inf;
        f[2] = step[2];
        for (int i = 3; i <= n; i++) {
            f[i] = step[i] + min(f[i - 1], f[i - 2]);
        }
        System.out.println(f[n]);
    }

    private static int min(int a, int b) {
        int minimal;
        if (a > b) {
            minimal = b;
        } else {
            minimal = a;
        }
        return minimal;
    }
}
