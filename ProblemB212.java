
import java.util.Arrays;
import java.util.Scanner;

public class ProblemB212 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = new int[n + 2],
                a = new int[n + 2],
                b = new int[n + 2],
                c = new int[n + 2];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        f[0] = 0;
        f[1] = a[1];
        f[2] = min(f[1] + a[2], b[1]);
//        f[3] = min(f[2] + a[3], min(f[1] + b[2], c[1]));
        for (int i = 3; i <= n; i++) {
            f[i] = min(
                    min(f[i - 1] + a[i],
                            f[i - 2] + b[i - 1]
                    ),
                    f[i - 3] + c[i - 2]
            );
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
