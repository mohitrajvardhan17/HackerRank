//     Author: Mohit Rajvardhan
//     Github: github.com/mohitrajvardhan17
// HackerRank: hackerrank.com/mohirajvardhan17

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        /* Read input */
        Scanner scan = new Scanner(System.in);
        int i = 1;

        /* Print output */
        while (scan.hasNextLine()) {
            System.out.println(i + " " + scan.nextLine());
            i++;
        }
        scan.close();
    }
}