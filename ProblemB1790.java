
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProblemB1790 {

    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader( System.in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();;
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m + 1];
        for (int i = 1; i <= m; i++) {
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
        k = lcs[n][m];
        answer = new int[k];
        backtrack(lcs, a, b, n, m);
        k = lcs[n][m] - 1;
        int i = 0;
        while(i <= k){
            System.out.print(answer[i++]+ " ");
        }
    }

    private static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    private static int[] answer;
    private static int k;
    private static void backtrack(int[][] lcs, int[] a, int[] b, int n, int m) {
        if (n == 0 || m == 0) {
//            return "";
        } else if (a[n] == b[m]) {
            answer[--k] = a[n];
            //return 
                    backtrack(lcs, a, b, n - 1, m - 1) ;// + a[n] + " ";
        } else {
            if (lcs[n - 1][m] > lcs[n][m - 1]) {
                 backtrack(lcs, a, b, n - 1, m);
            } else {
                backtrack(lcs, a, b, n, m - 1);
            }
        }
    }
}
