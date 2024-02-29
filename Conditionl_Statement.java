import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Conditionl_Statement {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (isWeird(N)) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
         scanner.close();
    }

    // Function to check if a number is weird
    public static boolean isWeird(int num) {
        if (num % 2 != 0) {
            // If the number is odd, it's definitely weird
            return true;
        } else {
            // If the number is even, it's weird if it falls within the range of 6 to 20
            return (num >= 6 && num <= 20);
        }
        
       
    }
}
