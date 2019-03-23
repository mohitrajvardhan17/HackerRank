//     Author: Mohit Rajvardhan
//     Github: github.com/mohitrajvardhan17
// HackerRank: hackerrank.com/mohirajvardhan17

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Read input */
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();
        scan.close();

        /* Print output */
        System.out.println(A.length()+B.length());
        System.out.println((A.compareTo(B) > 0)?"Yes":"No");
        System.out.println(firstUpperLetter(A) + " " + firstUpperLetter(B));
    }

    private static String firstUpperLetter(String str) {
        if(str == null || str.isEmpty()){
            return "";
        } else {
            return str.substring(0,1).toUpperCase() + str.substring(1);//ToDo: String Camel Casing
        }
    }
}