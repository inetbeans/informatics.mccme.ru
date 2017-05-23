import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class LongestCommonSubstring {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str1 = reader.readLine();
        String str2 = reader.readLine();
        System.out.println(lcs(str1, str2));
    }

    private static String lcs(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() == 0 || str2.length() == 0) {
            return "";
        }
        if (str1.equals(str2)) {
            return str1;
        }
        int[][] c = new int[str1.length()][str2.length()];
        int maxLength = 0, maxI = 0;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    if (i != 0 && j != 0) {
                        c[i][j] = c[i - 1][j - 1] + 1;
                    } else {
                        c[i][j] = 1;
                    }
                    if (c[i][j] > maxLength) {
                        maxLength = c[i][j];
                        maxI = i;
                    }
                }
            }
        }
        return str1.substring(maxI - maxLength + 1, maxI + 1);
    }

}
