public class LCSdemo {

    public static void main(String[] args) {
        String str1="liuagsfljsvckjhw;oeifkhsvdfbliuwehlnblgoi";
        String str2 = "uw93inbfjdnjvidoishfioehfoiewbkdjbviohsofnbso";
                System.out.println(LCS(str1 , str2));
int i=str1.length();
        int j=str2.length();
        System.out.println(backtrack(c, str1.toCharArray(), str2.toCharArray(), i-1, j-1));
    }
    static int[][] c;

    public static int LCS(String str1, String str2) {

        int n1 = str1.length();
        int n2 = str2.length();
        int[][] C = new int[n1 + 1][n2 + 1];
        char[] x = str1.toCharArray();
        char[] y = str2.toCharArray();
        for (int i = 0; i < n1; i++) {
            C[i][0] = 0;
        }
        for (int i = 0; i < n2; i++) {
            C[0][i] = 0;
        }
        for (int i = 1; i < n1; i++) {
            for (int j = 1; j < n2; j++) {
                if (x[i] == y[j]) {
                    C[i][j] = C[i - 1][j - 1] + 1;
                } else {
                    C[i][j] = max(C[i - 1][j], C[i][j - 1]);
                }
            }
        }
        c = C;
        return C[n1 - 1][n2 - 1];

    }

    public static String backtrack(int[][] c, char[] x, char[] y, int i, int j) {
        if (i == 0 || j == 0) {
            return "";
        }
        if (x[i] == y[j]) {
            return backtrack(c, x, y, i - 1, j - 1) + x[i];
        } else {
            if (c[i][j - 1] > c[i - 1][j]) {
                return backtrack(c, x, y, i, j - 1) ;
            } else {
                return backtrack(c, x, y, i - 1, j);
            }
        }
    }

    private static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
