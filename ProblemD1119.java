
import static java.lang.Integer.max;
import java.util.Scanner;

public class ProblemD1119 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//count
        int m = sc.nextInt();//weight

        int[][] f = new int[n + 1][m + 1];
        int[] w = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            w[i] = sc.nextInt();
        }
        for (int i = 0; i <= m; i++) {
            f[0][i] = 0;
        }
        for (int i = 0; i <= n; i++) {
            f[i][0] = 0;
        }
        int[] fnew = new int[m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                f[i][j] = f[i - 1][j];
                if (j >= w[i]) {
                    f[i][j] = max(f[i - 1][j - w[i]] + w[i], f[i - 1][j]);
                }
            }
        }
        System.out.println(f[n][m]);
    }
}
