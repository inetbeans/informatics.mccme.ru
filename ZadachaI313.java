/*
http://informatics.mccme.ru/mod/statements/view3.php?id=277&chapterid=313#1
Задача №313. Биномиальные коэффициенты

Для биномиальных коэффициентов (числа сочетаний из n по k) 
хорошо известна рекуррентная формула: Cnk=Cn-1k-1+Cn-1k, Cn0=Cnn=1.
Входные данные
Вводится 2 числа - n и k.

Выходные данные
Необходимо вывести  значение Cnk.

Примеры
входные данные
4 2
выходные данные
6
 */
package informatics.mccme.ru;
import java.util.Scanner;

public class ZadachaI313 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        System.out.println(binom(n, k));
    }

    public static int binom(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return binom(n - 1, k - 1) + binom(n - 1, k);
        }
    }
}
