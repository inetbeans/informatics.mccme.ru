
import java.util.Arrays;
import java.util.Scanner;

public class Задача224_Линейный_поиск_2 {
    public static void main(String[] args) {
            int [] a = new int [1000];
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int x = sc.nextInt();
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                if(x == a[i]){
                    System.out.println("YES");
                    System.exit(0);
                }
            }
            System.out.println("NO");
    }
}
