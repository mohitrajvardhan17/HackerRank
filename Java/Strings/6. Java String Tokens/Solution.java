//     Author: Mohit Rajvardhan
//     Github: github.com/mohitrajvardhan17
// HackerRank: hackerrank.com/mohirajvardhan17

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Read input */
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        /*Applying the constraints*/
        if (str.length() <= 0 || str.length() > (4 * Math.pow(10, 5)) || str.matches("[^A-Za-z !,?._'@]+")) {
            return;
        } else {
            str = str.trim();
            String arr[]={};
            if(str.length() > 0){
                arr = str.split("[^a-zA-Z]+");
            }
            /* Print output */
            System.out.println(arr.length);
            for (String token : arr) {
                System.out.println(token);
            }
        }
    }
}