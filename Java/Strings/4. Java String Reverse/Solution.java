//     Author: Mohit Rajvardhan
//     Github: github.com/mohitrajvardhan17
// HackerRank: hackerrank.com/mohirajvardhan17

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Read input */
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        scan.close();
        /*Applying the constraints*/
        if (str.length() > 50) {
            return;
        } else {
            /* Print Outpot Method 1*/
            /**/
            str = str.toLowerCase();
            for (int start = 0, end = str.length() - 1; start < end; start++, end--) {
                if (str.charAt(start) != str.charAt(end)) {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
            /**/
            /* Print Outpot Method 2*/
            /**
            String reversed = new StringBuilder(str).reverse().toString();//ToDo: Check Usage
            System.out.println(str.equals(reversed) ? "Yes" : "No");
            /**/
        }
    }
}