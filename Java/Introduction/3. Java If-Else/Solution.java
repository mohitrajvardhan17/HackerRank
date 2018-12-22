//     Author: Mohit Rajvardhan
//     Github: github.com/mohitrajvardhan17
// HackerRank: hackerrank.com/mohirajvardhan17

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Read input */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        /* Determine answer */
        String ans = "";
        if (n % 2 == 0) {
            if (n >= 2 && n <= 5) {
                ans = "Not Weird";
            } else if (n >= 6 && n <= 20) {
                ans = "Weird";
            } else if (n > 20) {
                ans = "Not Weird";
            }
        } else {
            ans = "Weird";
        }
        System.out.println(ans);
    }
}