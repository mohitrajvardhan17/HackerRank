//     Author: Mohit Rajvardhan
//     Github: github.com/mohitrajvardhan17
// HackerRank: hackerrank.com/mohirajvardhan17

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {
    public static void main(String[] args) {
        /* Read input */
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        while (testCases-- > 0) {
            String pattern = scan.nextLine();
            try {
                Pattern.compile(pattern);//ToDo: Check Pattern Class
                System.out.println("Valid");
            } catch (PatternSyntaxException pse) {
                System.out.println("Invalid");
            }
        }
        scan.close();
    }
}