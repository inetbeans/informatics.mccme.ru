/*
http://informatics.mccme.ru/mod/statements/view3.php?id=282&chapterid=365#1
Задача №365. Заполнение спиралью

Дано число n. Создайте массив A[2*n+1][2*n+1] и заполните его по спирали, начиная с числа 0 в центральной клетке A[n+1][n+1]. Спираль выходит вверх, далее закручивается против часовой стрелки.
Входные данные
Программа получает на вход одно число n.

Выходные данные
Программа должна вывести  полученный массив, отводя на вывод каждого числа ровно 3 символа.

Примеры
входные данные
2
выходные данные
 12 11 10  9 24
 13  2  1  8 23
 14  3  0  7 22
 15  4  5  6 21
 16 17 18 19 20

 */
package informatics.mccme.ru;

import java.util.Scanner;

public class ZadachaJ365 {

    public static void main(String[] atr) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Vector v = new Vector(1, 0);// v=v(x,y);v=v(1,0) - горизонтальный единичный вектор,
                                    //                     а нам нужен вертикальный вектор,
                                    //                     но в самом начале он повернется против часовой стрелки
                                    //                     и станет вертикальным
        int k = 0;                  // счетчик k
        int N, M;                   // N,M - координаты числа k по осям x,y соответственно
        M = n;
        N = n;
        int[][] a = new int[2 * n + 1][2 * n + 1];
        int i = 0, j = 0;
        for (i = 0; i < 2 * n + 1; i++) {
            for (j = 0; j < 2 * n + 1; j++) {// заполнение массива
                a[i][j] = Integer.MIN_VALUE;//Integer.MIN_VALUE - означает что ячейка не занята
            }
        }
        for (i = 0; i < 2 * n + 1; i++) {
            for (j = 0; j < 2 * n + 1; j++) {
                a[M][N] = k++;
                if (a[M + v.rotate().y][N + v.rotate().x] != Integer.MIN_VALUE) {// если при повороте ячейка занята, то 
                    M += v.y;                                                    // придерживаемя старого направления,
                    N += v.x;                                                    //
                } else {                                                         // иначе поворачиваем вектор и
                    v = v.rotate();                                              // передвигаем точку вдоль него
                    M += v.y;
                    N += v.x;

                };

            }
        }
        print(a);// вывод результата
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

class Vector {

    int x, y;

    public Vector() {
        this.x = 0;
        this.y = 0;
    }

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Vector rotate() {// меняет направление вектора против часовой стрелки
        return new Vector(
                /*      (this.x) * 0 - (this.y) * 1,
                (this.x) * 1 + (this.y) * 0);
                 */
                (this.x) * 0 + (this.y) * 1,
                -(this.x) * 1 + (this.y) * 0);
    }

    public Vector unRotate() {// меняет направление вектора по часовой стрелке
        return new Vector(
                (this.x) * 0 - (this.y) * 1,
                (this.x) * 1 + (this.y) * 0);

    }
}
