/*
http://informatics.mccme.ru/mod/statements/view3.php?id=248&chapterid=2805#1
Задача №2805. Интересный перевод
На планете Роботов очень не любят десятичную систему счисления, 
поэтому они попросили Вас написать программу, которая заменяет 
все встречающиеся в тексте числа на эти же числа, но в двоичной системе счисления.

Входные данные
Единственная строка, состоящая из любых символов. 
Длина строки не превышает 255 символов. 
Гарантируется, что во всех числах нет ведущих нулей.

Примеры
входные данные
6^&678JKjdkdl;?.,lk879Pk1kdfl4839
выходные данные
110^&1010100110JKjdkdl;?.,lk1101101111Pk1kdfl1001011100111
 */
package informatics.mccme.ru;

public class ZadachaS2805 {

    public static void main(String[] args) {
        String str = new java.util.Scanner(System.in).nextLine();
        int n = str.length();
        boolean flag = false;
        String[] nmbrs = new String[n];
        String[] smbls = new String[n];

        int k = 0;
        for (int i = 0; i < n; i++) {
            nmbrs[i] = "";
            smbls[i] = "";
            char ch = str.charAt(i);
            if (isDigit(ch)) {
                nmbrs[k] += ch;
                flag = true;
            } else {
                if (flag) {
                    k++;
                    flag = false;
                }
                smbls[k] += ch;
            }
        }
        String answer = "";
        for (int i = 0; i <= k; i++) {
            if (!smbls[i].equals("")) {
                answer = answer.
                        concat(smbls[i]);
            }
            if (!nmbrs[i].equals("")) {
                answer = answer.concat(new java.math.BigInteger(nmbrs[i]).toString(2));
            }
        }
        System.out.println(answer);

    }

    public static boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }
}
