//     Author: Mohit Rajvardhan
//     Github: github.com/mohitrajvardhan17
// HackerRank: hackerrank.com/mohirajvardhan17

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println(scan.nextInt() / scan.nextInt());
        } catch (java.lang.ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        } catch (java.util.InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        }
        scan.close();
    }
}