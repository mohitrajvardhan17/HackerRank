//     Author: Mohit Rajvardhan
//     Github: github.com/mohitrajvardhan17
// HackerRank: hackerrank.com/mohirajvardhan17

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Read input */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        /* Print output */
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (i * N));
        }
    }
}
