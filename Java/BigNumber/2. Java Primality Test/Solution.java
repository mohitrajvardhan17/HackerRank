//     Author: Mohit Rajvardhan
//     Github: github.com/mohitrajvardhan17
// HackerRank: hackerrank.com/mohirajvardhan17

import java.math.BigInteger;
import java.util.Scanner;


class Solution {
    public static void main(String[] args) {
        /* Read input */
        Scanner scan = new Scanner(System.in);
        BigInteger num = scan.nextBigInteger();
        scan.close();

        /*Applying the constraints*/
        if (num.toString().length() < 1 && num.toString().length() > 100) {
            return;
        }

        /* Print output */
        System.out.println(((num.isProbablePrime(10))?"prime":"not prime"));//ToDo: Check BigInteger.isProbablePrime(10)
    }
}