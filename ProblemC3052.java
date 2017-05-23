import java.util.Scanner;
 
public class ProblemC3052 {
    public static StringBuilder result = new StringBuilder();
    static int o = 0;
 
    public static void hanoi(int n, int i, int j, int k) {
        if (k == 2) {
            if (n != 1) {
                hanoi(n, i, k, j);
                hanoi(n, k, j, i);
 
            } else {
                result.append(n).append(" ").append(i).append(" ").append(k).append("\n");
                result.append(n).append(" ").append(k).append(" ").append(j).append("\n");
            }
        } else {
            if (n != 1) {
                hanoi(n - 1, i, k, j);
                StringBuilder append = result.append(n).append(" ").append(i).append(" ").append(j).append("\n");
                hanoi(n - 1, k, j, i);
            } else {
                result.append(n).append(" ").append(i).append(" ").append(j).append("\n");
            }
        }
    }
 
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        hanoi(n, 1, 3, 2);
        System.out.println(result);
    }
}
