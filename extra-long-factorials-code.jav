import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger faktorial=BigInteger.valueOf(1);
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        for(int i = 1; i<=n; i++){
            faktorial = faktorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(faktorial);
    }
}
