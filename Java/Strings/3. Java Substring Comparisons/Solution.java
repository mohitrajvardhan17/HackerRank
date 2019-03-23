//     Author: Mohit Rajvardhan
//     Github: github.com/mohitrajvardhan17
// HackerRank: hackerrank.com/mohirajvardhan17

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest  = s.substring(0, k);

        /*Applying the constraints*/
        if(s.length() < 1 || s.length() > 1000 || s.matches("[^A-Za-z]+")){
            return "";
        } else {
            for (int i = 0; i <= s.length() - k; i++) {
                String curr = s.substring(i, i + k);
                if (smallest.compareTo(curr) > 0){//ToDo: Check JAVA compareTo()
                    smallest = curr;
                }
                if (largest.compareTo(curr) < 0) {
                    largest = curr;
                }
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}