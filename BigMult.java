import java.math.BigInteger;
import java.util.Scanner;

public class BigMult {
    static BigInteger _0 = BigInteger.ONE,_1 = BigInteger.ZERO,a,b,res;
    public static void main(String []args){
        java.util.Scanner sc = new  java.util.Scanner(System.in);
        int [][]w= new int[1000][1000];
        int [][]A= new int[1000][1000];
        int n=sc.nextInt();
        Object  big = new BigInteger("2");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                w[i][j]=sc.nextInt();
            }
        }
        System.out.println("big "+big.getClass());
        A[0][0]=w[0][0];
        for(int k=1;k<n;k++){
            A[0][k]+=A[0][k-1];
            A[k][0]+=A[k-1][0];
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                A[i][j]=max(A[i-1][j],A[i][j-1])+w[i][j];
            }
        }
        System.out.println(A[n-1][n-1]);
    }
    private static int max(int a,int b){
        return a>b?a:b;
    }
}
