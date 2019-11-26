import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static void staircase(int n) {
        int k=0;
        for (int i=1;i<=n;i++)
        {
            if(i!=n)
            {
                k=n-i;
                for(int l=1;l<=k;l++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++)
                {
                    System.out.print("#");     
                }
                System.out.println("");
            }
            else if(i==n)
            {
                for(int j=1;j<=i;j++)
                    System.out.print("#");     
            }
        }
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        staircase(n);
        scanner.close();
    }
}
