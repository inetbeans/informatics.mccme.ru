//ошибочное решение
import java.util.Arrays;
import java.util.Scanner;

public class ProblemC1120 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] f = new int[m + 1];
        int[] w = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            w[i] = sc.nextInt();
        }
        for (int i = 1; i <= m; i++) {
            f[i] = 0;
        }
        f[0] = 1;
        int[] fnew = null;
        for (int i = 1; i <= n; i++) {
            fnew = f;
            for (int k = w[i]; k <= m; k++) {
                if (f[k - w[i]] == 1) {
                    fnew[k] = 1;
                }
            }
            f = fnew;
        }
        int[] prev = new int[m + 1];
        if (f[m] == 1) {
            System.out.println();
            for (int i = 1; i <= n; i++) {
                for (int k = m; k >= w[i]; k--) {
                    if (f[k - w[i]] == 1) {
//                        f[k] = 1;
                        prev[k] = w[i];
                    }
                }
            }
            int  k =0;
            StringBuilder result = new StringBuilder();
            while (m > 0) {
                k++;
                result.append(prev[m]);
                System.out.print(prev[m] + " ");
                m = m - prev[m];
            };
        } else {
            System.out.println("NO");
        }
    }

    private static boolean f(int c, int[] w, int init, int end) {
        if (c < 0) {
            return false;
        }

        if (c == 0) {
            return true;
        } else {
            ;
            return f(c - w[init++], w, init, end) // берем w[init] сдвигаемся на одну позицию
                    | f(c, w, init, end) // не берем w[init] сдвигаемся на одну позицию
                    | f(c, w, --init, end); // не берем w[init] сдвигаемся на одну позицию
        }
    }
}
