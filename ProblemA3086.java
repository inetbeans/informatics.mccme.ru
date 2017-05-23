
import static java.lang.Integer.min;
import java.util.Scanner;

public class ProblemA3086 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = new int[n + 3];
        f[0] = 0;
        f[1] = 1;
        f[2] = 2;
        int k, i = 3;
        while (i <= n) {
            f[i] = n;
            k = 1;
            while (k * k * k <= i) {
                f[i] = min(f[i - k * k * k] + 1, f[i]);
                k++;
            }
            i++;
        }
        System.out.println(f[n]);
    }
}
