//     Author: Mohit Rajvardhan
//     Github: github.com/mohitrajvardhan17
// HackerRank: hackerrank.com/mohirajvardhan17

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>() {
            @Override
            public String toString() {
                String result = "";
                for (Integer i : this) {
                    result += i + " ";
                }
                return result;
            }
        };
        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            String op = scan.next();
            if (op.equals("Insert")) {
                list.add(scan.nextInt(), scan.nextInt());
            } else if (op.equals("Delete")) {
                list.remove(scan.nextInt());
            }
        }
        scan.close();
        System.out.println(list);
    }
}
