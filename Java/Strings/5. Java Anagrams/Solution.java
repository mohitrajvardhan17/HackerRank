//     Author: Mohit Rajvardhan
//     Github: github.com/mohitrajvardhan17
// HackerRank: hackerrank.com/mohirajvardhan17

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Read input */
        Scanner scan = new Scanner(System.in);
        String strA = scan.next();
        String strB = scan.next();
        scan.close();
        /*Applying the constraints*/
        if (strA.length() > 50 || strB.length() > 50 || strA.matches("[^a-zA-z]+") || strB.matches("[^a-zA-z]+")) {
            return;
        } else {
            /* Print Output */
            if (isAnagram(strA, strB)) {
                System.out.println("Anagrams");
            } else {
                System.out.println("Not Anagrams");
            }
        }
    }

    public static boolean isAnagram(String strA, String strB) { //ToDo: REDO with efficiency
        boolean result = false;
        if (strA != null && strB != null && strA.length() != 0 && strB.length() != 0 && strA.length() == strB.length()) {
            strA = strA.toLowerCase();
            strB = strB.toLowerCase();
            char arr1[] = strA.toCharArray();
            char arr2[] = strB.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            strA = Arrays.toString(arr1);
            strB = Arrays.toString(arr2);
            if (strA.equals(strB)) {
                result = true;
            }
        }
        return result;
    }
}