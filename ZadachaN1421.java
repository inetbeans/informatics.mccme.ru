/*
http://informatics.mccme.ru/mod/statements/view3.php?id=248&chapterid=1421#1
Задача №1421. Удали пробелы
Дана строка, Вам требуется преобразовать все идущие подряд пробелы в один.
Входные данные
Длина строки не превосходит 1000.

Выходные данные
Выведите измененную строку.

Примеры
входные данные
 nz d urp lren s bwz  boom  t a   j    ho    vi
выходные данные
 nz d urp lren s bwz boom t a j ho vi
входные данные
   d  iz  czl l l h udq t 
выходные данные
 d iz czl l l h udq t 
*/
package informatics.mccme.ru;

public class ZadachaN1421 {

    public static void main(String[] args) {
        String str, newStr = "";
        int k = 0;
        java.util.Scanner in = new java.util.Scanner(System.in);
        str = in.nextLine();
        boolean allow=false;
        for (int i = 0; i < str.length(); i++) {
            if (isSpace(str.charAt(i))) {
                allow = true;
            } else {
                if (allow) {
                    newStr += " ";
                    allow = false;
                }
                newStr += str.charAt(i);
            }
        }
        System.out.println(newStr);
    }

    public static boolean isSpace(char s) {
        return s == ' ';
    }
}
