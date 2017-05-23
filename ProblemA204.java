import java.util.Scanner;

public class ProblemA204 {

    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader( System.in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();;
        int[] a = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m + 1];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();;
        }
        int[][] lcs = new int[n + 1][m + 1];
        lcs[0][0] = 0;
        lcs[1][0] = 0;
        lcs[0][1] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (a[i] == b[j]) {
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;
                } else {
                    lcs[i][j] = max(lcs[i - 1][j], lcs[i][j - 1]);
                }
            }
        }
        System.out.println(lcs[n][m]);
    }

    private static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
