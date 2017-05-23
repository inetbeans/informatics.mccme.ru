/*
http://informatics.mccme.ru/mod/statements/view3.php?id=282&chapterid=355
Задача №355. Симметричная ли матрица?

Проверьте, является ли двумерный массив симметричным относительно главной диагонали. 
Главная диагональ — та, которая идёт из левого верхнего угла двумерного массива в правый нижний.

Входные данные
Программа получает на вход число n   100, являющееся числом строк и столбцов в массиве. 
Далее во входном потоке идет n строк по n чисел, являющихся элементами массива.

Выходные данные
Программа должна выводить слово yes для симметричного массива и слово no для несимметричного.

Примеры
входные данные
3
0 1 2
1 5 3
2 3 4
выходные данные
yes

 */
//package informatics.mccme.ru;

import java.util.Scanner;

/**
 *
 * @author tima
 */
public class ZadachaB355 {

    public static void main(String[] atr) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = 0;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i][j] != a[j][i]) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
