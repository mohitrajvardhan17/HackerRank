//     Author: Mohit Rajvardhan
//     Github: github.com/mohitrajvardhan17
// HackerRank: hackerrank.com/mohirajvardhan17

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Read input */
        Scanner scan = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = scan.next();
            int x = scan.nextInt();
            /* Print output */
            System.out.format("%-15s%03d%n", s1, x);//ToDo: Check System.out.format implementation
        }
        System.out.println("================================");
        scan.close();
    }
}