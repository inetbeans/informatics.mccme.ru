
import java.util.Scanner;

public class ProblemB943 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][];
        a[0] = new int[1];
        a[0][0] = 1;
        for (int i = 0; i < n; i++) {
            a[i] = new int[i + 1];
            a[i][0] = 1;
            a[i][i] = 1;
            for (int j = 1; j < i; j++) {
                a[i][j] = a[i - 1][j] + a[i - 1][j - 1];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
