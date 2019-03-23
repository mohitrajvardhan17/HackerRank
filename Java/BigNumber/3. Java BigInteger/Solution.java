//     Author: Mohit Rajvardhan
//     Github: github.com/mohitrajvardhan17
// HackerRank: hackerrank.com/mohirajvardhan17


import java.math.BigInteger;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        /* Read input */
        Scanner scan = new Scanner(System.in);
        BigInteger num1 = scan.nextBigInteger();
        BigInteger num2 = scan.nextBigInteger();
        scan.close();

        /*Applying the constraints*/
        if (num1.compareTo(BigInteger.ZERO) < 0 || num2.compareTo(BigInteger.ZERO) < 0 || num1.toString().length() > 200 || num2.toString().length() > 200) {
            return;
        }

        /* Print output */
        System.out.println(num1.add(num2));
        System.out.println(num1.multiply(num2));
    }
}