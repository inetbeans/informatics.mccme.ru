
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.DocFlavor;


public class Задача203Мячикналесенке {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException ex) {
            Logger.getLogger(Задача203Мячикналесенке.class.getName()).log(Level.SEVERE, null, ex);
        }
        double[] a = new double[n];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        if (n > 3) {
            for (int i = 3; i < n; i++) {
                a[i] = a[i - 3] + a[i - 2] + a[i - 1];
            }
        }
        System.out.println(Double.toString(a[n - 1]).replace(".0", ""));
    }
}
