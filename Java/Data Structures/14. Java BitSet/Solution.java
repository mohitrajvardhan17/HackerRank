//     Author: Mohit Rajvardhan
//     Github: github.com/mohitrajvardhan17
// HackerRank: hackerrank.com/mohirajvardhan17

import java.util.BitSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int nbits = scan.nextInt();
        int n = scan.nextInt();

        BitSet b1 = new BitSet(nbits);//ToDo: learn about BitSet
        BitSet b2 = new BitSet(nbits);

        for (int i = 0; i < n; i++) {
            String ops = scan.next();
            int param1 = scan.nextInt();
            int param2 = scan.nextInt();
            if (ops.equals("AND")) {
                if (param1 == 1 && param2 == 2) {
                    b1.and(b2);
                } else if (param1 == 2 && param2 == 1) {
                    b2.and(b1);
                } else if (param1 == 1 && param2 == 1) {
                    b1.and(b1);
                } else if (param1 == 2 && param2 == 2) {
                    b2.and(b2);
                }
            } else if (ops.equals("OR")) {
                if (param1 == 1 && param2 == 2) {
                    b1.or(b2);
                } else if (param1 == 2 && param2 == 1) {
                    b2.or(b1);
                } else if (param1 == 1 && param2 == 1) {
                    b1.or(b1);
                } else if (param1 == 2 && param2 == 2) {
                    b2.or(b2);
                }
            } else if (ops.equals("XOR")) {
                if (param1 == 1 && param2 == 2) {
                    b1.xor(b2);
                } else if (param1 == 2 && param2 == 1) {
                    b2.xor(b1);
                } else if (param1 == 1 && param2 == 1) {
                    b1.xor(b1);
                } else if (param1 == 2 && param2 == 2) {
                    b2.xor(b2);
                }
            } else if (ops.equals("FLIP")) {
                if (param1 == 1) {
                    b1.flip(param2);
                } else if (param1 == 2) {
                    b2.flip(param2);
                }
            } else if (ops.equals("SET")) {
                if (param1 == 1) {
                    b1.set(param2);
                } else if (param1 == 2) {
                    b2.set(param2);
                }
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
        scan.close();
    }
}
