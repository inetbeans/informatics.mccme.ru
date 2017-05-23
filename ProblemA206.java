import java.util.Scanner;

public class ProblemA206 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        long[][] a = new long[n+2][m+2];
        a[1][0] = 0;
        a[0][1] = 1;
        a[1][1] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                a[i][j] = a[i - 1][j] + a[i][j - 1];
            }
        }
        System.out.println(a[n][m]);
    }
}
