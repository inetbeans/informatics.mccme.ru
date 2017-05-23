import java.util.Scanner;

/*
http://informatics.mccme.ru/mod/statements/view3.php?id=282&chapterid=1464#1
Задача №1464. Спираль
Требуется заполнить массив размера N × N единичками по спирали (начиная с верхнего левого угла по часовой стрелке, см. пример).

Входные данные
С клавиатуры вводится число N (нечетное, натуральное и не превышающее 50).

Выходные данные
Требуется вывести на экран построенную спираль.

Примеры
входные данные
7
выходные данные
1111111
0000001
1111101
1000101
1011101
1000001
1111111

 */
public class ZadachaO1464 {

    public static void main(String[] atr) {
        Scanner in = new Scanner(System.in);
        ;
        int n = in.nextInt();
        Vector v;
        v = new Vector(1, 0);
        int k = 0;
        int N = 0, M = 0;
        int[][] a = new int[n][n];
        int i = 0, j = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = -1;
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                M++;
                a[M][N] =1;
                
                if (a[M + 2*v.y][N + 2*v.x] == 1) {
                    v = v.unRotate();
                    M += v.y;
                    N += v.x;

                } else {
                    M += v.y;
                    N += v.x;

                };

            }
        }
        print(a);
    }

    public static void print(int[][] a) {
        for (int[] a1 : a) {
            for (int a2 : a1) {
                System.out.print(a2 + " ");
            }
            System.out.println();
        }
    }
}