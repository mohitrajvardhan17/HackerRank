//     Author: Mohit Rajvardhan
//     Github: github.com/mohitrajvardhan17
// HackerRank: hackerrank.com/mohirajvardhan17

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Read input */
        Scanner scan = new Scanner(System.in);
        double payment = scan.nextDouble();
        scan.close();

        /* Create NumberFormat instance for US, INDIA, CHINA & FRANCE Currency*/
        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);//Todo: Checck Implemenation of NumberFormat
        NumberFormat india  = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        /* Print output */
        System.out.println("US: "     + us.format(payment));
        System.out.println("India: "  + india.format(payment));
        System.out.println("China: "  + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}