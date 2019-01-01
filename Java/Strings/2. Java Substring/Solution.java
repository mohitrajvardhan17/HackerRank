//     Author: Mohit Rajvardhan
//     Github: github.com/mohitrajvardhan17
// HackerRank: hackerrank.com/mohirajvardhan17

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Read input */
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int start = scan.nextInt();
        int end = scan.nextInt();
        scan.close();

        /*Applying the constraints*/
        if(start < 0 || end > str.length() || str.length() < 1 || str.length() > 100 || str.matches("[^A-Za-z]+")){
            return;
        } else {
            System.out.println(str.substring(start, end));
        }
    }
}