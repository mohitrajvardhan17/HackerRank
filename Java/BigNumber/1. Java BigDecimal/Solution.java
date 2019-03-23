//     Author: Mohit Rajvardhan
//     Github: github.com/mohitrajvardhan17
// HackerRank: hackerrank.com/mohirajvardhan17

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class Solution {
    public static void main(String[] args) {
        /* Read input */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        /*Applying the constraints*/
        if (n < 1 && n > 200) {
            return;
        }

        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scan.next();
        }
        scan.close();

        /*Applying the constraints and logic*/
        Comparator<String> customComparator = new Comparator<String>() {//ToDO: Check Custom Comparator
            @Override
            public int compare(String s1, String s2) {
                BigDecimal a = new BigDecimal(s1);
                BigDecimal b = new BigDecimal(s2);
                return b.compareTo(a); // descending order
            }
        };

        Arrays.sort(s, 0, n, customComparator);
        /* Print output */
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}